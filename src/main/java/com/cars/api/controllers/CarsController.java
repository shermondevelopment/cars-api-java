package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/api/v1")
public class CarsController {

  @PostMapping("/add")
  public void addCars(@RequestBody CarDTO req) {
    System.out.printf("modelo: %s, ano: %s, valor: %f", req.modelo(), req.anoModelo(), req.valor());
  }

}
