package br.com.netshoes.question2.service.endereco;

import java.util.Collection;

import br.com.netshoes.question2.entity.endereco.EnderecoEntity;
import br.com.netshoes.question2.exception.cep.CEPInvalidoException;
import br.com.netshoes.question2.exception.endereco.EnderecoInvalidoException;

/**
 * Interface do serviço para os metodos CRUD de endereço.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 *
 */
public interface EnderecoService {
	
	/**
	 * Salvar um endereço.
	 */
	public void salvar(EnderecoEntity endereco) throws EnderecoInvalidoException, CEPInvalidoException;
	
	/**
	 * Selecionar um endereço pelo id.
	 */
	public void remover(String id) throws EnderecoInvalidoException;
	
	/**
	 * Selecionar um endereço pelo id.
	 */
	public EnderecoEntity selecionar(String id) throws EnderecoInvalidoException;
	
	/**
	 * Listar endereços cadastrados.
	 */
	public Collection<EnderecoEntity> listar();

}
