package com.example.securitecitehabitation.repository;

import com.example.securitecitehabitation.domain.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfilRepository extends JpaRepository<Profil, UUID> {
}
