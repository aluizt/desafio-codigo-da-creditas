package br.com.desafiocreditas.regrasemprestimo;

import br.com.desafiocreditas.cliente.ClienteModel;
import br.com.desafiocreditas.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;

import java.util.Optional;

public interface AnalisaCombinacao {

	public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel);
}
