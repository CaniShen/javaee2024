package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cursos")

public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCurso;
	@Column(name="nombre")
	private String nombre;
	private String tematica;
	private int duracion;
	private double precio;
	public Curso(int idCurso, String nombre, String tematica, int duracion, double precio) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.tematica = tematica;
		this.duracion = duracion;
		this.precio = precio;
	}
	public Curso() {
		super();
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
