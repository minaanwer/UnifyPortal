package Transactions.UI.Controllers;

import Transactions.Shared.Exceptions.ResourceNotFoundException;
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
   public ResponseEntity<TransactionModel> GetTransactionById(@PathVariable long id)  throws ResourceNotFoundException {

       // Employee employee = employeeRepository.findById(id)
        //        .orElseThrow(()-> new ResourceNotFoundException("Employee is not found id : "+id));
        return ResponseEntity.ok().body(new TransactionModel("205050"));
    }

}
