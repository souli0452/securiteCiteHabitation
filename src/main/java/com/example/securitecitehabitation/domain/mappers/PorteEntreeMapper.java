package com.example.securitecitehabitation.domain.mappers;

import com.example.securitecitehabitation.domain.PorteEntree;
import com.example.securitecitehabitation.dto.PorteEntreeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring")
public interface PorteEntreeMapper {

    PorteEntreeDto toDto(PorteEntree porteEntree);

    PorteEntree toEntity(PorteEntreeDto porteEntreeDto);

    List<PorteEntreeDto> toDtos(List<PorteEntree> porteEntrees);

    List<PorteEntree> toEntities(List<PorteEntreeDto> porteEntreeDtos);
    @Mapping(target = "id", ignore = true) // Ignorer l'id pour éviter de le modifier
    void updateEntityFromDto(PorteEntreeDto porteEntreeDto, @MappingTarget PorteEntree porteEntree);
    default PorteEntree map(UUID id) {
        if (id == null) {
            return null;
        }
        PorteEntree porteEntree = new PorteEntree();
        porteEntree.setId(id);
        return porteEntree;
    }
}
