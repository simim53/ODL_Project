package odl_web_security;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import odl_hibernate_model.Utilisateur;

@Repository("UserDetailsDao")
public class UserDetailsDaoImp implements UserDetailsDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public Utilisateur findUserByUsername(String username) {
   
		CriteriaBuilder cb = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Utilisateur> cq = cb.createQuery(Utilisateur.class);
		Root<Utilisateur> rootEntry = cq.from(Utilisateur.class);
		cq.select(rootEntry).where(cb.equal(rootEntry.get("login"), username));
		Query<Utilisateur> q = sessionFactory.getCurrentSession().createQuery(cq);
		
		Utilisateur user = q.getSingleResult();
	  	  
	  return user;
  }
}