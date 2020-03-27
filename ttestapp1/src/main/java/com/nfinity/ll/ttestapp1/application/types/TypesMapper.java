package com.nfinity.ll.ttestapp1.application.types;

import org.mapstruct.Mapper;
import com.nfinity.ll.ttestapp1.application.types.dto.*;
import com.nfinity.ll.ttestapp1.domain.model.TypesEntity;

@Mapper(componentModel = "spring")
public interface TypesMapper {

   TypesEntity createTypesInputToTypesEntity(CreateTypesInput typesDto);
   
   CreateTypesOutput typesEntityToCreateTypesOutput(TypesEntity entity);

   TypesEntity updateTypesInputToTypesEntity(UpdateTypesInput typesDto);

   UpdateTypesOutput typesEntityToUpdateTypesOutput(TypesEntity entity);

   FindTypesByIdOutput typesEntityToFindTypesByIdOutput(TypesEntity entity);


}
