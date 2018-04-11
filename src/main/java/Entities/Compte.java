package Entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Compte {
	
private Integer code;
private float solde;
private Date dateCreation;

public Compte(Integer code, float solde, Date dateCreation) {
	super();
	this.code = code;
	this.solde = solde;
	this.dateCreation = dateCreation;
}

public Compte() {
	
}

public Integer getCode() {
	return code;
}

public void setCode(Integer code) {
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
