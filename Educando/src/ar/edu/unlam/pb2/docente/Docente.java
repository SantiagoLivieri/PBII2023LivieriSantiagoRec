package ar.edu.unlam.pb2.docente;

import ar.edu.unlam.pb2.competencia.Grado;

public class Docente {

	private String nombreDocente;
	private Grado grado;

	public Docente(String nombreDocente) {
		// TODO Auto-generated constructor stub
		this.nombreDocente = nombreDocente;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public void agregarCompetencia(Grado grado) {
		this.grado = grado;
		
	}

}
