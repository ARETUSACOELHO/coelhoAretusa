
package br.ifpe.web.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado {

	@Id @GeneratedValue
	@Column(nullable=false)
	private Integer codigo;
	@Column(length = 50)
	private String nomeConvidado;
	@Column(length = 30)
	private String evento;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nomeConvidado;
	}
	public void setNome(String nome) {
		this.nomeConvidado = nome;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	
}

