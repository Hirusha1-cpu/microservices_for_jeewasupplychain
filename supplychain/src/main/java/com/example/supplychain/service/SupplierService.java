package com.example.supplychain.service;

import com.example.supplychain.dto.SupplierDTO;
import com.example.supplychain.model.SupplierModel;
import com.example.supplychain.repository.SupplierRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupplierService {
    @Autowired
    private SupplierRepo supplierRepo;

//
//    @Autowired
//    private ModelMapper modelMapper;

    public List<SupplierModel> getAllSuppliers(){
        List<SupplierModel>supplierModelList = supplierRepo.findAll();
//        return modelMapper.map(supplierModelList, new TypeToken<List<SupplierDTO>>(){}.getType());
        return supplierModelList;
    }


    public SupplierModel saveUser(SupplierModel supplierModel){
        supplierRepo.save(supplierModel);
        return supplierModel;
    }

    public SupplierModel updateUser(SupplierModel supplierModel){
        supplierRepo.save(supplierModel);
        return supplierModel;
    }

    public String deleteUser(Integer supplierId){
        supplierRepo.deleteById(supplierId);
        return "Supplier Deleted";
    }

//    public SupplierModel getUserById(Integer supplierId){
////        User user = userRepo.findById(userId);
//        SupplierModel supplierModel = SupplierRepo.ge(supplierId);
//        return supplierModel;
//
//    }


}
