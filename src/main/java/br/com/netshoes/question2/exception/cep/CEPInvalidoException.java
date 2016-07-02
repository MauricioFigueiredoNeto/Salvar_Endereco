package br.com.netshoes.question2.exception.cep;

/**
 * Exceção CEP inválido.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 *
 */
public class CEPInvalidoException extends Exception {

	/**
	 * Serial;
	 */
	private static final long serialVersionUID = -3205289088605739909L;

	/**
	 * Construtor.
	 * 
	 * @param message Mensagem de erro.
	 */
	public CEPInvalidoException(String message) {
		super(message);
	}

}
