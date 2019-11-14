package br.ifpe.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web.Model.Evento;

@Controller
public class EventoController {

	@Autowired
	private Evento evento;
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/listarEventos")
	public String exibirEvento(Model model) {
		model.addAttribute("lista", ((JpaRepository<Evento,Integer>) evento).findAll(Sort.by("nome")));
		return "Evento/Eventos-lista";
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/exibirForm1")
	public String exibirForm(Evento evento, Model model) {
		model.addAttribute("listarEvento", ((JpaRepository<Evento, Integer>) this.evento).findAll(Sort.by("nome")));
		return "LocalEvento/Form1";
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/salvarEvento")
	public String salvarEvento(Evento evento) {
		((CrudRepository<Evento, Integer>) this.evento).save(evento);
		return "redirect:/listarEventos";
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/editarEvento")
	public String editarEvento(Integer codigo, Model model) {
		model.addAttribute("Evento", ((CrudRepository<Evento, Integer>) this.evento).findById(codigo));
		return "Evento/Form1";
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/removerEvento")
	public String removerEvento(Integer codigo) {
		((CrudRepository<Evento, Integer>) this.evento).deleteById(codigo);
		return "redirect:/listarEventos";
	}

}

