package br.com.desafiocreditas.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FieldsError {
    private String fieldName;
    private String messageErro;
}
