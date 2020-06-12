package br.com.sesi.exception;

import javax.ejb.ApplicationException;

/**
 * Classe de exceção de validação
 * 
 * @author Jefferson Mendonça Lima <jefferson.lima.rbr@gmail.com>
 * @since 12/06/2020
 *
 */
@ApplicationException(rollback = true)
public class ValidatorException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValidatorException(String excecao) {
		super(excecao);
	}
	
}
