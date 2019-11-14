package br.ifpe.web.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalEventoDAO extends JpaRepository<LocalEvento, Integer> {
	
}