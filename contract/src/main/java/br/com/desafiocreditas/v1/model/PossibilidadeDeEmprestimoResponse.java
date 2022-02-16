package br.com.desafiocreditas.v1.model;

import br.com.desafiocreditas.regrasemprestimo.commons.enuns.TipoEmprestimo;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PossibilidadeDeEmprestimoResponse {
    private Set<PossibilidadeDeEmprestimoResponse> possibilidades;
    private String nome;
    private TipoEmprestimo tipo;
    private int taxa;

    public PossibilidadeDeEmprestimoResponse(Set<PossibilidadeDeEmprestimoResponse> possibilidades, String nome) {
        this.possibilidades = possibilidades;
        this.nome = nome;
    }
}
