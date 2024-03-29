package Transactions.Shared.Exceptions;

import Transactions.Shared.Exceptions.ErrorDetails;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.UI.Models.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        ResponseModel<ErrorDetails> responseModel = new ResponseModel<>("001","any custom error msg", errorDetails);
        return new ResponseEntity<>(responseModel, HttpStatus.NOT_FOUND);
    }


        @ExceptionHandler(NoHandlerFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public ResponseEntity<ResponseModel> handleNoHandlerFound(NoHandlerFoundException ex, WebRequest request) {
            ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
            ResponseModel<ErrorDetails> ResponseModel = new ResponseModel<>("001","any custom error msg", errorDetails);
            return new ResponseEntity<>(ResponseModel,HttpStatus.NOT_FOUND);
        }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
      //todo : remove exception message , return General Issue to the Customer , we keep it for debug purposes.
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        ResponseModel<ErrorDetails> responseModel = new ResponseModel<>("999","any custom error msg", errorDetails);
        return new ResponseEntity<>(responseModel, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
