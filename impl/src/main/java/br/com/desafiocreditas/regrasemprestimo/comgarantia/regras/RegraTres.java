package br.com.desafiocreditas.regrasemprestimo.comgarantia.regras;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.Taxas.TRES_PORCENTO;
import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.TipoEmprestimo.COM_GARANTIA;

/**
 * O salario tem de ser >= 5000, a idade tem de ser < 30
 */
@Component
public class RegraTres extends RegrasComGarantias {

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> analisa(ClienteModel clienteModel) {
        boolean salarioMaiorOuIqualA5000 = clienteModel.salarioMaiorOuIqualA(5000);
        boolean idadeMenorDoQue30 = clienteModel.idadeMenorDoQue(30);

        if (salarioMaiorOuIqualA5000 && idadeMenorDoQue30) {
            return Optional.of(PossibilidadeDeEmprestimoModel.builder()
                    .tipo(COM_GARANTIA)
                    .taxa(TRES_PORCENTO.getTaxa())
                    .build());
        }

        return Optional.empty();
    }
}
