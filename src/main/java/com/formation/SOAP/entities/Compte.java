package com.formation.SOAP.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)	
public class Compte {

	private Long code;
	private float solde;
	@XmlTransient
	private Date dateCreation;

public Compte(Long code, float solde, Date dateCreation) {
	super();
	this.code = code;
	this.solde = solde;
	this.dateCreation = dateCreation;
}

public Compte() {
	
}

public Long getCode() {
	return code;
}

public void setCode(Long code) {
	this.code = code;
}

public float getSolde() {
	return solde;
}

public void setSolde(float solde) {
	this.solde = solde;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}



	
}
