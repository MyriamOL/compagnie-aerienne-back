package fr.dawan.projetcompagnieaerienne.services;

import java.util.List;

import fr.dawan.projetcompagnieaerienne.dtos.VoyageurDto;


public interface VoyageurService {

    List<VoyageurDto>getAllVoyageur();
    VoyageurDto getVoyageurById(long id);
    boolean deleteVoyageur(long id);
    VoyageurDto saveOrUpdate(VoyageurDto voyageurDto);
    
    
    
}
