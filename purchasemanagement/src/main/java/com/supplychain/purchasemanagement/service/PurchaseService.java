package com.supplychain.purchasemanagement.service;

import com.supplychain.purchasemanagement.model.PurchaseModel;
import com.supplychain.purchasemanagement.repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseService {
    @Autowired
    private PurchaseRepo purchaseRepo;

    public List<PurchaseModel> getAllPurchases(){
        List<PurchaseModel>supplierModelList = purchaseRepo.findAll();
//        return modelMapper.map(supplierModelList, new TypeToken<List<SupplierDTO>>(){}.getType());
        return supplierModelList;
    }


    public PurchaseModel saveUser(PurchaseModel supplierModel){
        purchaseRepo.save(supplierModel);
        return supplierModel;
    }

    public PurchaseModel updateUser(PurchaseModel supplierModel){
        purchaseRepo.save(supplierModel);
        return supplierModel;
    }

    public String deleteUser(Integer purchaseId){
        purchaseRepo.deleteById(purchaseId);
        return "Supplier Deleted";
    }
}
