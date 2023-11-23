package ar.edu.unlam.pb2.curso;

import ar.edu.unlam.pb2.competencia.Grado;

public abstract class Curso {

	
	private String DescripcionCurso;
	private Integer CL;
	private Integer EDAD;
	private Grado grado;

	public Curso(String DescripcionCurso, Integer CL, Integer EDAD, Grado grado) {
		this.DescripcionCurso = DescripcionCurso;
		this.CL = CL;
		this.EDAD = EDAD;
		this.grado = grado;
	}
	
	 abstract void edadPermitida(Integer EDAD);
	
}
