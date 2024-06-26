package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="resultados")//la entidad singular, y la tabla en plurales, son convenios.

public class Resultado {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idResultado;
	@Column(name ="url")
	private String url;
	private String tematica;
//	@Transient // una anotación de jakarte de agunos atributos que no están asociado a ninguna columna.
	private String descripcion;
	public Resultado(int idResultado, String url, String tematica, String descripcion) {
		super();
		this.idResultado = idResultado;
		this.url = url;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}
	public Resultado() {
		super();
	}
	public int getIdResultado() {
		return idResultado;
	}
	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}
	public String getEnlace() {
		return url;
	}
	public void setEnlace(String url) {
		this.url = url;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
