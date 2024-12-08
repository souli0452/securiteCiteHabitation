package com.example.securitecitehabitation.domain.mappers;
import com.example.securitecitehabitation.domain.Utilisateur;
import com.example.securitecitehabitation.dto.UtilisateurDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {

    UtilisateurDto toDto(Utilisateur utilisateur);

    Utilisateur toEntity(UtilisateurDto utilisateurDto);

    List<UtilisateurDto> toDtos(List<Utilisateur> utilisateurs);

    List<Utilisateur> toEntities(List<UtilisateurDto> utilisateurDtos);
    @Mapping(target = "id", ignore = true) // Ignorer l'id pour éviter de le modifier
    void updateEntityFromDto(UtilisateurDto utilisateurDto, @MappingTarget Utilisateur utilisateur);
    default Utilisateur map(UUID id) {
        if (id == null) {
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(id);
        return utilisateur;
    }
}
