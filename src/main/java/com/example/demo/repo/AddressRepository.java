package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
