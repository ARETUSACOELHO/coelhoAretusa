package br.ifpe.web.Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.domain.Sort;

@Entity
public class LocalEvento {

	@Id @GeneratedValue(strategy =GenerationType.AUTO)
	@Column(nullable=false)
	private Integer codigo;
	@Column(length = 30, nullable = false)
	@Embedded  
	private Endereco endereco;
	@Column(nullable=false)
	private boolean coberto;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	
	}
	public boolean getCoberto() {
		return coberto;
	}
	public void setCoberto(boolean coberto) {
		this.coberto = coberto;
	}
	public void save(LocalEvento localevento) {
		// TODO Auto-generated method stub
		
	}
	public Object findById(Integer codigo2) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object findAll1(Sort by) {
		// TODO Auto-generated method stub
		return null;
	}
	public void deleteById(Integer codigo2) {
		// TODO Auto-generated method stub
		
	}
	public Object findAll(Sort by) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
