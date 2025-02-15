package ud6;

import java.util.ArrayList;

public class Profesor {
	
	private String email;
	private String nombre;
	private String nombre_dep;
	ArrayList<Publicacion> pub =new ArrayList<Publicacion>();

	public Profesor() {
		
	}
	public Profesor(String email,String nombre,String nombre_dep) {
		 this.email=email;
		 this.nombre=nombre;
		 this.nombre_dep=nombre_dep;
	}
	public Profesor(String email,String nombre,String nombre_dep,ArrayList<Publicacion> pub) {
		 this.email=email;
		 this.nombre=nombre;
		 this.nombre_dep=nombre_dep;
		 this.pub=pub;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre_dep() {
		return nombre_dep;
	}

	public void setNombre_dep(String nombre_dep) {
		this.nombre_dep = nombre_dep;
	}

	public ArrayList<Publicacion> getPub() {
		return pub;
	}

	public void setPub(ArrayList<Publicacion> pub) {
		this.pub = pub;
	}

	@Override
	public String toString() {
		return "Profesor [email=" + email + ", nombre=" + nombre + ", nombre_dep=" + nombre_dep + ", pub=" + pub + "]";
	}
	
	
	
	
}
