package br.com.netshoes.question2.dao.cep;

import br.com.netshoes.question2.entity.endereco.EnderecoEntity;

/**
 * Interface no padrão DAO para busca de endereços pelo CEP.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 */
public interface CEPDao {
	
	/**
	 * Buscar endereço pelo CEP.
	 */
	public EnderecoEntity buscarEnderecoPorCEP(String cepCode);
	
	/**
	 * Incluir novo endereço pelo CEP.
	 */
	public void addEnderecoPorCEP(String cep, EnderecoEntity enderecoEntity);

	/**
	 * Remover endereço existente pelo CEP.
	 */
	public void removeEnderecoPorCEP(String cep, EnderecoEntity enderecoEntity);

}
