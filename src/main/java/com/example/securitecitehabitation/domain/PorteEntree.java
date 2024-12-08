package com.example.securitecitehabitation.domain;

import com.example.securitecitehabitation.abstractId.AuditEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "PorteEntree")
@JsonInclude(NON_NULL)
@SuperBuilder
public class PorteEntree extends AuditEntity {
    private String emplacement;
    private String numero;
}
