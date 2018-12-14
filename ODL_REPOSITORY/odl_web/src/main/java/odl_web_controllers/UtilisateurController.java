package odl_web_controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;

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
	public String getSession(HttpSession session) {
		 String login = (String) session.getAttribute("username");
		 
		 Utilisateur user = new Utilisateur();
		 user = serviceutilisateur.findUserByUsername(login)

		return user.getLogin();
	}

}