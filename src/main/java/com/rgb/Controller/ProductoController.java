package com.rgb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rgb.model.entity.Pedido;
import com.rgb.service.PedidoService;





@Controller
@RequestMapping("/cotizaciones")

@SessionAttributes("cotizaciones")
public class ProductoController {
	@Autowired
	private PedidoService cotizacionService;
	
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Pedido> tb_cotizacion = cotizacionService.findAll();
			model.addAttribute("tb_cotizacion", tb_cotizacion);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/cotizaciones/inicio";
	}
}
