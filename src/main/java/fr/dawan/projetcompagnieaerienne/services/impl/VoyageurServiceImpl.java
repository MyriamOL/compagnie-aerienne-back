package fr.dawan.projetcompagnieaerienne.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import fr.dawan.projetcompagnieaerienne.dtos.VoyageurDto;
import fr.dawan.projetcompagnieaerienne.entities.Voyageur;
import fr.dawan.projetcompagnieaerienne.repositories.VoyageurRepository;
import fr.dawan.projetcompagnieaerienne.services.VoyageurService;

public class VoyageurServiceImpl  implements VoyageurService{
    @Autowired
    private VoyageurRepository repository;
    @Autowired
    private ModelMapper mapper;
    
    
    
    @Override
    public List<VoyageurDto>getAllVoyageur(){
        return repository.findAll().stream().map(m -> mapper.map(m,VoyageurDto.class)).collect(Collectors.toList());
        
    }
    @Override
    public VoyageurDto getVoyageurById(long id) {
        Voyageur voyageur = repository.findById(id).get();
        return mapper.map(voyageur, VoyageurDto.class);
    }
    @Override
    public boolean deleteVoyageur(long id) {
        boolean isExist = repository.existsById(id);
        if (isExist) {
            repository.deleteById(id);
        }
        return isExist;
    }
    @Override
    public VoyageurDto saveOrUpdate(VoyageurDto voyageurDto) {
        Voyageur v = mapper.map(voyageurDto, Voyageur.class);
        Voyageur vr = repository.saveAndFlush(v);
        return mapper.map(vr, VoyageurDto.class);
    }
    


}
