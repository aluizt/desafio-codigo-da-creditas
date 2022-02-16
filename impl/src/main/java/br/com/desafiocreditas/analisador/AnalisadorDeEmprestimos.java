package br.com.desafiocreditas.analisador;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.AnalisaCombinacao;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class AnalisadorDeEmprestimos {

    private final Set<AnalisaCombinacao> analisadoresDeCombinacao;

    public AnalisadorDeEmprestimos(Set<AnalisaCombinacao> analisadoresDeCombinacao) {
        this.analisadoresDeCombinacao = analisadoresDeCombinacao;
    }

    public Set<PossibilidadeDeEmprestimoModel> buscaPorCombinacao(ClienteModel clienteModel) {
        return analisadoresDeCombinacao
                .stream()
                .map(analisador -> analisador.aceita(clienteModel))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());
    }
}
