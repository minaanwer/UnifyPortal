package unify.portal.home.home.UI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unify.portal.home.home.UI.Model.StatusResponse;

@RestController
@RequestMapping("/api/v1/home")
@CrossOrigin("*")
public class HomeController {

    @Autowired
    private Environment env;


    @GetMapping("/status/check")
    public ResponseEntity<StatusResponse> statusCheck(){

       String message;
        try{
             message = "You Served by Home MC  ON Port  : " + env.getProperty("local.server.port") ;
        }
        catch (Exception ex){
            message = ex.getMessage();
        }
    return ResponseEntity.ok().body(new StatusResponse(message));
    }





}
