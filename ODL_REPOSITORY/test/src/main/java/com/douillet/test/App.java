package com.douillet.test;

import java.util.List;

import odl_hibernate_model.Adresse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;

/**
 * Hello world!
 *
 */
@Transactional
public class App {

	@Autowired
	 private static SessionFactory sessionFactory;

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);


		System.out.println("debut test");


		UtilisateurService userService = context.getBean(UtilisateurService.class);

		List<Utilisateur> users = userService.getAllUtilisateur();
		for (Utilisateur user : users) {
			System.out.println("Id = " + user.getUserID());
			System.out.println("First Name = " + user.getLogin());
			System.out.println("adresse = " + (user.getAdresse() != null ? user.getAdresse().getVille() : "null"));
			System.out.println();
		}


		Adresse adresse1 = new Adresse(); adresse1.setVille("lavalaAAaa");

		Utilisateur user2 = new Utilisateur();
		user2.setLogin("TEZZZZZZAAAAZZZSSS");
		user2.setEmail("mail2@test.fr");
		user2.setPassword("AAAAAA18");
		user2.setAdresse(adresse1);

		System.out.println(" test = "+user2.getAdresse().getAdresseID());
		userService.addUtilisateur(user2);

		context.close();

		System.out.println("fin test");

	}

}
