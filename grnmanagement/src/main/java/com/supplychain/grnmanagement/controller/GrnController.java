package com.supplychain.grnmanagement.controller;

import com.supplychain.grnmanagement.model.GrnModel;
import com.supplychain.grnmanagement.repository.GrnRepo;
import com.supplychain.grnmanagement.service.GrnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v3/")
public class GrnController {
    @Autowired
    private GrnRepo grnRepo;

    @Autowired
    private GrnService grnService;

    @GetMapping("/grns")
    public List<GrnModel> getUsers(){
        return grnService.getAllPurchases();
    }

    @PostMapping("/creategrn")
    public GrnModel saveUser(@RequestBody GrnModel supplierModel){
        return grnService.saveUser(supplierModel);
    }

    @PutMapping("/updategrn")
    public GrnModel updateUser(@RequestBody GrnModel grnModel){
        return grnService.updateUser(grnModel);
        //upsert kiynne user kenek innw nm update wenw a nattn create wenwa
    }

    @DeleteMapping("/deletegrn/{grnId}")
    public String deleteUser(@PathVariable Integer grnId){
        return grnService.deleteUser(grnId);

    }
}
