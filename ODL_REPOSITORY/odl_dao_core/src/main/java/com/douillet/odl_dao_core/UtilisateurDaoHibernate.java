package com.douillet.odl_dao_core;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_dao_api.UtilisateurDAO;

import odl_hibernate_model.Utilisateur;

@Repository("UtilisateurDAO")
@Transactional
public class UtilisateurDaoHibernate implements UtilisateurDAO {
	

	@Autowired(required = true)
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Utilisateur getUtilisateur(int utilisateurId) {
		return sessionFactory.getCurrentSession().get(Utilisateur.class, utilisateurId);
	}

	
	@Override
	public List<Utilisateur> getUtilisateurs() {

		CriteriaBuilder cb = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Utilisateur> cq = cb.createQuery(Utilisateur.class);
		Root<Utilisateur> rootEntry = cq.from(Utilisateur.class);
		CriteriaQuery<Utilisateur> all = cq.select(rootEntry);
		TypedQuery<Utilisateur> allQuery = sessionFactory.getCurrentSession().createQuery(all);
		return allQuery.getResultList();

	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur) {
				
		sessionFactory.getCurrentSession().update(utilisateur);

	}

	@Override
	public void addUtilisateur(Utilisateur utilisateur) {
		
		sessionFactory.getCurrentSession().persist(utilisateur);

	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) {

		sessionFactory.getCurrentSession().delete(utilisateur);
		
		//to do :  supprimer l'adresse
		
	}


}
