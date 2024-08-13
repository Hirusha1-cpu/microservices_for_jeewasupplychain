package com.supplychain.grnmanagement.repository;

import com.supplychain.grnmanagement.model.GrnModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrnRepo extends JpaRepository<GrnModel, Integer> {
}
