package com.example.magazinsportiv.controller;



import com.example.magazinsportiv.entity.Produs;
import com.example.magazinsportiv.repository.ProdusRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produse")
public class ProdusController {

    private final ProdusRepository produsRepository;

    public ProdusController(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    @GetMapping
    public List<Produs> getAllProduse() {
        return produsRepository.findAll();
    }
}

