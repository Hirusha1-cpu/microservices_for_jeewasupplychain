package com.supplychain.grnmanagement.service;

import com.supplychain.grnmanagement.model.GrnModel;
import com.supplychain.grnmanagement.repository.GrnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GrnService {
    @Autowired
    private GrnRepo grnRepo;


    public List<GrnModel> getAllPurchases(){
        List<GrnModel>grnModelList = grnRepo.findAll();
//        return modelMapper.map(supplierModelList, new TypeToken<List<SupplierDTO>>(){}.getType());
        return grnModelList;
    }


    public GrnModel saveUser(GrnModel supplierModel){
        grnRepo.save(supplierModel);
        return supplierModel;
    }

    public GrnModel updateUser(GrnModel supplierModel){
        grnRepo.save(supplierModel);
        return supplierModel;
    }

    public String deleteUser(Integer grnId){
        grnRepo.deleteById(grnId);
        return "Purchase Deleted";
    }
}
