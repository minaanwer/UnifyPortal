package Transactions.UI.Controllers;

import Transactions.Service.TransactionService;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.DTO.TransactionSearchCriteriaDTO;
import Transactions.Shared.Exceptions.InvalidSearchCriteriaException;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.Shared.Extensions.ModelMapperExtended;
import Transactions.UI.Models.ResponseModel;
import Transactions.UI.Models.TransactionModel;
import Transactions.UI.Models.TransactionSearchCriteriaModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transaction")
public class TransactionsController {
    private Environment environment;
    private TransactionService transactionService;

    @Autowired
    public TransactionsController(Environment environment , TransactionService transactionService ){
        this.transactionService = transactionService;
        this.environment = environment;
    }


    @GetMapping("/status")
    public String GetControllerStatus(){
        return "transaction controller says: i'm ok!";
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseModel<TransactionModel>> GetTransactionById(@PathVariable String id)  throws ResourceNotFoundException {
        TransactionDTO transactionDTO = transactionService.GetTransactionById(id);
        TransactionModel transactionModel = new ModelMapper().map(transactionDTO,TransactionModel.class);
        return ResponseEntity.ok().body(new ResponseModel<TransactionModel>("000","any message" , transactionModel ));
    }

    @PostMapping("")
    public ResponseEntity<ResponseModel<List<TransactionModel>>> SearchTransaction(@RequestBody TransactionSearchCriteriaModel transactionSearchCriteriaModel )
            throws InvalidSearchCriteriaException {
        TransactionSearchCriteriaDTO transactionSearchCriteriaDTO =  new ModelMapper().map(transactionSearchCriteriaModel,TransactionSearchCriteriaDTO.class);
        List<TransactionDTO> transactionDTOLst = transactionService.Search(transactionSearchCriteriaDTO);
        List<TransactionModel> transactionModelLst = new ModelMapperExtended().mapList(transactionDTOLst,TransactionModel.class);
        return ResponseEntity.ok().body(new ResponseModel<List<TransactionModel>>("000","any message" , transactionModelLst ));
    }


}
