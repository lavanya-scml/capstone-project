package com.tavant.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.address.models.File;
@Repository
public interface FileRepository extends JpaRepository<File, String> {

}
