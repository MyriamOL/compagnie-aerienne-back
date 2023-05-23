package fr.dawan.projetcompagnieaerienne.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.projetcompagnieaerienne.security.JwtReponseUtilisateurConnexion;
import fr.dawan.projetcompagnieaerienne.security.JwtRequestUtilisateurConnexion;
import fr.dawan.projetcompagnieaerienne.utils.JwtTokenUtil;


@RestController
public class JwtUtilisateurConnectionController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping(value="/connexion",consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequestUtilisateurConnexion authenticationRequest) throws Exception{
        System.out.println(authenticationRequest.getEmail());
       
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getMdp()));
        } catch (DisabledException e) {
                throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
                throw new Exception("INVALID_CREDENTIALS", e);
        }   
        
        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getEmail());
        String jwtToken = jwtTokenUtil.generateJwtToken(userDetails);
 
        return ResponseEntity.ok(new JwtReponseUtilisateurConnexion(jwtToken));
      
    }
    
    
}
