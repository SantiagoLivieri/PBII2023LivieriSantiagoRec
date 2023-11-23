package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;

public class Alumno {
	
	private Integer dni;
	private String nombreEstudiante;
	private LocalDate fechaNacimiento;
	
	public Alumno(Integer dni, String nombreEstudiante, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombreEstudiante = nombreEstudiante;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
