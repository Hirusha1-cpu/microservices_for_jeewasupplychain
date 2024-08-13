package com.example.supplychain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SupplierModel {
    @Id // for pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Integer id;

    private String name;

    private String supplier_code;

    private String contactnumber;
}
