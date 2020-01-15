package com.vehiculos;


import java.util.Collections;

import com.vehiculos.clases.Catalogo;

public class Main {

	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		catalogo.printCatalogo();
		catalogo.printDatosDePrecio();
		catalogo.printVehiculosDeMayorAMenor();

	}
}
