package ud3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrAleatorios[] = new int[15];
		int valorDado;
		String salir = "no";
		int opcion;
		int suma;
		int maximo;
		int minimo;
		double media;

		for (int i = 0; i < arrAleatorios.length; i++) {
			valorDado = (int) Math.floor(Math.random() * 100 + 1);
			arrAleatorios[i] = valorDado;
			System.out.print(arrAleatorios[i] + "  ");
		}
		System.out.println("");
		System.out.println("***************");
		do {

			suma = 0;
			maximo = 0;
			minimo = 102;
			media = 0;

			System.out.println("1. Salir");
			System.out.println("2. Mostrar la suma");
			System.out.println("3. Mostrar el máximo");
			System.out.println("4. Mostrar el mínimo");
			System.out.println("5. Mostrar la media");
			System.out.println("6. Rellenarlo de nuevo con números (formatear)");
			System.out.println("7. Ordenar ");
			do {
				System.out.println("Que quieres hacer ?");
				opcion = sc.nextInt();
			} while (opcion > 7 || opcion < 1);

			switch (opcion) {
			case 1:
				// 1. Salir
				System.out.println("Hasta pronto .. ");
				System.exit(0);
				break;

			case 2:
				// 2. Mostrar la suma
				for (int i = 0; i < arrAleatorios.length; i++) {
					suma = suma + arrAleatorios[i];
				}
				System.out.println("La suma es :" + suma);
				break;

			case 3:
				// 3. Mostrar el máximo
				for (int i = 0; i < arrAleatorios.length; i++) {
					if (arrAleatorios[i] > maximo) {
						maximo = arrAleatorios[i];
					}
				}

				System.out.println("el maximo  es :" + maximo);
				break;

			case 4:
				// 4. Mostrar el mínimo
				//minimo best practice arr[0]
				for (int i = 0; i < arrAleatorios.length; i++) {
					if (arrAleatorios[i] < minimo) {
						minimo = arrAleatorios[i];
					}
				}

				System.out.println("el maximo  es :" + minimo);
				break;

			case 5:
				// 5. Mostrar la media
				for (int i = 0; i < arrAleatorios.length; i++) {
					suma = suma + arrAleatorios[i];
				}
				media = suma / (arrAleatorios.length);
				System.out.println("La media es :" + media);
				break;

			case 6:
				// 6. Rellenarlo de nuevo con números (formatear)
				for (int i = 0; i < arrAleatorios.length; i++) {
					System.out.println("introduzca la valor en la posicion " + (i + 1));
					arrAleatorios[i] = sc.nextInt();
				}
			case 7:
				// 6. ordenar
			
				int temp;
				for (int i = 0; i < arrAleatorios.length -1; i++) {
					for (int j = i + 1; j < arrAleatorios.length; j++) {
						if (arrAleatorios[j] < arrAleatorios[i]) {
							temp = arrAleatorios[j];
							arrAleatorios[j] = arrAleatorios[i];
							arrAleatorios[i] = temp;
						}
					}
				}

				for (int i = 0; i < arrAleatorios.length; i++) {
					System.out.print(arrAleatorios[i] + "  ");
				}
				System.out.println();
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
