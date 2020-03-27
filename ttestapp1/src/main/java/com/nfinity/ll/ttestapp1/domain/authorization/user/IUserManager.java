package com.nfinity.ll.ttestapp1.domain.authorization.user;

import com.nfinity.ll.ttestapp1.domain.model.UserEntity;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserManager {
    // CRUD Operations
    UserEntity create(UserEntity user);

    void delete(UserEntity user);

    UserEntity update(UserEntity user);

    UserEntity findById(Long id);
    
    UserEntity findByUserName(String userName);

    Page<UserEntity> findAll(Predicate predicate, Pageable pageable);
  
}


