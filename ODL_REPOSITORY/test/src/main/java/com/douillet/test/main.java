package com.douillet.test;

/*
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import odl_hibernate_model.Utilisateur;
import odl_hibernate_model.Adresse;

public class main{

private static SessionFactory sessionFactory;
  public static void test(String args[]) throws Exception {
   
	  try {
			StandardServiceRegistry standardRegistry = 
		       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata metaData = 
		        new MetadataSources(standardRegistry).getMetadataBuilder().build();
			sessionFactory = metaData.getSessionFactoryBuilder().build();
		   
			Session session = sessionFactory.openSession();
			
			Transaction tx = null;
			tx = session.beginTransaction();

			
			Utilisateur user1 = session.load(Utilisateur.class, 1);
			
			//System.out.println(user1.getAge());
			//System.out.println(user1.getNom());
			//System.out.println(user1.getPrenom());
			//System.out.println(user1.getLogin());
			
			
			
			System.out.println(user1.getAdresse().getVille());
			
			
			Adresse adr = session.load(Adresse.class, 1);
			
			
			System.out.println(adr.getUtilisateur().getLogin());
			//System.out.println(adr.getUtilisateur().get(0).getLogin());
			
			
			Adresse adresse1 = new Adresse();
			adresse1.setVille("laval");
			
			Utilisateur user2  = new Utilisateur();
			user2.setLogin("test17st2");
			user2.setPassword("test18");
			user2.setAdresse(adresse1);
			
			Utilisateur user3 = new Utilisateur();
			user3.setLogin("test18");
			user3.setPassword("test2");
			user3.setAdresse(adresse1);
			
			
			session.save(user2);
			session.save(user3);
			tx.commit();
		
	  
	  
	  } catch (Throwable th) {
			System.err.println("Enitial SessionFactory creation failed" + th);
			throw new ExceptionInInitializerError(th);
		  }
    
  }
}

*/