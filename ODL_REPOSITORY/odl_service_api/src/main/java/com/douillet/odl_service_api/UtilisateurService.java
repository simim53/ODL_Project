package com.douillet.odl_service_api;

import java.util.List;

import odl_hibernate_model.Utilisateur;



public interface UtilisateurService
{
    public List<Utilisateur> getAllUtilisateur();
    
    public Utilisateur getUtilisateur(int id);
    
    public void addUtilisateur (Utilisateur utilisateur);
    
    public void updateUtilisateur (Utilisateur utilisateur);
    
    public void deleteUtilisateur (Utilisateur utilisateur);
    
    public Utilisateur findUserByUsernameOrEmail(String loginOrEmail);
    
    
    
}