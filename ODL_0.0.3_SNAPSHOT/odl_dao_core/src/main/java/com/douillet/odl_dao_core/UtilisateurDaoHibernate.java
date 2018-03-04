package com.douillet.odl_dao_core;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import com.douillet.odl_dao_api.UtilisateurDAO;

import odl_hibernate_model.Utilisateur;


public class UtilisateurDaoHibernate implements UtilisateurDAO {
	
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public Utilisateur getUtilisateur(int utilisateurId) {
		return sessionFactory.getCurrentSession().get(
				Utilisateur.class, utilisateurId);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> getUtilisateurs() {
		
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Utilisateur> criteria = builder.createQuery(Utilisateur.class);
		((Criteria) criteria).addOrder(Order.asc("login"));

		return   ((Criteria) criteria).list();
	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

}
