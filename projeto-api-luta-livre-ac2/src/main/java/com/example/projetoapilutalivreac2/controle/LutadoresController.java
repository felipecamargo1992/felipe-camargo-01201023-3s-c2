package com.example.projetoapilutalivreac2.controle;

import com.example.projetoapilutalivreac2.dominio.Lutadores;
import com.example.projetoapilutalivreac2.repositorio.LutadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutadoresController {

    @Autowired
    private LutadoresRepository repository;

    @PostMapping
    public ResponseEntity postLutadores (@RequestBody @Valid Lutadores novoLutador){
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getLutadores (){
        return ResponseEntity.status(200).body(repository.findAllnormal());
    }

    @GetMapping("/contagem-vivos")
    public ResponseEntity getVivos(){
        return ResponseEntity.status(200).body(repository.findByVivoTrue());
    }

    /*@PostMapping("/{id}/concentrar")
    public ResponseEntity postConcentrar (@PathVariable Integer id){
        if ()
    }

     */

    @GetMapping("/mortos")
    public ResponseEntity getMortos(){
        return ResponseEntity.status(200).body(repository.findByVivoFalse());
    }











}
