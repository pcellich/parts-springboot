package com.example.parts.controller;

import com.example.parts.entity.Parts;
import com.example.parts.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = { "http://localhost:3000"})
@RestController

public class PartsController{

    private final PartsService partsService;

    @Autowired
    public PartsController(@Qualifier("partsServiceIMPL")PartsService partsService) {
        this.partsService = partsService;
    }

    @GetMapping("/")
    public String hello() {
        return "spring boot";
    }

    @GetMapping("/allParts")
    public List<Parts> findAll() {
        return partsService.findAll();
    }

    @PostMapping("/addParts")
    public Parts addParts(@RequestBody Parts theParts) {
        theParts.setParts_id(0);
        partsService.saveOrUpdate(theParts);
        return theParts;
    }

    @PutMapping("/updateParts")
    public Parts updateParts(@RequestBody Parts updateParts) {
        partsService.saveOrUpdate(updateParts);
        return updateParts;
    }


    @DeleteMapping("/deleteParts/{partId}")
    public String deleteParts(@PathVariable int partId) {
        partsService.deleteById(partId);
        return "Deleted parts id : " + partId;
    }
}


