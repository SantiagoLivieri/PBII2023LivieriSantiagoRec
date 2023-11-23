package ar.edu.unlam.pb2.curso;

import java.util.ArrayList;

import ar.edu.unlam.pb2.competencia.Grado;
import ar.edu.unlam.pb2.docente.Docente;

public class GradoPrimaria extends Curso{

	private ArrayList<GradoPrimaria> grados;
	private ArrayList<Docente> docentes;
	
	public GradoPrimaria(String DescripcionCurso, Integer CL, Integer EDAD, Grado grado) {
		super(DescripcionCurso, CL, EDAD, grado);
		// TODO Auto-generated constructor stub
		this.grados = new ArrayList<>();
		this.docentes = new ArrayList<>();
	}

	@Override
	void edadPermitida(Integer EDAD) {
		// TODO Auto-generated method stub
		
	}

	public void setDocente(Docente docente) {
		docentes.add(docente);
		}




}
