package com.example.securitecitehabitation.domain.mappers;

import com.example.securitecitehabitation.domain.Profil;
import com.example.securitecitehabitation.dto.ProfilDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring")
public interface ProfilMapper {

    ProfilDto toDto(Profil profil);

    Profil toEntity(ProfilDto profilDto);

    List<ProfilDto> toDtos(List<Profil> profils);

    List<Profil> toEntities(List<ProfilDto> profilDtos);
    @Mapping(target = "id", ignore = true) // Ignorer l'id pour éviter de le modifier
    void updateEntityFromDto(ProfilDto profilDto, @MappingTarget Profil profil);
    default Profil map(UUID id) {
        if (id == null) {
            return null;
        }
        Profil profil = new Profil();
        profil.setId(id);
        return profil;
    }
}
