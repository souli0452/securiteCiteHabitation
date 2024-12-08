package com.example.securitecitehabitation.domain;

import com.example.securitecitehabitation.abstractId.AuditEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AuditEntity {

    private String nom;
    private String prenom;
    private String photo;
    private String numeroTelephone;
    private String email;
    private String motDePasse;
    private String adresse;
    private String vehicule;
    private String dateExpiration;
}
