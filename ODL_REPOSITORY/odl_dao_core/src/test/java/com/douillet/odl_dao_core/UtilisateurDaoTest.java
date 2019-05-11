package com.douillet.odl_dao_core;

import org.junit.runner.RunWith;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	final static Logger logger = LogManager.getLogger(UtilisateurDaoTest.class);

	private String login = "test";
	private String password = "test";
	private String ville = "Laval";
	private String email = "test@email.com";

	private Utilisateur user = new Utilisateur();
	private Adresse adr = new Adresse();

	public UtilisateurDaoTest() {
		adr.setVille(ville);
		user.setLogin(password);
		user.setPassword(login);
		user.setAdresse(adr);
		user.setEmail(email);
	}

	@Autowired
	private UtilisateurDAO UtilisateurDAO;

	@Test
	@Transactional
	@Rollback(true)
	public void addUtilisateur() {

		UtilisateurDAO.addUtilisateur(user);
		Utilisateur userinbase = UtilisateurDAO.getUtilisateur(user.getUserID());

		Assert.assertSame(user.getLogin(), userinbase.getLogin());
		Assert.assertSame(user.getAdresse(), userinbase.getAdresse());
		Assert.assertSame(user.getEmail(), userinbase.getEmail());

	}

	@Test
	@Transactional
	@Rollback(true)
	public void findUserByUsernameOrEmail() {

		UtilisateurDAO.addUtilisateur(user);
		Utilisateur userinbase = UtilisateurDAO.findUserByUsernameOrEmail(user.getLogin());

		Assert.assertSame(user.getLogin(), userinbase.getLogin());

	}

}