package odl_web_controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class IndexController {
	
	/*  @GetMapping("/login")
	  public String index(Model model, Principal principal) {
		  System.out.println("test");
	    model.addAttribute("message", "vous êtes maintenant connecté en tant que : " + principal.getName() );
	    return "utilisateurListDisplay";
	  }*/
	
	@RequestMapping(value = "/index")
    public ModelAndView index() {
	   ModelAndView mv= new ModelAndView("index");
	      
        return mv;
    }

}
