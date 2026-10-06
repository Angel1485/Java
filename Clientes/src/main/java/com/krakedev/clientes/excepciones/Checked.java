package com.krakedev.clientes.excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {

	public static void main(String[] args) {

		System.out.println("Inicia el programa");
		
		try {
			FileReader archivo = new FileReader("achivo.txt");
			System.out.println("Archivo Abierto");
		} catch (FileNotFoundException e) {
			
			System.out.println("Error el archivo no fue encontrado" + e.getMessage());
			e.printStackTrace();
		}	

	}

}
