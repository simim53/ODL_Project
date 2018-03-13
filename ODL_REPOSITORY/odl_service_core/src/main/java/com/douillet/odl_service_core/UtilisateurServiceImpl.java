package com.douillet.odl_service_core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_dao_api.UtilisateurDAO;
import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;

@Service("UtilisateurService")
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	UtilisateurDAO userdao;

	@Override
	@Transactional(readOnly = true)
	public List<Utilisateur> getAllUtilisateur() {
		return userdao.getUtilisateurs();
	}

	@Override
	@Transactional(readOnly = true)
	public Utilisateur getUtilisateur(int id) {
		return userdao.getUtilisateur(id);
	}

	@Override
	@Transactional
	public void addUtilisateur(Utilisateur utilisateur) {		
		userdao.addUtilisateur(utilisateur);

	}

	@Override
	@Transactional
	public void updateUtilisateur(Utilisateur utilisateur) {		
		userdao.updateUtilisateur(utilisateur);

	}

	@Override
	@Transactional
	public void deleteUtilisateur(Utilisateur utilisateur) {
		userdao.deleteUtilisateur(utilisateur);

	}
}