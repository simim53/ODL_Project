package com.douillet.odl_service_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douillet.odl_dao_api.UtilisateurDAO;

import odl_hibernate_model.Utilisateur;

@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {

		@Autowired
		 private UtilisateurDAO userDetailsDao;


	  @Transactional(readOnly = true)
	  @Override
	  public UserDetails loadUserByUsername(String username){
		
	    Utilisateur user =  userDetailsDao.findUserByUsername(username);
	    
	    UserBuilder builder = null;
	    if (user != null) {
	      
	      builder = org.springframework.security.core.userdetails.User.withUsername(username);
	      builder.disabled(false);
	      builder.password(user.getPassword());
	      builder.roles("ADMIN");
	      
	      
	    } else {
	      throw new UsernameNotFoundException("User not found.");
	    }
	    return builder.build();
	  }
	}


