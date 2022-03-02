package com.api.crud.mysql.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.mysql.entities.OutsourcedWorkerEntity;
import com.api.crud.mysql.models.OutsourcedWorker;
import com.api.crud.mysql.repository.WorkerRepository;
import com.api.crud.mysql.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public List<OutsourcedWorker> getWorkers() {
		return workerRepository.findAll()
				.stream()
				.map(OutsourcedWorkerEntity::toModel)
				.collect(Collectors.toList());
	}

	@Override
	public Optional<OutsourcedWorker> getWorkerById(UUID uuid) {
		return workerRepository.findById(uuid).map(OutsourcedWorkerEntity::toModel);
	}

}
