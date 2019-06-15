package odl_web_controllers;

import com.douillet.odl_service_api.UtilisateurService;
import odl_web_model.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class UtilisateurController {
	
	final Logger logger = LogManager.getLogger(UtilisateurController.class);

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
		int annee = Calendar.getInstance().get(Calendar.YEAR);
		version.setMessage("Projet ODL "+ annee +" _ V." + getClass().getPackage().getImplementationVersion());
		return version;
   }	
	 
	@GetMapping(path = "/#/film", headers = "Accept=*/*" )
	   public String index2() {
		logger.debug("TEST Affichage page film");
	       return "accueil";
	   }
	


}