package sit.int204.classicmodelservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.FileNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(FileNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleFileNotFound(FileNotFoundException exception, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(), exception.getMessage(), request.getDescription(false).substring(4));
        errorResponse.addValidationError("field1","field 1 error bla bla");
        errorResponse.addValidationError("field2","field 2 error bla bla");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handlerNullPointer(RuntimeException exception,WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(), exception.getMessage(), request.getDescription(false).substring(4));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> handlerNumberFormat(RuntimeException exception,WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.CONFLICT.value(), exception.getMessage(), request.getDescription(false).substring(4));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handlerRuntime(RuntimeException exception,WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.CONFLICT.value(), exception.getMessage(), request.getDescription(false).substring(4));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }
}
