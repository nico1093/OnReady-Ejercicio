package com.vehiculos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vehiculos.clases.Auto;
import com.vehiculos.clases.Moto;
import com.vehiculos.clases.Vehiculo;

public class Main {

	public static void main(String[] args) {
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(new Auto("Peugeot", "206", 200000.00, 4));
		vehiculos.add(new Moto("Honda", "Titan", 60000.00, 125));
		vehiculos.add(new Auto("Peugeot", "208", 250000.00, 5));
		vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
		//Imprimir por consola la lista de vehiculos.
		for(int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i).toString());
		}
		System.out.println("===============================");
		//IMprimir marca y modelo del vehiculo mas caro.
		System.out.println("Vehículo más caro: " +
				vehiculoMasCaro(vehiculos).getMarca() + " " + vehiculoMasCaro(vehiculos).getModelo());
		// Imprimir marca y modelo del vehiculo mas barato
		System.out.println("Vehículo más barato: " +
				vehiculoMasBarato(vehiculos).getMarca() + " " + vehiculoMasBarato(vehiculos).getModelo());
		//Imprimir marca, modelo y precio del vehiculo que tiene la letra Y en su modelo. 
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " +
				modeloQueContieneLaY(vehiculos).getMarca() + " " + 
				modeloQueContieneLaY(vehiculos).getModelo() + " " + 
				"$"+modeloQueContieneLaY(vehiculos).getPrecio());
		System.out.println("===============================");
		//Ordenar de mayor precio al menor precio.
		Collections.sort(vehiculos);
		
		System.out.println("Vehiculos ordenados por porecio mayor a menor: ");
		for(int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
		}

	}
	
	public static Vehiculo vehiculoMasCaro(List<Vehiculo> vehiculos) {
		Vehiculo vehiculoMasCaro = vehiculos.get(0);
		for(int i = 1; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getPrecio() > vehiculoMasCaro.getPrecio()) {
				vehiculoMasCaro = vehiculos.get(i);
			}
		}
		return vehiculoMasCaro;
	}
	
	public static Vehiculo vehiculoMasBarato(List<Vehiculo> vehiculos) {
		Vehiculo vehiculoMasBarato = vehiculos.get(0);
		for(int i = 1; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getPrecio() < vehiculoMasBarato.getPrecio()) {
				vehiculoMasBarato = vehiculos.get(i);
			}
		}
		return vehiculoMasBarato;
	}
	public static Vehiculo modeloQueContieneLaY(List<Vehiculo> vehiculos) {
		Vehiculo vehiculoBuscado = null;
		for(int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getModelo().contains("Y")) {
				vehiculoBuscado = vehiculos.get(i);
			}
		}
		return vehiculoBuscado;
	}

}
