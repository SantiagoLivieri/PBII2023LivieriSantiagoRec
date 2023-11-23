package ar.edu.unlam.pb2.curso;

import ar.edu.unlam.pb2.competencia.Grado;

public class CursoSecundaria extends Curso{

	public CursoSecundaria(String DescripcionCurso, Integer CL, Integer EDAD, Grado grado) {
		super(DescripcionCurso, CL, EDAD, grado);
		// TODO Auto-generated constructor stub
	}

	@Override
	void edadPermitida(Integer EDAD) {
		// TODO Auto-generated method stub
		
	}

}
