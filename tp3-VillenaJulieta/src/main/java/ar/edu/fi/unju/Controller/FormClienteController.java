package ar.edu.fi.unju.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class FormClienteController {
	
	@GetMapping({"/formulario"})
		public String getFormCliente() {
		return "form-cliente";
	}
}
