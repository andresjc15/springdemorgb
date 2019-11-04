package com.rgb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.rgb.model.entity.Pedido;
import com.rgb.service.PedidoService;



@Controller
@RequestMapping("/pedido")

@SessionAttributes("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Pedido> pedidos = pedidoService.findAll();
			model.addAttribute("pedidos", pedidos);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/pedido/inicio";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("pedido") Pedido pedido, 
			Model model, SessionStatus status) {
		try {
			pedidoService.save(pedido);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/pedido";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		Pedido pedido = new Pedido();
		model.addAttribute("pedido", pedido);

		return "/pedido/nuevo";
	}

}
