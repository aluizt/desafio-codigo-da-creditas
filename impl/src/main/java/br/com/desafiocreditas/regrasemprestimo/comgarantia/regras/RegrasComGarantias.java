package br.com.desafiocreditas.regrasemprestimo.comgarantia.regras;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;

import java.util.Optional;

public abstract class RegrasComGarantias {
    private RegrasComGarantias proxima;

    public RegrasComGarantias getProxima(RegrasComGarantias proxima){
        this.proxima = proxima;
        return proxima;
    }

    public abstract Optional<PossibilidadeDeEmprestimoModel> analisa(ClienteModel clienteModel);

}
