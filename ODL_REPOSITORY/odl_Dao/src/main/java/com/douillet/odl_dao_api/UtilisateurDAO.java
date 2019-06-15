package com.douillet.odl_dao_api;

import odl_hibernate_model.Utilisateur;

import java.util.List;



public interface UtilisateurDAO {

	/**
	 * @param utilisateurId
	 * @return utilisateur
	 */
	Utilisateur getUtilisateur(int utilisateurId);

	/**
	 * @return List of utilisateurs
	 */
	List<Utilisateur> getUtilisateurs();

	/**
	 * @param utilisateur
	 */
	void updateUtilisateur(Utilisateur utilisateur);

	/**
	 * @param utilisateur
	 */
	void addUtilisateur(Utilisateur utilisateur);

	/**
	 * @param utilisateur
	 */
	void deleteUtilisateur(Utilisateur utilisateur);
	
	Utilisateur findUserByUsernameOrEmail(String usernameOrEmail);

	
}
