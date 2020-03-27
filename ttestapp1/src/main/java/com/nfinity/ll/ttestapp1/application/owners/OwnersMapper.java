package com.nfinity.ll.ttestapp1.application.owners;

import org.mapstruct.Mapper;
import com.nfinity.ll.ttestapp1.application.owners.dto.*;
import com.nfinity.ll.ttestapp1.domain.model.OwnersEntity;

@Mapper(componentModel = "spring")
public interface OwnersMapper {

   OwnersEntity createOwnersInputToOwnersEntity(CreateOwnersInput ownersDto);
   
   CreateOwnersOutput ownersEntityToCreateOwnersOutput(OwnersEntity entity);

   OwnersEntity updateOwnersInputToOwnersEntity(UpdateOwnersInput ownersDto);

   UpdateOwnersOutput ownersEntityToUpdateOwnersOutput(OwnersEntity entity);

   FindOwnersByIdOutput ownersEntityToFindOwnersByIdOutput(OwnersEntity entity);


}
