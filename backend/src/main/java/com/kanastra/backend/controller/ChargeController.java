package com.kanastra.backend.controller;

import com.kanastra.backend.repository.entity.Charge;
import com.kanastra.backend.repository.ChargeRepository;
import com.kanastra.backend.repository.ChargeRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("charges")
public class ChargeController {

    @Autowired
    private ChargeRepository respository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void charge(@RequestBody ChargeRequestDTO charge){
        Charge chargeChange = new Charge(charge);
        respository.save(chargeChange);
        return;
    }
}
