package com.example.parts.service;

import com.example.parts.dao.PartsDAO;
import com.example.parts.entity.Parts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsServiceIMPL implements PartsService {
    private final PartsDAO partsDAO;

    @Autowired
    public PartsServiceIMPL(PartsDAO partsDAO) {
        this.partsDAO = partsDAO;
    }

    @Override
    public List<Parts> findAll() {
        return partsDAO.findAll();
    }

    @Override
    public Object findById(int partId) {
        return partsDAO.findById(partId);
    }

    @Override
    public void saveOrUpdate(Parts theParts) {
        partsDAO.saveOrUpdate(theParts);
    }

    @Override
    public void deleteById(int partId) {
        partsDAO.deleteById(partId);
    }

}

