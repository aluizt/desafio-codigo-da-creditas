package br.com.desafiocreditas.commons.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ResponseEntity<CustomErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(CustomErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .httpStatus(HttpStatus.BAD_REQUEST.value())
                .error("Argumento invalido")
                .fieldsErrors(e.getFieldErrors().stream()
                        .map(violation -> FieldsError.builder()
                                .fieldName(violation.getField())
                                .messageErro(violation.getDefaultMessage())
                                .build())
                        .collect(Collectors.toList()))
                .build(),
                HttpStatus.BAD_REQUEST
        );
    }
}
