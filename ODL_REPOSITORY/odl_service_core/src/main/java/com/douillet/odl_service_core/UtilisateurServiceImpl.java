package com.douillet.odl_service_core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_dao_api.UtilisateurDAO;
import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;


 
@Service
public class UtilisateurServiceImpl implements UtilisateurService {
 
	@Autowired
	UtilisateurDAO userdao;
    
	@Override
    @Transactional(readOnly=true)
	public List<Utilisateur> getAllUtilisateur() {
		
		return userdao.getUtilisateurs();
	}
}