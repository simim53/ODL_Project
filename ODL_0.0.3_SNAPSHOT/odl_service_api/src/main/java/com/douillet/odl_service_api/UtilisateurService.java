package com.douillet.odl_service_api;

import java.util.List;

import org.springframework.stereotype.Service;

import odl_hibernate_model.Utilisateur;



public interface UtilisateurService
{
    public List<Utilisateur> getAllUtilisateur();
}