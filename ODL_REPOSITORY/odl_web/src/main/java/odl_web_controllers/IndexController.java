package odl_web_controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
class IndexController {
	
	final Logger logger = Logger.getLogger(IndexController.class);
	
	/*  @GetMapping("/login")
	  public String index(Model model, Principal principal) {
		  System.out.println("test");
	    model.addAttribute("message", "vous êtes maintenant connecté en tant que : " + principal.getName() );
	    return "utilisateurListDisplay";
	  }*/
	
	
	@GetMapping(path = "/index")  
    public String index() {
		return  ("index");
    }
	
	/*
	 @RequestMapping(method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
	        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	        return "index";
	    }
	 
	 @ResponseBody
	 @RequestMapping(value = "/index", method = RequestMethod.GET)
	    public String sayHelloAgain(ModelMap model) {
	        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
	        return "index";
	    }
	
	*/

}
