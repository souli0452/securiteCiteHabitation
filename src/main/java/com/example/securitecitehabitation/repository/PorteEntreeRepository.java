package com.example.securitecitehabitation.repository;

import com.example.securitecitehabitation.domain.PorteEntree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PorteEntreeRepository extends JpaRepository<PorteEntree, UUID> {
}
