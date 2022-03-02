package com.api.crud.mysql.models;

import java.util.UUID;

import com.api.crud.mysql.entities.OutsourcedWorkerEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OutsourcedWorker {

	@JsonProperty("id_outsourced_worker")
	private UUID idOutsourcedWorker;

	private String name;

	@JsonProperty("outsourced_company")
	private OutsourcedCompany outsourcedCompany;
	
	public OutsourcedWorkerEntity toEntity() {
		OutsourcedWorkerEntity entity = new OutsourcedWorkerEntity();
		entity.setIdOutsourWorker(this.idOutsourcedWorker);
		entity.setName(this.name);
		entity.setOutsourcedCompany(this.outsourcedCompany.toEntity());
		return entity;
	}

	public OutsourcedWorker() {

	}

	public OutsourcedWorker(UUID idOutsourcedWorker, String name, OutsourcedCompany outsourcedCompany) {
		super();
		this.idOutsourcedWorker = idOutsourcedWorker;
		this.name = name;
		this.outsourcedCompany = outsourcedCompany;
	}

	public UUID getIdOutsourcedWorker() {
		return idOutsourcedWorker;
	}

	public void setIdOutsourcedWorker(UUID idOutsourcedWorker) {
		this.idOutsourcedWorker = idOutsourcedWorker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OutsourcedCompany getOutsourcedCompany() {
		return outsourcedCompany;
	}

	public void setOutsourcedCompany(OutsourcedCompany outsourcedCompany) {
		this.outsourcedCompany = outsourcedCompany;
	}
	
	@Override
	public String toString() {
		return "OutsourcedWorker [idOutsourcedWorker=" + idOutsourcedWorker + ", name=" + name + ", outsourcedCompany="
				+ outsourcedCompany + "]";
	}

}
