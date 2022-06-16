package com.example.EjerciciosSesiones45.y6.controller;

import com.example.EjerciciosSesiones45.y6.Repository.LaptopRepository;
import com.example.EjerciciosSesiones45.y6.entitis.Laptop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptos")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();

    }


}
