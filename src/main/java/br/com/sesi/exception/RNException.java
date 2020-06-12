package br.com.sesi.exception;

import javax.ejb.ApplicationException;

/**
 * Classe de exceção para as classes de regra de negócio
 * 
 * @author Jefferson Mendonça Lima <jefferson.lima.rbr@gmail.com>
 * @since 12/06/2020
 *
 */
@ApplicationException(rollback = true)
public class RNException extends Exception {

	private static final long serialVersionUID = 1L;

	public RNException(String mensagem) {
		super(mensagem);
	}
}
