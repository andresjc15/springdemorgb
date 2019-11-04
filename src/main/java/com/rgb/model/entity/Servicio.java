package com.rgb.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_servicios")
public class Servicio {
	
	@Id
	@Column(name = "codigo_servicios")
	private String codigo;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "descripcion", length = 100)
	private String deescripcion;
	
	@Column(name = "image", length = 300)
	private String imagen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_empresa")
	private Empresa empresa;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDeescripcion() {
		return deescripcion;
	}

	public void setDeescripcion(String deescripcion) {
		this.deescripcion = deescripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
