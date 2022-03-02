package com.api.crud.mysql.controller;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.mysql.models.OutsourcedWorker;
import com.api.crud.mysql.service.WorkerService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private WorkerService workerService;

	@GetMapping
	public ResponseEntity<List<OutsourcedWorker>> listAll() {
		List<OutsourcedWorker> workers = workerService.getWorkers();
		if (workers.isEmpty())
			return new ResponseEntity<>(NO_CONTENT);
		return new ResponseEntity<>(workers, OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OutsourcedWorker> getById(@PathVariable UUID id) {
		Optional<OutsourcedWorker> workerById = workerService.getWorkerById(id);
		if (workerById.isPresent())
			return new ResponseEntity<>(workerById.get(), OK);
		return new ResponseEntity<>(NO_CONTENT);
	}

}
