package com.vehiculos.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalogo {
	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Catalogo() {
		vehiculos.add(new Auto("Peugeot", "206", 200000.00, 4));
		vehiculos.add(new Moto("Honda", "Titan", 60000.00, 125));
		vehiculos.add(new Auto("Peugeot", "208", 250000.00, 5));
		vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
	}
	
	public Catalogo(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public void addVehiculos(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	//Imprimir por consola la lista de vehiculos.
	public void printCatalogo() {
		for(int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i).toString());
		}
		System.out.println("===============================");
	}
	
	public boolean esMasCaro(Vehiculo vehiculo, int i) {
		return vehiculo.getPrecio() < vehiculos.get(i).getPrecio();
	}
	
	public Vehiculo vehiculoMasCaro(List<Vehiculo> vehiculos) {
		Vehiculo vehiculoMasCaro = vehiculos.get(0);
		for(int i = 1; i < vehiculos.size(); i++) {
			if(this.esMasCaro(vehiculoMasCaro, i)) {
				vehiculoMasCaro = vehiculos.get(i);
			}
		}
		return vehiculoMasCaro;
	}
	
	public Vehiculo vehiculoMasBarato(List<Vehiculo> vehiculos) {
		Vehiculo vehiculoMasBarato = vehiculos.get(0);
		for(int i = 1; i < vehiculos.size(); i++) {
			if(!this.esMasCaro(vehiculoMasBarato, i)) {
				vehiculoMasBarato = vehiculos.get(i);
			}
		}
		return vehiculoMasBarato;
	}
	public Vehiculo modeloQueContieneLaY(List<Vehiculo> vehiculos) {
		Vehiculo vehiculoBuscado = null;
		for(int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getModelo().contains("Y")) {
				vehiculoBuscado = vehiculos.get(i);
			}
		}
		return vehiculoBuscado;
	}
	
	public void printVehiculoMasCaro() {
		//IMprimir marca y modelo del vehiculo mas caro.
		System.out.println("Vehículo más caro: " + vehiculoMasCaro(vehiculos).getMarca() + " " + vehiculoMasCaro(vehiculos).getModelo());
	}
	
	public void printVehiculoMasBarato() {
		// Imprimir marca y modelo del vehiculo mas barato
		System.out.println("Vehículo más barato: " + vehiculoMasBarato(vehiculos).getMarca() + " " + vehiculoMasBarato(vehiculos).getModelo());
	}
	
	public void printModeloContains_Y() {
		//Imprimir marca, modelo y precio del vehiculo que tiene la letra Y en su modelo.
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + 
			modeloQueContieneLaY(vehiculos).getMarca() + " " + 
			modeloQueContieneLaY(vehiculos).getModelo() + " " + 
			"$"+modeloQueContieneLaY(vehiculos).getPrecio());
	}
	
	public void printDatosDePrecio() {
		this.printVehiculoMasCaro();
		this.printVehiculoMasBarato();
		this.printModeloContains_Y();
		System.out.println("===============================");
	}
	
	public void orderVehiculosMayorAMenor() {
		//Ordenar de mayor precio al menor precio.
		Collections.sort(vehiculos);
	}
	
	public void printVehiculosDeMayorAMenor() {
		this.orderVehiculosMayorAMenor();
		System.out.println("Vehiculos ordenados por porecio mayor a menor: ");
		for(int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
		}
	}
}
