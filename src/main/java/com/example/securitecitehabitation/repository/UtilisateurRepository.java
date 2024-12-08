package com.example.securitecitehabitation.repository;

import com.example.securitecitehabitation.domain.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, UUID> {
}
