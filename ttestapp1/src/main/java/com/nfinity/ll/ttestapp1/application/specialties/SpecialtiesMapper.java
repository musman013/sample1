package com.nfinity.ll.ttestapp1.application.specialties;

import org.mapstruct.Mapper;
import com.nfinity.ll.ttestapp1.application.specialties.dto.*;
import com.nfinity.ll.ttestapp1.domain.model.SpecialtiesEntity;

@Mapper(componentModel = "spring")
public interface SpecialtiesMapper {

   SpecialtiesEntity createSpecialtiesInputToSpecialtiesEntity(CreateSpecialtiesInput specialtiesDto);
   
   CreateSpecialtiesOutput specialtiesEntityToCreateSpecialtiesOutput(SpecialtiesEntity entity);

   SpecialtiesEntity updateSpecialtiesInputToSpecialtiesEntity(UpdateSpecialtiesInput specialtiesDto);

   UpdateSpecialtiesOutput specialtiesEntityToUpdateSpecialtiesOutput(SpecialtiesEntity entity);

   FindSpecialtiesByIdOutput specialtiesEntityToFindSpecialtiesByIdOutput(SpecialtiesEntity entity);


}
