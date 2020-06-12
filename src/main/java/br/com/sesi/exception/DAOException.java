package br.com.sesi.exception;

import javax.ejb.ApplicationException;

/**
 * Classe de exceção para as classes de repositório
 * 
 * @author Jefferson Mendonça Lima <jefferson.lima.rbr@gmail.com>
 * @since 12/06/2020
 *
 */
@ApplicationException(rollback=true)
public class DAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public DAOException(String excecao) {
		super(excecao);
	}

}
