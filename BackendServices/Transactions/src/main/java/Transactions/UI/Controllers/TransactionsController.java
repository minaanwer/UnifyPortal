package Transactions.UI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
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






}
