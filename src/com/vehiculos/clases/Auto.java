package com.vehiculos.clases;

public class Auto extends Vehiculo {
	private Integer puertas;

	public Auto(String marca, String modelo, Double precio, Integer puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	
	public int velocidadMaxima() {
		return this.esDeLujo() ? 200 : 150;
	}
	
	public boolean esDeLujo() {
		return (super.getPrecio() > 225000) && (this.puertas > 3);
	}
	
	public String toString() {
		return "Marca: " + this.getMarca() + 
				" // Modelo: " + this.getModelo() +
				" // Puertas: " + this.puertas +
				" // Precio: $" + this.getPrecio();
	}
	
}
