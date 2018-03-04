package com.douillet.odl_service_core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;

import com.douillet.odl_dao_api.UtilisateurDAO;

 

public class UilisateurServiceImpl implements UtilisateurService {
 
    @Autowired
    UtilisateurDAO userdao;
     
    @Transactional(readOnly = true)
	@Override
	public List<Utilisateur> getAllUtilisateur() {
		
		return userdao.getUtilisateurs();
	}
}