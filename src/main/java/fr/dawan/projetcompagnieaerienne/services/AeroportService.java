package fr.dawan.projetcompagnieaerienne.services;

import java.util.List;

import fr.dawan.projetcompagnieaerienne.dtos.AeroportDto;


public interface AeroportService {

    
    List<AeroportDto>getAllAeroport();
    AeroportDto getAeroportById(long id);
    boolean deleteAeroport(long id);
    AeroportDto saveOrUpdate(AeroportDto aeroportDto);
    
}
