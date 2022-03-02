package com.api.crud.mysql.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.api.crud.mysql.models.OutsourcedCompany;

@Entity
@Table(name = "outsourced_company")
public class OutsourcedCompanyEntity {

	@Id
	@Column(name = "id_outsourced_company")
	@Type(type = "uuid-char")
	private UUID idOutsourcedCompany;

	@Column(name = "name")
	private String name;
	
	public OutsourcedCompany toModel() {
		OutsourcedCompany model = new OutsourcedCompany();
		model.setIdOutsourcedCompany(this.idOutsourcedCompany);
		model.setName(this.name);
		return model;
	}

	public OutsourcedCompanyEntity() {}

	public OutsourcedCompanyEntity(UUID idOutsourcedCompany, String name) {
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