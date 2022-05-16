package ar.edu.unju.fi.html.model;

import java.time.LocalDate;

public class Curso {
	private int codigo;
	private String titulo;
	private String categoria;
	private LocalDate fechaInicio;
	private LocalDate fechFin;
	private int cantidadHoras;
	private String modalidad;
	private Docente docente;
	private int dos;
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	public Curso(int codigo, String titulo, String categoria, LocalDate fechaInicio, LocalDate fechFin,
			int cantidadHoras, String modalidad, Docente docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechFin = fechFin;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.dos = 2;
	}
	public int getDos() {
		return dos;
	}

	public void setDos(int dos) {
		this.dos = dos;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechFin() {
		return fechFin;
	}
	public void setFechFin(LocalDate fechFin) {
		this.fechFin = fechFin;
	}
	public int getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", categoria=" + categoria + ", fechaInicio="
				+ fechaInicio + ", fechFin=" + fechFin + ", cantidadHoras=" + cantidadHoras + ", modalidad=" + modalidad
				+ ", docente=" + docente + ", dos=" + dos + "]";
	}
	
	

}
