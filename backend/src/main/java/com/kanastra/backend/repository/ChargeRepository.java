package com.kanastra.backend.repository;

import com.kanastra.backend.repository.entity.Charge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargeRepository extends JpaRepository<Charge, Long> {
}
