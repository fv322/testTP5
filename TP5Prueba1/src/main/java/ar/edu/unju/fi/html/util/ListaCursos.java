package ar.edu.unju.fi.html.util;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unju.fi.html.model.Curso;
import ar.edu.unju.fi.html.model.Docente;

public class ListaCursos {
	
	private ArrayList<Curso> cursos;
		
	public ListaCursos() {
		cursos = new ArrayList<Curso>();
		LocalDate fechaInicio, fechFin;
		Docente docente;
		
		fechaInicio = LocalDate.of(2022, 3, 14);
		fechFin = LocalDate.of(2022, 2, 21);
		docente = new Docente(1522156, "Len", "Severiano", "algun_correo@gmail.com", "1060444526");
		this.cursos.add(new Curso(100, "Alemán", "Diploma Ciclo Básico", fechFin, fechaInicio, 4, "Virtual", docente));
		
		fechaInicio = LocalDate.of(2022, 3, 5);
		fechFin = LocalDate.of(2022, 3, 17);
		docente = new Docente(1522156, "Romilda", "Zosimo", "algun_correo@gmail.com", "451690179");
		this.cursos.add(new Curso(101, "Árabe", "Diploma Ciclo de Perfeccionamiento", fechFin, fechaInicio, 5, "Presencial", docente));

		fechaInicio = LocalDate.of(2022, 6, 14);
		fechFin = LocalDate.of(2022, 6, 21);
		docente = new Docente(1522156, "Winema", "Whitney", "algun_correo@gmail.com", "667897057");
		this.cursos.add(new Curso(102, "Chino", "Diploma Ciclo Superior", fechFin, fechaInicio, 4, "Presencial", docente));
		
		fechaInicio = LocalDate.of(2022, 8, 5);
		fechFin = LocalDate.of(2022, 8, 17);
		docente = new Docente(1522156, "Neil", "Lewa", "algun_correo@gmail.com", "561725305");
		this.cursos.add(new Curso(1, "Coreano", "Diploma Ciclo Básico", fechFin, fechaInicio, 2, "Presencial", docente));
		
		fechaInicio = LocalDate.of(2022, 11, 10);
		fechFin = LocalDate.of(2022, 11, 24);
		docente = new Docente(1522156, "Wiñay", "Mangena", "algun_correo@gmail.com", "660527966");
		this.cursos.add(new Curso(1, "Hindi", "Diploma Ciclo Superior", fechFin, fechaInicio, 6, "Virtual", docente));
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	

}
