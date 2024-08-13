package com.supplychain.purchasemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PurchaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Integer id;

    private String note;

    private String required_datetime;

    private String item;

}
