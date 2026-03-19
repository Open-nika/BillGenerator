package com.bill.generator.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bill.generator.Entity.Bill;

public interface BillRepository extends JpaRepository<Bill,Long>{
    
}
