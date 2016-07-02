package br.com.netshoes.question2.dao.endereco;

import java.util.Collection;

import br.com.netshoes.question2.entity.endereco.EnderecoEntity;
import br.com.netshoes.question2.exception.endereco.EnderecoInvalidoException;

/**
 * DAO pattern responsável pelo acesso à entidade Endereço.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 *
 */
public interface EnderecoDAO {

	/**
	 * Salvar um endereço.
	 */
	public void salvar(EnderecoEntity endereco) throws EnderecoInvalidoException;
	
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
