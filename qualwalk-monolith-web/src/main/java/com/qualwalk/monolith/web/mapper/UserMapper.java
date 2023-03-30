package com.qualwalk.monolith.web.mapper;

import com.qualwalk.monolith.domain.model.IndividualData;
import com.qualwalk.monolith.persistence.entity.IndividualDetailsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    IndividualData toData(IndividualDetailsEntity input);

    @Mappings({
            @Mapping(source = "yearsOfExperience", target = "experience")
    })
    IndividualDetailsEntity toEntity(IndividualData individualData);

}
