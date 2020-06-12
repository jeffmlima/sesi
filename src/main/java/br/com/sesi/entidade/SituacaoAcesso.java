package br.com.sesi.entidade;

/**
 * Enum das possíveis situações de acesso
 * 
 * @author Jefferson M Lima <jefferson.lima.rbr@gmail.com>
 * @since 06/06/2020
 *
 */
public enum SituacaoAcesso {
	
	ATIVO("Ativo"),
	INATIVO("Inativo"),
	BLOQUEADO("Bloqueado"),
	TROCAR_SENHA("Trocar Senha");
	
	private final String situacao;
	
	private SituacaoAcesso(String situacao) {
		this.situacao = situacao;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public boolean isAtivo() {
		return SituacaoAcesso.ATIVO.equals(this);
	}
	
	public boolean isInativo() {
		return SituacaoAcesso.INATIVO.equals(this);
	}

}
