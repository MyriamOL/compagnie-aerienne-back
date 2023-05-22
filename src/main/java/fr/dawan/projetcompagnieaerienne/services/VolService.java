package fr.dawan.projetcompagnieaerienne.services;

import java.util.List;

import fr.dawan.projetcompagnieaerienne.dtos.VolDto;

public interface VolService {
    
    List<VolDto>getAllVol();
    VolDto getVolById(long id);
    boolean deleteVol(long id);
    VolDto saveOrUpdate(VolDto volDto);
    

}
