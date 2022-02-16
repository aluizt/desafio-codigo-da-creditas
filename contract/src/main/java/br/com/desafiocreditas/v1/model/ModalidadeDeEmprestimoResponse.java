package br.com.desafiocreditas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModalidadeDeEmprestimoResponse {
    private String nome;
    private Set<PossibilidadeDeEmprestimoResponse> emprestimos;
}
