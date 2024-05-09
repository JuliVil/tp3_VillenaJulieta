package ar.edu.fi.unju.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping({"/index","/home","/inicio"})
		public String getIndex() {
		return "index";
}
	
}
