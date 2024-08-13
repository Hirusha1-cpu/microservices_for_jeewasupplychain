package com.example.supplychain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDTO {
    private Integer id;

    private String name;

    private String supplier_code;

    private String contactnumber;
}
