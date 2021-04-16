package com.example.projetoapilutalivreac2.repositorio;

import com.example.projetoapilutalivreac2.dominio.Lutadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LutadoresRepository extends JpaRepository<Lutadores, Integer> {

    List<Lutadores> findByVivoTrue();
    List<Lutadores> findByVivoFalse();

    @Query("select l from Lutadores l")
    List<Lutadores> findAllnormal();



}
