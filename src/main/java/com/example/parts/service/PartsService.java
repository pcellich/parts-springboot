package com.example.parts.service;

import com.example.parts.entity.Parts;

import java.util.List;

public interface PartsService {
    List<Parts> findAll();
    Object findById(int theId);
    void saveOrUpdate(Parts theParts);
    void deleteById(int theId);
}
