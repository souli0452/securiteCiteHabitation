package com.example.securitecitehabitation.dto;

import com.example.securitecitehabitation.abstractId.AuditEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@JsonInclude(NON_NULL)
@MappedSuperclass
@SuperBuilder
public class UtilisateurDto extends AuditEntity {

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
