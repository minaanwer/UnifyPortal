package Transactions.UI.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")

public class StatusCheckController {

    @Autowired
    private Environment environment;

    @GetMapping("status/check")
    public  String statusCheck(){
        return  "accounts Service says  :  i'm woorking .. on port "+ environment.getProperty("local.server.port");
    }

    @GetMapping("status/check/withnotoken")
    public  String statusCheckTemp(){
        return "temp is working";
    }


}
