/**
 * 
 */
package br.com.netshoes.question2.service.cep;

import br.com.netshoes.question2.entity.endereco.EnderecoEntity;
import br.com.netshoes.question2.exception.cep.CEPInvalidoException;

/**
 * interface de negócio responsável ao CEP.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 *
 */
public interface CEPService {

	/**
	 * Buscar endereço por um CEP válido.
	 * 
	 * @param cep CEP.
	 * @throws CEPInvalidoException Erro ao buscar CEP.
	 */
	public EnderecoEntity buscarEnderecoPorCEP(String cep) throws CEPInvalidoException;
	
}
