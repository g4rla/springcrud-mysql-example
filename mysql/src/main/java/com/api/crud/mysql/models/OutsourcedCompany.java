package com.api.crud.mysql.models;

import java.util.UUID;

import com.api.crud.mysql.entities.OutsourcedCompanyEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OutsourcedCompany {

	@JsonProperty("id_outsourced_company")
	private UUID idOutsourcedCompany;

	private String name;

	public OutsourcedCompanyEntity toEntity() {
		OutsourcedCompanyEntity entity = new OutsourcedCompanyEntity();
		entity.setIdOutsourcedCompany(this.idOutsourcedCompany);
		entity.setName(this.name);
		return entity;
	}

	public OutsourcedCompany() {

	}

	public OutsourcedCompany(UUID idOutsourcedCompany, String name) {
		super();
		this.idOutsourcedCompany = idOutsourcedCompany;
		this.name = name;
	}

	public UUID getIdOutsourcedCompany() {
		return idOutsourcedCompany;
	}

	public void setIdOutsourcedCompany(UUID idOutsourcedCompany) {
		this.idOutsourcedCompany = idOutsourcedCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "OutsourcedCompany [idOutsourcedCompany=" + idOutsourcedCompany + ", name=" + name + "]";
	}

}
