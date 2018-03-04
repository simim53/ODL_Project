package com.douillet.odl_dao_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import odl_hibernate_model.Utilisateur;

@Repository
@Qualifier("UtilisateurDAO")
public interface UtilisateurDAO {

	/**
	 * @param utilisateurid
	 * @return utilisateur
	 */
	public Utilisateur getUtilisateur(int utilisateurId);

	/**
	 * @return List of utilisateurs
	 */
	public List<Utilisateur> getUtilisateurs();

	/**
	 * @param utilisateur
	 */
	public void updateUtilisateur(Utilisateur utilisateur);

	/**
	 * @param utilisateur
	 */
	public void addUtilisateur(Utilisateur utilisateur);

	/**
	 * @param utilisateur
	 */
	public void deleteUtilisateur(Utilisateur utilisateur);

}
