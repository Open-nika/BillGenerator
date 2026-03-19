
package com.bill.generator.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billNumber;
    private LocalDate billDate;

    private String clientName;

    private Double totalAmount;

    private String amountInWords;

    private LocalDateTime createdAt;
}