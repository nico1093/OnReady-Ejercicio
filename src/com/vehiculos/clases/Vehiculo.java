package com.vehiculos.clases;

public class Vehiculo implements Comparable<Vehiculo>{
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
		if(o.getPrecio() > this.precio) {
			return 1;
		}else if(o.getPrecio() > this.precio) {
			return 0;
		}else {
			return -1;
		}
	}
	
	

}
