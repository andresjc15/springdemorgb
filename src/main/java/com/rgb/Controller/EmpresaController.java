package com.rgb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.rgb.model.entity.Empresa;
import com.rgb.service.PedidoService;
import com.rgb.service.EmpresaService;


@Controller
@RequestMapping("/empresa")
@SessionAttributes("empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Empresa> empresas = empresaService.findAll();
			model.addAttribute("empresas", empresas);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/empresa/inicio";
	}

}
