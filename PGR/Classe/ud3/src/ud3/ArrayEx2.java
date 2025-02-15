package ud3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr[] = { "aaa", "bbb", "ccc", "ddd", "aaa" };

		String salir = "no";
		String nombre;
		int opcion;
		int count;
		boolean existe;

		System.out.println("");
		System.out.println("***************");
		do {
			count = 0;
			existe = false;

			System.out.println("1. Salir");
			System.out.println("2. Mostrar lista");
			System.out.println("3. Pedir un nombre y contar las veces que aparece");
			System.out.println("4. Pedir un nombre y decir si existe");
			System.out.println("5. Eliminar. Pedir un nombre y en el lugar de ese nombre introducir “null”.");
			do {
				System.out.println("Que quieres hacer ?");
				opcion = sc.nextInt();
			} while (opcion > 5 || opcion < 1);

			switch (opcion) {
			case 1:
				// 1. Salir
				System.out.println("Hasta pronto .. ");
				System.exit(0);
				break;

			case 2:
				// 2. Mostrar lista
				for (int i = 0; i < arr.length; i++) {
					//
					if(arr[i]!= null) {
						System.out.println(arr[i]);

					}
				}

				break;

			case 3:
				// 3.Pedir un nombre y contar las veces que aparece
				System.out.println("Introduzca nombre que buscas : ");
				sc.reset();
				sc.nextLine();
				nombre = sc.nextLine();
				for (int i = 0; i < arr.length; i++) {
					if (nombre.equalsIgnoreCase(arr[i])) {
						existe = true;
						count++;
					}
				}
				if (existe) {
					System.out.println("La palabra " + nombre + "existe " + count + " veces");

				} else {
					System.out.println(nombre + " No existe");
				}
				break;

			case 4:
				// 4. Pedir un nombre y decir si existe
				System.out.println(" Introduzca nombre que buscas : ");
				sc.reset();
				sc.nextLine();
				nombre = sc.nextLine();
				// while is better 
				for (int i = 0; i < arr.length; i++) {
					if (nombre.equalsIgnoreCase(arr[i])) {
						existe = true;
					}
				}
				if (existe) {
					System.out.println(nombre + " existe");

				} else {
					System.out.println(nombre + " No existe");

				}

				break;

			case 5:
				// 5. Eliminar. Pedir un nombre y en el lugar de ese nombre introducir “null”.
				
				// best is for if its repeated 
				System.out.println(" Introduzca nombre que buscas : ");
				sc.reset();
				sc.nextLine();
				int k = -1;
				nombre = sc.nextLine();
				for (int i = 0; i < arr.length; i++) {
					if (nombre.equalsIgnoreCase(arr[i])) {
						existe = true;
						k = i;
					}
				}
				if (existe) {
					arr[k] = null;

				} else {
					System.out.println(nombre + " No existe");

				}

				break;

			default:
				System.out.println("ERROR ocion no existe !");
				break;
			}// switch

			do {
				System.out.println("Quieres salir ?(si/no)");
				salir = sc.next();
			} while (!(salir.equalsIgnoreCase("si") || salir.equalsIgnoreCase("no")));

		} while (salir.equalsIgnoreCase("no"));


		sc.close();

	}// main

}
