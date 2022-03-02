package com.api.crud.mysql.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.api.crud.mysql.models.OutsourcedWorker;

public interface WorkerService {
	
	public List<OutsourcedWorker> getWorkers();
	
	public Optional<OutsourcedWorker> getWorkerById(UUID uuid);

}
