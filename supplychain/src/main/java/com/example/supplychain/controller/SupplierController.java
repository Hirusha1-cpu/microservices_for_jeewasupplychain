package com.example.supplychain.controller;

import com.example.supplychain.dto.SupplierDTO;
import com.example.supplychain.model.SupplierModel;
import com.example.supplychain.repository.SupplierRepo;
import com.example.supplychain.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class SupplierController {

    @Autowired
    private SupplierRepo supplierRepo;

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/suppliers")
    public List<SupplierModel> getUsers(){
        return supplierService.getAllSuppliers();
    }

    @PostMapping("/createsupplier")
    public SupplierModel saveUser(@RequestBody SupplierModel supplierModel){
        return supplierService.saveUser(supplierModel);
    }

    @PutMapping("/updatesupplier")
    public SupplierModel updateUser(@RequestBody SupplierModel supplierModel){
        return supplierService.updateUser(supplierModel);
        //upsert kiynne user kenek innw nm update wenw a nattn create wenwa
    }

    @DeleteMapping("/deletesupplier/{supplierId}")
    public String deleteUser(@PathVariable Integer supplierId){
        return supplierService.deleteUser(supplierId);

    }





}
