package com.supplychain.purchasemanagement.repository;

import com.supplychain.purchasemanagement.model.PurchaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepo extends JpaRepository<PurchaseModel, Integer> {


}
