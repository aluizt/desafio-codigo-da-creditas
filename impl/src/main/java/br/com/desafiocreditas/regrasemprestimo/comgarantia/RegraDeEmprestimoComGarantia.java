package br.com.desafiocreditas.regrasemprestimo.comgarantia;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.AnalisaCombinacao;
import br.com.desafiocreditas.regrasemprestimo.comgarantia.regras.RegraUm;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RegraDeEmprestimoComGarantia implements AnalisaCombinacao {
    private final RegraUm regraUm;

    public RegraDeEmprestimoComGarantia(RegraUm regraUm) {
        this.regraUm = regraUm;
    }

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel) {
        return regraUm.analisa(clienteModel);
    }
}
