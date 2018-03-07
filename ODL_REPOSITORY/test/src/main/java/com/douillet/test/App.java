package com.douillet.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_service_api.UtilisateurService;

import odl_hibernate_model.Utilisateur;

/**
 * Hello world!
 *
 */
@Transactional
public class App {
	// private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*
		 * 
		 * try { StandardServiceRegistry standardRegistry = new
		 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 * Metadata metaData = new
		 * MetadataSources(standardRegistry).getMetadataBuilder().build();
		 * sessionFactory = metaData.getSessionFactoryBuilder().build();
		 * 
		 * Session session = sessionFactory.openSession();
		 * 
		 * Transaction tx = null; tx = session.beginTransaction();
		 * 
		 * 
		 * Utilisateur user1 = session.load(Utilisateur.class, 1);
		 * 
		 * //System.out.println(user1.getAge()); //System.out.println(user1.getNom());
		 * //System.out.println(user1.getPrenom());
		 * //System.out.println(user1.getLogin());
		 * 
		 * 
		 * 
		 * System.out.println(user1.getAdresse().getVille());
		 * 
		 * 
		 * Adresse adr = session.load(Adresse.class, 28);
		 * 
		 * 
		 * System.out.println(adr.getUtilisateurs().get(0).getLogin());
		 * System.out.println(adr.getUtilisateurs().get(1).getLogin());
		 * //System.out.println(adr.getUtilisateur().get(0).getLogin());
		 * 
		 * 
		 * Adresse adresse1 = new Adresse(); adresse1.setVille("lavalaAAaa");
		 * 
		 * Utilisateur user2 = new Utilisateur(); user2.setLogin("TEZZZZZZAAAAZZZSSS");
		 * user2.setPassword("AAAAAA18"); user2.setAdresse(adresse1);
		 * 
		 * Utilisateur user3 = new Utilisateur();
		 * user3.setLogin("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); user3.setPassword("A");
		 * user3.setAdresse(adresse1);
		 * 
		 * 
		 * // session.save(user2); // session.save(user3); tx.commit();
		 * 
		 * 
		 * 
		 * } catch (Throwable th) {
		 * System.err.println("Enitial SessionFactory creation failed" + th); throw new
		 * ExceptionInInitializerError(th); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println("test1");

		context.register(com.douillet.test.AppConfig.class);

		context.refresh();

		System.out.println("debut test");
		UtilisateurService userService = context.getBean(UtilisateurService.class);

		List<Utilisateur> users = userService.getAllUtilisateur();
		for (Utilisateur user : users) {
			System.out.println("Id = " + user.getUserID());
			System.out.println("First Name = " + user.getLogin());
			System.out.println("adresse = " + (user.getAdresse() != null ? user.getAdresse().getVille() : "null"));
			System.out.println();
		}

		context.close();

		System.out.println("fin test");

	}

}
