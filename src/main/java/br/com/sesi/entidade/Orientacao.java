package br.com.sesi.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entidade de orientação de uma questão.
 * 
 * @author Jefferson M Lima <jefferson.lima.rbr@gmail.com>
 * @since 06/06/2020
 *
 */
@Entity
@Table(name = "orientacao", schema = "sesi")
public class Orientacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "seq_orientacao", sequenceName = "seq_orientacao", allocationSize = 1, schema = "sesi")
	@GeneratedValue(generator = "seq_orientacao", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(columnDefinition = "text")
	private String texto;
	@Enumerated(EnumType.STRING)
	Resposta resposta;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Resposta getResposta() {
		return resposta;
	}
	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resposta == null) ? 0 : resposta.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orientacao other = (Orientacao) obj;
		if (resposta != other.resposta)
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Orientacao [resposta=" + resposta + "]";
	}
}
