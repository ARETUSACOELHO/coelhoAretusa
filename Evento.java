package br.ifpe.web.Model;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Evento {

	@Id  @GeneratedValue
	@Column(nullable=false)
	private Integer codigo;
	@Column(length = 30, nullable = false)
	private String nomeFesta;
	@Column(length = 30)
	private String localEvento;
	@Column(nullable=false)
	private Date data;
	@Column(nullable=false)
	private Time hora;


	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNomeFesta() {
		return nomeFesta;
	}
	public void setNomeFesta(String nomeFesta) {
		this.nomeFesta = nomeFesta;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}

}
	
		
	
