package br.com.netshoes.question2.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import br.com.netshoes.question2.rest.exception.CEPInvalidoExceptionMapper;
import br.com.netshoes.question2.rest.exception.EnderecoInvalidoExceptionMapper;

/**
 * Configuração REST.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 *
 */
public class AppConfig extends ResourceConfig {

	/**
	 * Construtor padrão.
	 */
	public AppConfig() {
		register(RequestContextFilter.class);
		register(CEPResource.class);
		register(EnderecoResource.class);
		register(CEPInvalidoExceptionMapper.class);
		register(EnderecoInvalidoExceptionMapper.class);
	}
	
}
