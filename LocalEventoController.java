package br.ifpe.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web.Model.LocalEvento;


@Controller
public class LocalEventoController {

	@Autowired
	private LocalEvento localevento;
	
	
	@GetMapping("/listarLocal")
	public String exibirLocal(Model model) {
		model.addAttribute("lista", localevento.findAll(Sort.by("nome")));
		return "LocalEvento/Local-lista";
	}
	
	@GetMapping("/exibirForm")
	public String exibirForm(LocalEvento localevento, Model model) {
		model.addAttribute("listarLocal", this.localevento.findAll(Sort.by("nome")));
		return "LocalEvento/Form";
	}
	
	@PostMapping("/salvarLocal")
	public String salvarLocal(LocalEvento localevento) {
		this.localevento.save(localevento);
		return "redirect:/listarLocal";
	}

	@GetMapping("/editarLocal")
	public String editarLocal(Integer codigo, Model model) {
		model.addAttribute("Local", this.localevento.findById(codigo));
		model.addAttribute("listaLocal", this.localevento.findAll(Sort.by("nome")));
		return "LocalEvento/Form";
	}

	@GetMapping("/removerLocal")
	public String removerLocal(Integer codigo) {
		this.localevento.deleteById(codigo);
		return "redirect:/listarLocal";
	}

}

