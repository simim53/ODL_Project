package odl_web_controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;
 


@RestController
public class UtilisateurController
{
	
    @Autowired
    UtilisateurService serviceutilisateur;
    

 
    @RequestMapping(value = "/getAllUtilisateurs", method = RequestMethod.GET)
    public String getAllUtilisateurs(Model model)
    {
        model.addAttribute("utilisateurs", serviceutilisateur.getAllUtilisateur());
        return "utilisateurListDisplay";
    }
    
    @RequestMapping(value = "*/getSession", method = RequestMethod.GET, headers="Accept=*/*")
    public String getSession(HttpSession session) {
    	//Utilisateur user = (Utilisateur) session.getAttribute("utilisateur");
      
    	return "test rest";
    }
    
        
}