package Entities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class Banque {

	public static void main(String[] args) throws Exception {
	
		marshall();
		unmarshal();
		createschema();
}

	private static void unmarshal() throws Exception{
		 JAXBContext jc = JAXBContext.newInstance(Compte.class);
		 Unmarshaller unmarshaller =jc.createUnmarshaller();
		 Compte cp=(Compte) unmarshaller.unmarshal(new File("comptes.xml"));
		System.out.println("Code : "+cp.getCode()+"\nSolde : "+cp.getSolde()+"\nDate :"+cp.getDateCreation()); 
		
		
	}

	private static void marshall() throws Exception {
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		 Marshaller marshaller =context.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		 Compte cp= new Compte(1,8000,new Date());
		 marshaller.marshal(cp,new File("comptes.xml"));
			
		}
	
	
	private static void createschema() throws Exception{
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				File f=new File("compte.xsd");
				StreamResult result=new StreamResult(f);
				result.setSystemId(f.getName());
				return result;
			}
	});
		
			
	}
}

