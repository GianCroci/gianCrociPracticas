package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Persona {

	private String nombre;
	private Integer documento;
	private Integer edad;

	public Persona(String nombre, Integer documento, Integer edad) {
		
		this.nombre = nombre;
		this.documento = documento;
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(documento, other.documento) && Objects.equals(edad, other.edad)
				&& Objects.equals(nombre, other.nombre);
	}
	
	

}
