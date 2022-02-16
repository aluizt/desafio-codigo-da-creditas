package br.com.desafiocreditas.regrasemprestimo.consignado;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.AnalisaCombinacao;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.Taxas.DOIS_PORCENTO;
import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.TipoEmprestimo.CONSIGNADO;

@Component
public class RegraDeEmprestimoConsignado implements AnalisaCombinacao {

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel) {
        if (clienteModel.salarioMaiorOuIqualA(5000)) {
            return Optional.of(new PossibilidadeDeEmprestimoModel(CONSIGNADO, DOIS_PORCENTO.getTaxa()));
        }
        return Optional.empty();
    }
}
