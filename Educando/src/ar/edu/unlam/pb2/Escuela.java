package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;

import ar.edu.unlam.pb2.alumno.Alumno;
import ar.edu.unlam.pb2.alumno.AlumnoDePrimaria;
import ar.edu.unlam.pb2.curso.GradoPrimaria;

public class Escuela {

	private String nombreEscuela;
	private ArrayList<GradoPrimaria> grados;
	private HashMap<Alumno, Integer> alumnos;
	
	
	
	public Escuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
		this.grados = new ArrayList<>();
		this.alumnos = new HashMap<>();
	}

	public void crearCurso(GradoPrimaria gradoPrimaria) {
		grados.add(gradoPrimaria);
	}

	public void inscribir(Alumno alumno, Integer cL) {
		alumnos.put(alumno, cL);
	}
	

}
