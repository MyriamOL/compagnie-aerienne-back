package fr.dawan.projetcompagnieaerienne.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import fr.dawan.projetcompagnieaerienne.dtos.AeroportDto;
import fr.dawan.projetcompagnieaerienne.entities.Aeroport;
import fr.dawan.projetcompagnieaerienne.repositories.AeroportRepository;
import fr.dawan.projetcompagnieaerienne.services.AeroportService;

public class AeroportServiceImpl implements AeroportService {

    @Autowired
    private AeroportRepository repository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<AeroportDto> getAllAeroport() {
        return repository.findAll().stream().map(m -> mapper.map(m, AeroportDto.class)).collect(Collectors.toList());

    }

    @Override
    public AeroportDto getAeroportById(long id) {
        Aeroport aeroport = repository.findById(id).get();
        return mapper.map(aeroport, AeroportDto.class);
    }

    @Override
    public boolean deleteAeroport(long id) {
        boolean isExist = repository.existsById(id);
        if (isExist) {
            repository.deleteById(id);
        }
        return isExist;
    }

    @Override
    public AeroportDto saveOrUpdate(AeroportDto aeroportDto) {
        Aeroport a = mapper.map(aeroportDto, Aeroport.class);
        Aeroport ar = repository.saveAndFlush(a);
        return mapper.map(ar, AeroportDto.class);
    }

}
