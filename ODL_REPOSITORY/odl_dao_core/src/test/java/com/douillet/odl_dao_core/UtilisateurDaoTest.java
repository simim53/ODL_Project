package com.douillet.odl_dao_core;

import org.junit.runner.RunWith;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_dao_api.UtilisateurDAO;

import odl_hibernate_model.Adresse;
import odl_hibernate_model.Utilisateur;

@ContextConfiguration(classes = com.douillet.odl_config.TestAppConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UtilisateurDaoTest {

	private String login = "test";
	private String password = "test";
	private String ville = "Laval";

	private Utilisateur user = new Utilisateur();
	private Adresse adr = new Adresse();

	public UtilisateurDaoTest() {
		adr.setVille(ville);
		user.setLogin(password);
		user.setPassword(login);
		user.setAdresse(adr);
	}

	@Autowired
	private UtilisateurDAO UtilisateurDAO;

	@Test
	@Transactional
	@Rollback(true)
	public void testAddutilisateur() {

		UtilisateurDAO.addUtilisateur(user);
		Utilisateur userinbase = UtilisateurDAO.getUtilisateur(user.getUserID());

		Assert.assertSame(user.getLogin(), userinbase.getLogin());
		Assert.assertSame(user.getAdresse(), userinbase.getAdresse());

	}

	@Test
	@Transactional
	@Rollback(true)
	public void findUtilisateurbyname() {

		UtilisateurDAO.addUtilisateur(user);
		Utilisateur userinbase = UtilisateurDAO.findUserByUsername(user.getLogin());

		Assert.assertSame(user.getLogin(), userinbase.getLogin());

	}

}