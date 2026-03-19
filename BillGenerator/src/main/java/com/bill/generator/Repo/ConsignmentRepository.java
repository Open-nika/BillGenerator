package com.bill.generator.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bill.generator.Entity.Consignment;

public interface ConsignmentRepository extends JpaRepository<Consignment, Long> {
    
}
