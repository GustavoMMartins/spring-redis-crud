package br.com.gustavom.crudredis.controller.handler;

import br.com.gustavom.crudredis.domain.ExceptionHandlerDomain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleResourceNotFoundException(HttpMessageNotReadableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionHandlerDomain(HttpStatus.BAD_REQUEST, "Campos nos formatos inválidos.", ex.getLocalizedMessage()));
    }

}
