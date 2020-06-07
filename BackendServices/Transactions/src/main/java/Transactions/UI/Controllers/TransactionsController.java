package Transactions.UI.Controllers;

import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.UI.Models.ResponseModel;
import Transactions.UI.Models.TransactionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transaction")
public class TransactionsController {
    private Environment environment;


    @Autowired
    public TransactionsController(Environment environment ){
        this.environment = environment;
    }


    @GetMapping("/status")
    public String GetControllerStatus(){
        return "transaction controller says: i'm ok!";
    }


    @GetMapping("/{id}")
   public ResponseEntity<ResponseModel<TransactionModel>> GetTransactionById(@PathVariable long id)  throws ResourceNotFoundException {

       TransactionModel trx= new TransactionModel("205050");
        return ResponseEntity.ok().body(new ResponseModel<TransactionModel>("000","any message" , trx ));

    }

}
