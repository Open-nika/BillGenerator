package com.bill.generator.Entity;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Consignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnNumber;
    private LocalDate cnDate;

    private String vehicleNumber;

    private String fromLocation;
    private String toLocation;

    private String weightType; // FTL, LTL

    private Double rate;
    private Double freight;

    private Double costPrice;      // INTERNAL
    private Double sellingPrice;   // SAME as freight (shown in bill)

    private String otherExpenses;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
}