package models;

import java.text.DateFormat;
import java.util.Date;



public class DataporExtenso {
	
	
	
	

	public String retornaData(Date data){

		
		DateFormat formatador;
		formatador = DateFormat.getDateInstance(DateFormat.FULL);
		String dataextenso = formatador.format(data);
		return dataextenso;
	}

	
	public  boolean verificaSegunda(Date data){
		
		DateFormat formatador;
		formatador = DateFormat.getDateInstance(DateFormat.FULL);
		String dataextenso = formatador.format(data);
		return dataextenso.contains("Segunda");
		
	}
	
	/*
public  boolean verificaSegunda(String data){
		
		
	    DateFormat formatador;
		formatador = DateFormat.getDateInstance(DateFormat.FULL);
		String dataextenso = formatador.format(data);
		return dataextenso.contains("Segunda");
		
	}	*/
		
}	
