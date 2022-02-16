package br.com.desafiocreditas;

import br.com.desafiocreditas.analisador.AnalisadorDeEmprestimos;
import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class PossibilidadeDeEmprestimoFacadeImpl {
    private final AnalisadorDeEmprestimos analisadorDeEmprestimos;

    public PossibilidadeDeEmprestimoFacadeImpl(AnalisadorDeEmprestimos analisadorDeEmprestimos) {
        this.analisadorDeEmprestimos = analisadorDeEmprestimos;
    }

    public Set<PossibilidadeDeEmprestimoModel> buscaPorCombinacao(ClienteModel clienteModel) {
        return analisadorDeEmprestimos.buscaPorCombinacao(clienteModel);
    }
}
