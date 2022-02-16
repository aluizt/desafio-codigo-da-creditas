package br.com.desafiocreditas.regrasemprestimo.comgarantia.regras;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.Taxas.TRES_PORCENTO;
import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.TipoEmprestimo.COM_GARANTIA;

/**
 * O salario tem de ser > 3000 e < 5000 e o cliente tem de ser de SP
 */
@Component
public class RegraDois extends RegrasComGarantias {
    private final RegraTres regraTres;

    public RegraDois(RegraTres regraTres) {
        this.regraTres = regraTres;
    }

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> analisa(ClienteModel clienteModel) {
        boolean salarioMaiorQue3000 = clienteModel.salarioMaiorQue(3000);
        boolean salarioMenorQue5000 = clienteModel.salarioMenorQue(5000);
        boolean ehDeSaoPaulo = clienteModel.ehDeSaoPaulo();

        if ((salarioMaiorQue3000
                && salarioMenorQue5000)
                && ehDeSaoPaulo) {
            return Optional.of(PossibilidadeDeEmprestimoModel.builder()
                    .tipo(COM_GARANTIA)
                    .taxa(TRES_PORCENTO.getTaxa())
                    .build());
        }
        return getProxima(regraTres).analisa(clienteModel);
    }
}

