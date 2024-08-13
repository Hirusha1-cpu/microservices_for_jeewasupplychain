package com.example.supplychain.repository;


import com.example.supplychain.model.SupplierModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<SupplierModel, Integer> {

}
