package fr.dawan.projetcompagnieaerienne.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import fr.dawan.projetcompagnieaerienne.dtos.AeroportDto;
import fr.dawan.projetcompagnieaerienne.dtos.VolDto;
import fr.dawan.projetcompagnieaerienne.entities.Aeroport;
import fr.dawan.projetcompagnieaerienne.entities.Vol;
import fr.dawan.projetcompagnieaerienne.repositories.AeroportRepository;
import fr.dawan.projetcompagnieaerienne.repositories.VolRepository;
import fr.dawan.projetcompagnieaerienne.services.VolService;

public class VolServiceImpl implements VolService{
    @Autowired
    private VolRepository repository;
    @Autowired
    private ModelMapper mapper;
    
    
    @Override
   public List<VolDto>getAllVol(){
        return repository.findAll().stream().map(m -> mapper.map(m,VolDto.class)).collect(Collectors.toList());
        
    }

    @Override
    public VolDto getVolById(long id) {
        Vol vol = repository.findById(id).get();
        return mapper.map(vol, VolDto.class);
    }
    @Override
    public boolean deleteVol(long id) {
        boolean isExist = repository.existsById(id);
        if (isExist) {
            repository.deleteById(id);
        }
        return isExist;
    }
    @Override
    public VolDto saveOrUpdate(VolDto volDto) {
        Vol v = mapper.map(volDto, Vol.class);
        Vol vr = repository.saveAndFlush(v);
        return mapper.map(vr, VolDto.class);
    }
    
    
}
