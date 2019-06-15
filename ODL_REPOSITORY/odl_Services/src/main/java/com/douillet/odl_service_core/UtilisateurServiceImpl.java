package com.douillet.odl_service_core;

import com.douillet.odl_dao_api.UtilisateurDAO;
import com.douillet.odl_service_api.UtilisateurService;
import odl_hibernate_model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UtilisateurService")
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurDAO userdao;

    @Autowired
    public UtilisateurServiceImpl(UtilisateurDAO userdao) {
        this.userdao = userdao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Utilisateur> getAllUtilisateur() {
        return userdao.getUtilisateurs();
    }

    @Override
    @Transactional(readOnly = true)
    public Utilisateur getUtilisateur(int id) {
        return userdao.getUtilisateur(id);
    }

    @Override
    @Transactional
    public void addUtilisateur(Utilisateur utilisateur) {
        userdao.addUtilisateur(utilisateur);

    }

    @Override
    @Transactional
    public void updateUtilisateur(Utilisateur utilisateur) {
        userdao.updateUtilisateur(utilisateur);

    }

    @Override
    @Transactional
    public void deleteUtilisateur(Utilisateur utilisateur) {
        userdao.deleteUtilisateur(utilisateur);

    }

    @Override
    @Transactional
    public Utilisateur findUserByUsernameOrEmail(String loginOrEmail) {
        return userdao.findUserByUsernameOrEmail(loginOrEmail);

    }


}