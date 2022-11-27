package com.jnsdev.hexagonal.adapters.out.repository;

import com.jnsdev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:28
 */
@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
