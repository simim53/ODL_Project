package odl_web_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.douillet.odl_service_api.UtilisateurService;
 


@Controller
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
    
        
}