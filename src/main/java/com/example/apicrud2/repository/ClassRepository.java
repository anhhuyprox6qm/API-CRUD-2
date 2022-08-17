package com.example.apicrud2.repository;

import com.example.apicrud2.model.Tblclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Tblclass, Integer> {
    List<Tblclass> findAllByName(String name);
    List<Tblclass> findAllByNameContainsIgnoreCase(String name);
//    List<Tblclass> findAllByNameAndEmail(String name, String email);
//    List<Tblclass> findAllByNameOrderByEmailAsc(String name);
}
