package com.api.crud.mysql.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.api.crud.mysql.models.OutsourcedWorker;

@Entity
@Table(name = "outsourced_worker")
public class OutsourcedWorkerEntity {

	@Id
	@Column(name = "id_outsourced_worker")
	@Type(type = "uuid-char")
	private UUID idOutsourcedWorker;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "id_outsourced_company")
	private OutsourcedCompanyEntity outsourcedCompany;
	
	public OutsourcedWorker toModel() {
		OutsourcedWorker model = new OutsourcedWorker();
		model.setIdOutsourcedWorker(this.idOutsourcedWorker);
		model.setName(this.name);
		model.setOutsourcedCompany(this.outsourcedCompany.toModel());
		return model;
	}

	public OutsourcedWorkerEntity() {}

	public OutsourcedWorkerEntity(UUID idOutsourcedWorker, String name, OutsourcedCompanyEntity outsourcedCompany) {
		super();
		this.idOutsourcedWorker = idOutsourcedWorker;
		this.name = name;
		this.outsourcedCompany = outsourcedCompany;
	}

	public UUID getIdOutsourWorker() {
		return idOutsourcedWorker;
	}

	public void setIdOutsourWorker(UUID idOutsourcedWorker) {
		this.idOutsourcedWorker = idOutsourcedWorker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OutsourcedCompanyEntity getOutsourcedCompany() {
		return outsourcedCompany;
	}

	public void setOutsourcedCompany(OutsourcedCompanyEntity outsourcedCompany) {
		this.outsourcedCompany = outsourcedCompany;
	}
	
	@Override
	public String toString() {
		return "OutsourcedWorker [idOutsourWorker=" + idOutsourcedWorker + ", name=" + name + ", outsourcedCompany="
				+ outsourcedCompany + "]";
	}

}
