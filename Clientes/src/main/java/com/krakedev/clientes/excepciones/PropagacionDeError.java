package com.krakedev.clientes.excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PropagacionDeError {

	
	///Propago el error hasta que alguien se haga cargo
	public void metodoA() throws FileNotFoundException {
		FileReader archivo = new FileReader("achivo.txt");
		System.out.println("Archivo Abierto");
	}
	
	// Sigue decidiendo si se hace cargo  del error con (Try Catch ) de caso contrariso sigue con throws y sigue propagando el error
	public void metodo(){
		
		try {
			metodoA();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
