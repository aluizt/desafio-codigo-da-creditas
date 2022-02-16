package br.com.desafiocreditas.v1.mapper;

import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import br.com.desafiocreditas.v1.model.ClienteRequest;
import br.com.desafiocreditas.v1.model.ModalidadeDeEmprestimoResponse;
import br.com.desafiocreditas.v1.model.PossibilidadeDeEmprestimoResponse;

import java.util.Set;
import java.util.stream.Collectors;

public class ModalidadeDeEmprestimoMapper {

    public static ModalidadeDeEmprestimoResponse mapToModalidadeDeEmprestimoResponse(
            Set<PossibilidadeDeEmprestimoModel> possibilidadeDeEmprestimoModel,
            ClienteRequest clienteRequest
    ) {
        return ModalidadeDeEmprestimoResponse.builder()
                .emprestimos(possibilidadeDeEmprestimoModel.stream()
                        .map(ModalidadeDeEmprestimoMapper::mapFromPossibilidadeDeEmprestimoModel)
                        .collect(Collectors.toSet())
                )
                .nome(clienteRequest.getNome())
                .build();
    }

    private static PossibilidadeDeEmprestimoResponse mapFromPossibilidadeDeEmprestimoModel(
            PossibilidadeDeEmprestimoModel possibilidadeDeEmprestimoModel
    ) {
        return PossibilidadeDeEmprestimoResponse.builder()
                .taxa(possibilidadeDeEmprestimoModel.getTaxa())
                .tipo(possibilidadeDeEmprestimoModel.getTipo())
                .build();
    }
}
