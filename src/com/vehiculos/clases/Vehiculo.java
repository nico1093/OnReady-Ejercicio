package com.vehiculos.clases;

import com.vehiculos.interfaces.Mobible;

public abstract class Vehiculo implements Comparable<Vehiculo>,Mobible{
	private String marca;
	private String modelo;
	private Double precio;
	
	public Vehiculo(String marca, String modelo, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public int compareTo(Vehiculo o) {
		return o.getPrecio() < this.precio ? -1 : (o.getPrecio() == 0 ? 0 : 1);
	}
	
	

}
