package br.ifpe.web.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoDAO extends JpaRepository<Convidado, Integer> {

	public @interface Convidado {

	}
}
