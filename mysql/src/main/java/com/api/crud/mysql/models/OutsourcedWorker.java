package com.api.crud.mysql.models;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.UUID;

import com.api.crud.mysql.entities.OutsourcedWorkerEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class OutsourcedWorker {

	@JsonProperty("id_outsourced_worker")
	private UUID idOutsourcedWorker;

	private String name;

	@JsonProperty("outsourced_company")
	private OutsourcedCompany outsourcedCompany;

	private String message;
	
	public OutsourcedWorkerEntity toEntity() {
		OutsourcedWorkerEntity entity = new OutsourcedWorkerEntity();
		entity.setIdOutsourWorker(this.idOutsourcedWorker);
		entity.setName(this.name);
		entity.setOutsourcedCompany(this.outsourcedCompany.toEntity());
		return entity;
	}

	public OutsourcedWorker() {}

	public OutsourcedWorker(UUID idOutsourcedWorker, String name, OutsourcedCompany outsourcedCompany, String message) {
		super();
		this.idOutsourcedWorker = idOutsourcedWorker;
		this.name = name;
		this.outsourcedCompany = outsourcedCompany;
		this.message = message;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "OutsourcedWorker [idOutsourcedWorker=" + idOutsourcedWorker + ", name=" + name + ", outsourcedCompany="
				+ outsourcedCompany + ", message=" + message + "]";
	}
	
}
