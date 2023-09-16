package com.example.jparelations.controller;

import com.example.jparelations.model.Capital;
import com.example.jparelations.service.CapitalService;
import jakarta.persistence.PrimaryKeyJoinColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/capital")
@RestController
public class CapitalController {


    @Autowired
    private CapitalService capitalService;


//    // this is without ResponseEntity
//    @GetMapping("/getall")
//    public List<Capital> getAllCapitals() {
//        return capitalService.getAllCapitals();
//    }

    @GetMapping("/getall")
    public ResponseEntity<List<Capital>> getAllCapitals() {
        return ResponseEntity.ok(capitalService.getAllCapitals());
       // return new ResponseEntity<>(capitalService.getAllCapitals(), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Capital> addCapital(@RequestBody Capital capital) {
        return new ResponseEntity<>(capitalService.addCapital(capital), HttpStatus.CREATED);
    }



}
