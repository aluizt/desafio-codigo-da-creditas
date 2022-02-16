package br.com.desafiocreditas.commons.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Repeatable(VerificaSeTemApenasUmaPalavra.List.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = VerificaSeTemaApenasUmaPalavraValidation.class)
public @interface VerificaSeTemApenasUmaPalavra {
    String message() default "O atributo deve conter ao menos duas palavras";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface List {
        VerificaSeTemApenasUmaPalavra[] value();
    }
}
