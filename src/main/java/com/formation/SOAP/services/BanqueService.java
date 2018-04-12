package com.formation.SOAP.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.formation.SOAP.entities.Compte;
@WebService(serviceName="BanqueWS")
public class BanqueService {

	@WebMethod(operationName="ConversionEuroToDh")
	public double conversion(@WebParam(name="montant")double mt){
	return mt*11;
	}
	@WebMethod
	public Compte getCompte(@WebParam(name="code")Long code){
	return new Compte (code,7000,new Date());
	}
	@WebMethod
	public List<Compte> getComptes(){
	List<Compte> cptes=new ArrayList<Compte>();
	cptes.add (new Compte (1L,7000,new Date()));
	cptes.add (new Compte (2L,7000,new Date()));
	return cptes;
	}}




