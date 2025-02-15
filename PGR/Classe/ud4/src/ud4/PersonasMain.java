package ud4;

import java.util.Scanner;

public class PersonasMain {

	public static void main(String[] args) {

		Persona personas[] = new Persona[10];
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		
		

		int opcion;

		do {
			System.out.println("1.Introducir las personas.");
			System.out.println("2. Muestra la persona de mayor edad.");
			System.out.println("3. Muestra la información de una persona tras introducir su DNI");
			System.out.println("4. Muestra la información de todas las personas.");
			System.out.println("5. Salir");
			System.out.println("Que quieres hacer ? ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				// Introducir las personas
				introudcirPersonas(personas,sc);
				break;
			case 2:
				// Muestra la persona de mayor edad.
				muestraPersonas(personas);
				break;
			case 3:
				// 3. Muestra la información de una persona tras introducir su DNI.
				muestraPersonaConDni( personas, sc ) ;
				break;
			case 4:
				// Muestra la información de todas las persona
				muestaTodos(personas);
				break;
			case 5:
				//
				System.out.println("Hasta pronto ...");
				salir = true;
				break;
			default:
				//
				System.out.println("Opcion no Existe");
				break;
			}

		} while (!salir);

		sc.close();
	}// main

	// llenar el array
	public static void introudcirPersonas(Persona p[],Scanner sc) {
		String name;
		String dni;
		int age;
		
		for (int i = 0; i < p.length; i++) {
			p[i] = new Persona();
			System.out.println("El nombre");
			name = sc.next();
			System.out.println("El DNI");
			dni = sc.next();
			System.out.println("El edad");
			age = sc.nextInt();

			p[i].setNombre(name);
			p[i].setDNI(dni);
			p[i].setEdad(age);

		}
	}
	//
	public static void muestraPersonas(Persona p[]){
		// el nombre de la persona el mayor de edad 
		// mal entiendo
	for (int i = 0; i < p.length; i++) {
		if (p[i].esMayorDeEdad()) {
			p[i].mostrar();
		}
	}}
	public static void muestaTodos(Persona personas[]) {
		for (int j = 0; j < personas.length; j++) {
			personas[j].mostrar();
		}
	}
	
	public static void muestraPersonaConDni(Persona personas[],Scanner sc ) {
		String dni;
		System.out.println("El DNI");
		dni = sc.next();
		int i = 0;
		boolean notFound = true;
		while (notFound && i < personas.length) {
			if (dni.equalsIgnoreCase(personas[i].getDNI())) {
				notFound = true;
				personas[i].mostrar();
			}
			i++;
		}
		if (notFound) {
			System.out.println("este persona no existe");
		}
	}

}
