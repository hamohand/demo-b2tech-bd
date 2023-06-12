package com.example.demob2techbd;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class EtudiantController {
    private  IEtudiantRepository iEtudiantRepository;

    @GetMapping("/")
    List<Etudiant> maListe(){
        return iEtudiantRepository.findAll();
    }
}
