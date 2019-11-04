package com.rgb.model.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "tb_empresa")
public class Empresa {
	
	@Id
	@Column(name = "codigo_empresa")
	private String codigo;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "descripcion", length = 500)
	private String descripcion;
	
	@Column(name = "direccion", length = 100)
	private String direccion;
	
	@Column(name = "correo", length = 50)
	private String correo;
	
	@Column(name = "telefono")
	private Integer telefono;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Servicio> servicios;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Evento> eventos;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Categoria> categorias;
	


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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	

}
