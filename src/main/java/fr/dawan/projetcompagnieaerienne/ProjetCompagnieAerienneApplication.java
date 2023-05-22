package fr.dawan.projetcompagnieaerienne;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetCompagnieAerienneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetCompagnieAerienneApplication.class, args);
	}

	
	    @Bean
	    ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
}
