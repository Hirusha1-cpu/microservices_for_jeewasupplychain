package com.supplychain.purchasemanagement.controller;

import com.supplychain.purchasemanagement.model.PurchaseModel;
import com.supplychain.purchasemanagement.repository.PurchaseRepo;
import com.supplychain.purchasemanagement.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v2/")
public class PurchaseController {
    @Autowired
    private PurchaseRepo purchaseRepo;

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchases")
    public List<PurchaseModel> getUsers(){
        return purchaseService.getAllPurchases();
    }

    @PostMapping("/createpurchase")
    public PurchaseModel saveUser(@RequestBody PurchaseModel supplierModel){
        return purchaseService.saveUser(supplierModel);
    }

    @PutMapping("/updatepurchase")
    public PurchaseModel updateUser(@RequestBody PurchaseModel supplierModel){
        return purchaseService.updateUser(supplierModel);
        //upsert kiynne user kenek innw nm update wenw a nattn create wenwa
    }

    @DeleteMapping("/deletepurchase/{purchaseId}")
    public String deleteUser(@PathVariable Integer purchaseId){
        return purchaseService.deleteUser(purchaseId);

    }
}
