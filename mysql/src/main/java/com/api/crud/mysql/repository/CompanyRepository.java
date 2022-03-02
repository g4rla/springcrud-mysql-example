package com.api.crud.mysql.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.mysql.entities.OutsourcedCompanyEntity;

public interface CompanyRepository extends JpaRepository<OutsourcedCompanyEntity, UUID> {

}
