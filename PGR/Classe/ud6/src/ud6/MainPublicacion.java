package ud6;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainPublicacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Profesor> arrPro = new ArrayList<Profesor>();
		ArrayList<Publicacion> arrPub = new ArrayList<Publicacion>();

		Profesor p1 = new Profesor("abc@eus.eus", "abc", "Info");
		Profesor p2 = new Profesor("abd@eus.eus", "abd", "Audio");
		Profesor p3 = new Profesor("abe@eus.eus", "abe", "Inge");
		Profesor p4 = new Profesor("abf@eus.eus", "abf", "Desgi");
		arrPro.add(p1);
		arrPro.add(p2);
		arrPro.add(p3);
		arrPro.add(p4);
		int opc;

		do {
			System.out.println("1. add profesores ");
			System.out.println("2. Añadir publicación.");
			
			System.out.println("3. A.");
			System.out.println("4.Mostrar un listado por departamento");
			
			
			System.out.println("5. Listar de los profes.");
			System.out.println("6. Salir");
			System.out.println("Que queres hacer :");

			opc = sc.nextInt();

			switch (opc) {
			case 1:
				// Introducir un nuevo profesor
				introducirProfesor(arrPro, sc);
				break;
			case 2:
				// Introducir un nuevo profesor
				introducirPublicacion(arrPro, arrPub, sc);
				break;
			case 3:
				//
				break;
			case 4:
				//
				listarDepartamentos(arrPro);
				break;
			case 5:
				listarProfesor(arrPro);
				break;
			case 6:
				System.out.println("hasta pronto..");
				break;
			default:
				System.out.println("Opcion no existe ");
				break;
			}

		} while (opc != 6);

	}// main

	//Mostrar un listado por departamento de los profesores 
	//con mayor número de publicaciones
	public static void listarDepartamentos(ArrayList<Profesor> arrPro) {
		
		for(int i=0;i<arrPro.size() ;i++) {
			//if(arrPro.get(i).getNombre_dep())
		}
		
	}
	
	public static void introducirProfesor(ArrayList<Profesor> arrPro, Scanner sc) {
		String email;
		boolean noExiste = true;

		String nombre;
		String nombre_dep;

		System.out.println("Intoduzca tu email : ");
		email = sc.next();

		// checkEmailValid(email);
		// System.out.println(checkEmailValid(email));
		if (checkEmailValid(email)) {
			for (Profesor p : arrPro) {
				if (p.getEmail().equalsIgnoreCase(email)) {
					System.out.println("Ya existe ");
					noExiste = false;
				}
			}
			if (noExiste) {
				System.out.println("Intoduzca tu nombre : ");
				nombre = sc.next();

				System.out.println("Intoduzca dep nombre : ");
				nombre_dep = sc.next();

				Profesor p = new Profesor(email, nombre, nombre_dep);
				arrPro.add(p);

			}
		}
	}

	public static void introducirPublicacion(ArrayList<Profesor> arrPro, ArrayList<Publicacion> arrPub, Scanner sc) {
		String email;
		String respuesta;
		String pub_titulo;
		String pub_fetcha;
		boolean emailExiste=false;

		System.out.println("Intoduzca tu email : ");
		email = sc.next();
		if (checkEmailValid(email)) {
			
			for (Profesor pro : arrPro) {
				if (pro.getEmail().equalsIgnoreCase(email)) {
					emailExiste=true;
					for (Publicacion pub : pro.getPub()) {
						if(pro.getPub().size()==0) {
							System.out.println("No hay ninguma publicacion");
	
						}else {
							System.out.println(pub);

						}
						do {
							do {
								System.out.println("Queres añadir publicaaciones ?(si/no)");
								respuesta = sc.next();
							} while ((!respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no")));
							if (respuesta.equalsIgnoreCase("si")) {
								System.out.println("Titulo de publicacion");
								pub_titulo = sc.next();
								do {
									System.out.println("Queres añadir  fetcha de publicaaciones ?(si/no)");
									pub_fetcha = sc.next();
									Publicacion pb= new Publicacion(pub_titulo,pub_fetcha);
									arrPub.add(pb);

								} while ((!respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no")));
							}
						}while (respuesta.equalsIgnoreCase("si"));
					
					}
				}
				
			}
			//
			if(!emailExiste) {
				System.out.println("ERROR EMAIL NO EXISTE");
			}
		}
	}

	public static void listarProfesor(ArrayList<Profesor> arrPro) {
		int i = 1;
		for (Profesor pro : arrPro) {
			System.out.println("*** Profesor nº :" + i);
			System.out.println("email  :" + pro.getEmail());
			System.out.println("nombre  :" + pro.getNombre());
			System.out.println("Depart  :" + pro.getNombre_dep());
			i++;
		}
	}

	public static boolean checkEmailValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

}// class
