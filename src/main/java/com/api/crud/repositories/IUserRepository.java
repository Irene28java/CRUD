package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository      // nos ayuda hacer consultas con query
public interface IUserRepository extends JpaRepository<UserModel,Long> {



}
