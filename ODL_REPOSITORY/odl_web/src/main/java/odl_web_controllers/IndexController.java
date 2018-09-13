package odl_web_controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {
	
	  @GetMapping("/login")
	  public String index(Model model, Principal principal) {
		  System.out.println("test");
	    model.addAttribute("message", "vous êtes maintenant connecté en tant que : " + principal.getName() );
	    return "utilisateurListDisplay";
	  }

}
