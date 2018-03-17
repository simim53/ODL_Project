package odl_web_security;

import odl_hibernate_model.Utilisateur;

public interface UserDetailsDao {
  Utilisateur findUserByUsername(String username);
}