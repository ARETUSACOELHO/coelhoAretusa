package br.ifpe.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web.Model.Convidado;
import br.ifpe.web.Model.ConvidadoDAO;

@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoDAO convidadoDAO;

	@GetMapping("/listarConvidados")
	public String exibirLista(Model model) {
		model.addAttribute("lista", convidadoDAO.findAll(Sort.by("nome")));
		return "convidado/convidados-lista";
	}
	
	@GetMapping("/exibirForm2")
	public String exibirForm(Convidado convidado) {
		return "convidado/Form2";
	}
	
	@PostMapping("/salvarConvidado")
	public String salvarConvidado(Convidado convidado) {
		this.convidadoDAO.save(convidado);		
		return "redirect:/listarConvidados";
	}

	@GetMapping("/editarConvidado")
	public String editarConvidado(Integer codigo, Model model) {
		model.addAttribute("convidado", this.convidadoDAO.findById(codigo));
		return "convidado/Form2";
	}
	
	@GetMapping("/removerConvidado")
	public String removerConvidado(Integer codigo) {
		this.convidadoDAO.deleteById(codigo);
		return "redirect:/listarConvidados";
	}

}
