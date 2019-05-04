package odl_web_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.douillet.odl_service_api.UtilisateurService;

import odl_web_model.Response;

@RestController
public class UtilisateurController {

	@Autowired
	UtilisateurService serviceutilisateur;

	@GetMapping(path = "/getAllUtilisateurs")
	public String getAllUtilisateurs(Model model) {
		model.addAttribute("utilisateurs", serviceutilisateur.getAllUtilisateur());
		return "utilisateurListDisplay";
	}

	@GetMapping(path = "/getSession", headers = "Accept=*/*")
	 public String currentUserNameSimple(Authentication authentication) {
        return "null";
    }
	@GetMapping(path = "/appVersion", headers = "Accept=*/*")
	 public Response getversion() {
		Response version = new Response(1,null,null);
		version.setMessage(getClass().getPackage().getImplementationVersion());	
		return version;
   }	
	 


}