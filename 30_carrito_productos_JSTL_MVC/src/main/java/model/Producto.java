package model;

public class Producto {
	private String nombre;
	private double precio;
	private String categoria;
	public Producto( String nombre, double precio,String categoria) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto() {
		super();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
