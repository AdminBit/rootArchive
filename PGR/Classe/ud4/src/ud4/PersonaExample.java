package ud4;

import java.util.Arrays;

public class PersonaExample {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean vivo;
	private double altura;
	private String hijos[];

	// constructor mismo nombre que la class
	// constructor 1
	public PersonaExample() {
		this.dni = "12345A";
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.vivo = true;
		this.altura = 0.0;
		this.hijos = new String[10];
	}
	// otro constructor 2

	public PersonaExample(String apellidos, int edad) {
		this.dni = "12345A";
		this.nombre = "";
		this.apellidos = apellidos;
		this.edad = edad;
		this.vivo = true;
		this.altura = 0.0;
		this.hijos = new String[10];
	}

	// otro constructor 3

	public PersonaExample(int e, boolean v, double a) {
		this.dni = "12345A";
		this.nombre = "";
		this.apellidos = "";
		this.edad = e;
		this.vivo = v;
		this.altura = a;
		this.hijos = new String[10];
	}
	
	// constructor copia existe pero no se usa mucho !!
	public PersonaExample(PersonaExample pers) {
		this.dni = pers.dni;
		this.nombre = pers.nombre;
		this.apellidos =pers.apellidos;
		this.edad = pers.edad;
		this.vivo = pers.vivo;
		this.altura = pers.altura;
		this.hijos = pers.hijos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String[] getHijos() {
		return hijos;
	}

	public void setHijos(String[] hijos) {
		this.hijos = hijos;
	}

	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", vivo="
				+ vivo + ", altura=" + altura + ", hijos=" + Arrays.toString(hijos) + "]";
	}
	
	// methodo 
	public int sumarEdad() {
		this.edad++;
		return this.edad;
	}
	
	
}
