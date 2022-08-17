package com.example.apicrud2.service;

import com.example.apicrud2.model.Tblclass;

import java.util.List;

public interface ClassService {
    public void save(Tblclass user);
    public void delete(Integer id);
    public Tblclass findById(Integer id);
    public List<Tblclass> findAll();
    public List<Tblclass> findAllByNameContainsIgnoreCase(String name);
}
