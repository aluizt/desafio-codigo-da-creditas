package br.com.desafiocreditas.regrasemprestimo.commons.models;

import br.com.desafiocreditas.regrasemprestimo.commons.enuns.TipoEmprestimo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class PossibilidadeDeEmprestimoModel {
    private TipoEmprestimo tipo;
    private int taxa;
}
