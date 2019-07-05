package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ofertas")
public class Oferta  {
	 @Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private Integer id;	 
	 
	 @Column (name ="titulo")
	 private String titulo;
	 
	 @Column (name ="descripcion")
	 private String descripcion;

	 @Column (name ="descuento")
	 private Double descuento;
	 
	 @Column (name ="fecha_expiracion")
	 private Date fechaExpiracion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpidacion(Date fechaExpidacion) {
		this.fechaExpiracion = fechaExpidacion;
	}

	@Override
	public String toString() {
		return "Ofertas [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", descuento=" + descuento
				+ ", fechaExpidacion=" + fechaExpiracion + "]";
	}
	 
	 
	 
	 

}
