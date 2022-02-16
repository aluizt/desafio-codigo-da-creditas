package br.com.desafiocreditas.commons.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VerificaSeTemaApenasUmaPalavraValidation implements ConstraintValidator<VerificaSeTemApenasUmaPalavra, String> {
    @Override
    public void initialize(VerificaSeTemApenasUmaPalavra constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.split(" ").length > 1;
    }
}
