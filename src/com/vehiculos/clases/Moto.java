package com.vehiculos.clases;

public class Moto extends Vehiculo {
	private Integer cilindradas;
	
	public Moto(String marca, String modelo, Double precio, Integer cilindradas) {
		super(marca, modelo, precio);
		this.cilindradas = cilindradas;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public int velocidadMaxima() {
		return this.esDeLujo() ? 250 : 180;
	}
	
	public boolean esDeLujo() {
		return cilindradas > 150;
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.getMarca() + 
				" // Modelo: " + this.getModelo() +
				" // Cilindradas: " + this.cilindradas +"c"+
				" // Precio: $" + this.getPrecio();
	}

	
}
