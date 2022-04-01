package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import entidades.Cliente;
import servicios.ClienteService;

@Controller
public class ClienteControlador {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public String mostrarTodos(Model modelAndView) {
		

		List<Cliente> listaClientes = clienteService.buscarTodos();
		
		modelAndView.addAttribute("listaClientes", listaClientes);
		
		return "mostrarListaClientesView";
	}
	
	
}
