package com.tavant.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tavant.address.models.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

}
