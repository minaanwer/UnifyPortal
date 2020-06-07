package Transactions.UI.Controllers;

import Transactions.Service.TransactionService;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.UI.Models.ResponseModel;
import Transactions.UI.Models.TransactionModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
