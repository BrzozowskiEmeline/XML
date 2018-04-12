package com.formation.SOAP.serveur;

import javax.xml.ws.Endpoint;

import com.formation.SOAP.services.BanqueService;


public class ServeurJWS {

	public static void main(String[] args) {
		String url="http://localhost:8585/";	
			Endpoint.publish(url, new BanqueService());
				System.out.println(url);
	}

}
