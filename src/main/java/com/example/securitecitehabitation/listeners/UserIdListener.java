package com.example.securitecitehabitation.listeners;

import com.example.securitecitehabitation.abstractId.AuditEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class UserIdListener {

    @PrePersist
    private void beforeCreate(final AuditEntity entity) {
        entity.setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    private void beforeUpdate(final AuditEntity entity) {
        entity.setUpdateAt(LocalDateTime.now());
    }
}
