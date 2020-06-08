package Transactions.UI.Controllers;

import Transactions.Service.TransactionService;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.DTO.TransactionSearchCriteriaDTO;
import Transactions.Shared.Exceptions.InvalidSearchCriteriaException;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.Shared.Extensions.ModelMapperExtension;
import Transactions.UI.Models.ResponseModel;
import Transactions.UI.Models.TransactionModel;
import Transactions.UI.Models.TransactionSearchCriteriaModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/status/check")
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
    public ResponseEntity<ResponseModel<List<TransactionModel>>> Search(@RequestBody TransactionSearchCriteriaModel transactionSearchCriteriaModel )
            throws InvalidSearchCriteriaException {
        TransactionSearchCriteriaDTO transactionSearchCriteriaDTO =  new ModelMapper().map(transactionSearchCriteriaModel,TransactionSearchCriteriaDTO.class);
        List<TransactionDTO> transactionDTOLst = transactionService.Search(transactionSearchCriteriaDTO);
        List<TransactionModel> transactionModelLst = new ModelMapperExtension().map(transactionDTOLst,TransactionModel.class);
        return ResponseEntity.ok().body(new ResponseModel<List<TransactionModel>>("000","any message" , transactionModelLst ));
    }

    @PostMapping("/{page}")
    public ResponseEntity<ResponseModel<Page<TransactionModel>>> SearchPaginated(@PathVariable("page") Long page , @RequestBody TransactionSearchCriteriaModel transactionSearchCriteriaModel )
            throws InvalidSearchCriteriaException {
        TransactionSearchCriteriaDTO transactionSearchCriteriaDTO =  new ModelMapper().map(transactionSearchCriteriaModel,TransactionSearchCriteriaDTO.class);
        Page<TransactionDTO> transactionDTOLst = transactionService.Search(transactionSearchCriteriaDTO,page);

        Page<TransactionModel> transactionModelLst  = new ModelMapperExtension().map(transactionDTOLst,TransactionModel.class);

        return ResponseEntity.ok().body(new ResponseModel<Page<TransactionModel>>("000","any message" , transactionModelLst ));
    }



}
