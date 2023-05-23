package fr.dawan.projetcompagnieaerienne.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.projetcompagnieaerienne.dtos.UtilisateurDto;

import fr.dawan.projetcompagnieaerienne.entities.Utilisateur;
import fr.dawan.projetcompagnieaerienne.repositories.UtilisateurRepository;
import fr.dawan.projetcompagnieaerienne.services.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    
    @Autowired
    private UtilisateurRepository repository;
    @Autowired
    private ModelMapper mapper;
    
    
    @Override
    public List<UtilisateurDto>getAllUtilisateur(){
        return repository.findAll().stream().map(m -> mapper.map(m,UtilisateurDto.class)).collect(Collectors.toList());
        
    }
    
    @Override
    public UtilisateurDto getUtilisateurById(long id) {
       Utilisateur utilisateur = repository.findById(id).get();
       return mapper.map(utilisateur, UtilisateurDto.class);
    }
    
    @Override
    public boolean deleteUtilisateur(long id) {
        boolean isExist = repository.existsById(id);
        if (isExist) {
            repository.deleteById(id);
        }
        return isExist;
    }
    @Override
    public UtilisateurDto saveOrUpdate(UtilisateurDto utilisateurDto) {
        Utilisateur u = mapper.map(utilisateurDto, Utilisateur.class);
        Utilisateur ur = repository.saveAndFlush(u);
        return mapper.map(ur, UtilisateurDto.class);
    }
    

}
