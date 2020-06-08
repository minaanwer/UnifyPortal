/*
package Transactions.Shared.ExceptionHandlers;

import Transactions.Shared.Exceptions.ErrorDetails;
import Transactions.UI.Models.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

@RestControllerAdvice
public class NotFoundGlobalExceptionHandler {
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ResponseModel> handleNoHandlerFound(NoHandlerFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        ResponseModel<ErrorDetails> ResponseModel = new ResponseModel<>("001","any custom error msg", errorDetails);
        return new ResponseEntity<>(ResponseModel,HttpStatus.NOT_FOUND);
    }
}
*/