package com.douillet.odl_dao_core;

import org.junit.runner.RunWith;

import java.util.List;

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

@ContextConfiguration(classes = com.douillet.odl_config.contextConfig.class )
@RunWith(SpringJUnit4ClassRunner.class)
public class UtilisateurDaoTest  {

 
	    @Autowired
	    private UtilisateurDAO UtilisateurDAO;
	 
	     
	    @Test
	    @Transactional
	    @Rollback(true)
	    public void testAddutilisateur()
	    {
	    	Utilisateur user = new Utilisateur();
	    	Adresse adr = new Adresse();
	    	
	    	adr.setVille("Laval");
	    	user.setLogin("test");
	    	user.setPassword("test");
	    	user.setAdresse(adr);
	    	
	    	UtilisateurDAO.addUtilisateur(user);
	    	
	    	
	    	Utilisateur userinbase = UtilisateurDAO.getUtilisateur(user.getUserID());
	    	    	 
	    	Assert.assertSame(user.getLogin(),userinbase.getLogin());
	    	Assert.assertSame(user.getAdresse(),userinbase.getAdresse());
	        
	    }
	    
	 }