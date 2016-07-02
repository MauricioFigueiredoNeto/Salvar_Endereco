package br.com.netshoes.question2.service.endereco;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.netshoes.question2.dao.endereco.EnderecoDAO;
import br.com.netshoes.question2.entity.endereco.EnderecoEntity;
import br.com.netshoes.question2.exception.cep.CEPInvalidoException;
import br.com.netshoes.question2.exception.endereco.EnderecoInvalidoException;
import br.com.netshoes.question2.service.cep.CEPService;

/**
 * Implementação do serviço para os metodos CRUD de endereço.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 *
 */
public class EnderecoServiceImpl implements EnderecoService {

	/**
	 * DAO de endereços.
	 */
	@Autowired
	private EnderecoDAO enderecoDAO;
	
	/**
	 * DAO de endereços.
	 */
	@Autowired
	private CEPService cepService;
	
	
	/**
	 * Salvar um endereço.
	 */
	public void salvar(EnderecoEntity endereco) throws EnderecoInvalidoException, CEPInvalidoException {
		
		// Validar CEP
		this.cepService.buscarEnderecoPorCEP(endereco.getCEP());
		
		// Salvar endereco
		this.enderecoDAO.salvar(endereco);
		
	}
	
	/**
	 * Selecionar um endereço pelo id.
	 */
	public void remover(String id) throws EnderecoInvalidoException {
		
		this.enderecoDAO.remover(id);
		
	}
	
	/**
	 * Selecionar um endereço pelo id.
	 */
	public EnderecoEntity selecionar(String id) throws EnderecoInvalidoException {
		
		return this.enderecoDAO.selecionar(id);
		
	}
	
	/**
	 * Listar endereços cadastrados.
	 */
	public Collection<EnderecoEntity> listar() {
		
		return this.enderecoDAO.listar();
		
	}
	
}
