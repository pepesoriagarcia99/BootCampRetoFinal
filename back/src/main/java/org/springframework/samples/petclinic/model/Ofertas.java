package org.springframework.samples.petclinic.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ofertas")
public class Ofertas  {
	 @Id
	    @Column(name = "id")
	    private String id;
	 
	 
	 @Column (name ="titulo")
	 private String titulo;
	 
	 @Column (name ="descripcion")
	 private String descripcion;

	 @Column (name ="descuento")
	 private Double descuento;
	 
	 @Column (name ="fechaExpidacion")
	 private Date fechaExpidacion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Date getFechaExpidacion() {
		return fechaExpidacion;
	}

	public void setFechaExpidacion(Date fechaExpidacion) {
		this.fechaExpidacion = fechaExpidacion;
	}

	@Override
	public String toString() {
		return "Ofertas [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", descuento=" + descuento
				+ ", fechaExpidacion=" + fechaExpidacion + "]";
	}
	 
	 
	 
	 

}
