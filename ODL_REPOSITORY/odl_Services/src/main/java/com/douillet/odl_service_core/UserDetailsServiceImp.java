package com.douillet.odl_service_core;

import com.douillet.odl_dao_api.UtilisateurDAO;
import odl_hibernate_model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    public UtilisateurDAO userDetailsDao;


    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) {

        Utilisateur user = userDetailsDao.findUserByUsernameOrEmail(usernameOrEmail);

        UserBuilder builder;
        if (user != null) {

            builder = org.springframework.security.core.userdetails.User.withUsername(usernameOrEmail);
            builder.disabled(false);
            builder.password(user.getPassword());
            builder.roles("ADMIN");


        } else {
            throw new UsernameNotFoundException("User not found.");
        }
        return builder.build();
    }
}


