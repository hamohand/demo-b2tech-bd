package com.example.demob2techbd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findAll();
}
