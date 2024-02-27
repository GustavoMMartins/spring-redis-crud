package br.com.gustavom.crudredis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionHandlerDomain {

    private HttpStatus status;
    private String mensagem;
    private String causa;

}
