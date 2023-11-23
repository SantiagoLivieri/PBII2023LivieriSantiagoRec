package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;


public class AlumnoDePrimaria extends Alumno{

	private ArrayList<LocalDate> asistencia;
	ChronoLocalDate ahora;
	
	public AlumnoDePrimaria(Integer dni, String nombreEstudiante, LocalDate fechaNacimiento) {
		super(dni, nombreEstudiante, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.asistencia = new ArrayList<>();
	}

	public void asistir(LocalDate now) {
		asistencia.add(now);
		
	}

	public boolean asistio(LocalDate now) {
		
		for (LocalDate localDate : asistencia) {
			if( localDate.now().equals(now.now()) );
		}
		return false;
		
	}	

}
