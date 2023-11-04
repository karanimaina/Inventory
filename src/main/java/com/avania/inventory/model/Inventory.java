package com.avania.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long product;
    private int quantity;
    private int currentStockPrice;
    private int estimatedTotalSellingPrice;
    private int estimatedTotalProfits;
    private int reorderThreshold;
    private Date lastStockUpdate;
    private long shelfLife;
    private  int totalPrice;
    }
