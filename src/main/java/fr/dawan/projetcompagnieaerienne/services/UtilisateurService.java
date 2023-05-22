package fr.dawan.projetcompagnieaerienne.services;

import java.util.List;


import fr.dawan.projetcompagnieaerienne.dtos.UtilisateurDto;

public interface UtilisateurService {
    
    List<UtilisateurDto>getAllUtilisateur();
    UtilisateurDto getUtilisateurById(long id);
    boolean deleteUtilisateur(long id);
    UtilisateurDto saveOrUpdate(UtilisateurDto utilisateurDto);

}
