package br.ifpe.web.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoDAO extends JpaRepository<Evento, Integer> {
}
