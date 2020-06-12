package br.com.sesi.entidade;

/**
 * Enum das possíveis respostas de uma questão
 * 
 * @author Jefferson M Lima <jefferson.lima.rbr@gmail.com>
 * @since 06/06/2020
 *
 */
public enum Resposta {

	SIM("Sim"),
	NAO("Não"),
	TALVEZ("Talvez");
	
	private final String opcao;
	
	private Resposta(String opcao) {
		this.opcao = opcao;
	}
	
	public String getOpcao() {
		return this.opcao;
	}
	
	public boolean isSim() {
		return Resposta.SIM.equals(this);
	}
	
	public boolean isNao() {
		return Resposta.NAO.equals(this);
	}
	
	public boolean isTalvez() {
		return Resposta.TALVEZ.equals(this);
	}
}
