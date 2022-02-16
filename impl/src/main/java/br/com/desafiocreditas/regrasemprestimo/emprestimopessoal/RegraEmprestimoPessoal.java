package br.com.desafiocreditas.regrasemprestimo.emprestimopessoal;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.AnalisaCombinacao;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.Taxas.QUATRO_PORCENTO;
import static br.com.desafiocreditas.regrasemprestimo.commons.enuns.TipoEmprestimo.PESSOAL;

@Component
public class RegraEmprestimoPessoal implements AnalisaCombinacao {

    public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel) {
        return Optional.of(new PossibilidadeDeEmprestimoModel(PESSOAL, QUATRO_PORCENTO.getTaxa()));
    }
}
