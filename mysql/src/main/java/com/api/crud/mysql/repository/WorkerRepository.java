package com.api.crud.mysql.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.mysql.entities.OutsourcedWorkerEntity;

public interface WorkerRepository extends JpaRepository<OutsourcedWorkerEntity, UUID> {

}
