package com.douillet.odl_dao_core;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_dao_api.UtilisateurDAO;

import odl_hibernate_model.Utilisateur;

@Repository
@Transactional(readOnly=true)
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

	@SuppressWarnings("unchecked")
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
