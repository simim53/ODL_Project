package com.douillet.odl_service_api;

import java.util.List;

import odl_hibernate_model.Utilisateur;



public interface UtilisateurService
{
    List<Utilisateur> getAllUtilisateur();
    
    Utilisateur getUtilisateur(int id);
    
    void addUtilisateur(Utilisateur utilisateur);
    
    void updateUtilisateur(Utilisateur utilisateur);
    
    void deleteUtilisateur(Utilisateur utilisateur);
    
    Utilisateur findUserByUsernameOrEmail(String loginOrEmail);
    
    
    
}