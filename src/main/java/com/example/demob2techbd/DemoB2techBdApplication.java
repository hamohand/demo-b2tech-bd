package com.example.demob2techbd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoB2techBdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoB2techBdApplication.class, args);
    }

    //Quelques données
    //@Bean
    CommandLineRunner startCompte(IEtudiantRepository iEtudiantRepository){
        return args -> {
            Stream.of("Moh2","Saly2","Kaci2","Margot2")
                    .forEach(nom -> {
                        Etudiant etudiant = new Etudiant();
                        etudiant.setNom(nom);
                        etudiant.setNote(
                                Math.random()<0.3?8:
                                        Math.random()<0.5?10:
                                                Math.random()<0.9?14:16
                        );

                        iEtudiantRepository.save(etudiant);

                    });
        };
    }
}
