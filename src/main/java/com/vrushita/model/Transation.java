package com.vrushita.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Transation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionID;
    private Integer orderID;
    private String paymentMethod;
    private Double amount;
    private String transactionDate;
}
