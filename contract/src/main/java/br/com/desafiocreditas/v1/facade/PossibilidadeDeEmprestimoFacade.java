package br.com.desafiocreditas.v1.facade;

import br.com.desafiocreditas.PossibilidadeDeEmprestimoFacadeImpl;
import br.com.desafiocreditas.v1.model.ClienteRequest;
import br.com.desafiocreditas.v1.model.ModalidadeDeEmprestimoResponse;
import org.springframework.stereotype.Component;

import static br.com.desafiocreditas.v1.mapper.ClienteMapper.mapToClienteModel;
import static br.com.desafiocreditas.v1.mapper.ModalidadeDeEmprestimoMapper.mapToModalidadeDeEmprestimoResponse;

@Component
public class PossibilidadeDeEmprestimoFacade {
    private final PossibilidadeDeEmprestimoFacadeImpl possibilidadeDeEmprestimoFacadeImpl;

    public PossibilidadeDeEmprestimoFacade(PossibilidadeDeEmprestimoFacadeImpl possibilidadeDeEmprestimoFacadeImpl) {
        this.possibilidadeDeEmprestimoFacadeImpl = possibilidadeDeEmprestimoFacadeImpl;
    }

    public ModalidadeDeEmprestimoResponse buscaPorCombinacao(ClienteRequest clienteRequest) {
        return mapToModalidadeDeEmprestimoResponse(
                possibilidadeDeEmprestimoFacadeImpl.buscaPorCombinacao(mapToClienteModel(clienteRequest)),
                clienteRequest
        );
    }
}
