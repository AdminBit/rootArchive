package ud4;

import java.util.Scanner;

public class CuentasMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cuenta cuentas[] = new Cuenta[5];
		boolean salir = false;
		
		int opcion;
		int size;
		// add other funciton to control that users will not be repeated 

		do {
			System.out.println("1.Introducir cuenta/s.");
			System.out.println("2.Muestra las cuentas introducidas.");
			System.out.println("3.Ingresar una cantidad a un titular concreto introducido por teclado");
			System.out.println("4.Retirar de todas las cuentas introducidas");
			System.out.println("5.Muestra la cuenta de mayor saldo");
			System.out.println("6.Muestras las cuentas que tengan saldo superior a uno introducido por teclado.");
			System.out.println("7.Muestra la cuenta de un titular concreto");
			System.out.println("8.Muestra las cuentas de los titulares que contengan un grupo de letras");
			System.out.println("9.Ordena y muestra las cuentas según su saldo");
			System.out.println("10.Salir.");
			System.out.println("Que Quieres hacer");
			System.out.println("******************");

			opcion = sc.nextInt();

			size = mySize(cuentas);
			System.out.println("This is the array size : " + size);

			switch (opcion) {
			case 1:
				//
				introducirCuentas(cuentas, size, sc);
				break;
			case 2:
				// muestrar cuentas
				muestrarCuentas(cuentas, size);
				break;
			case 3:
				// ingressar catidad
				ingressarCantidad(cuentas, size, sc);
				break;
			case 4:
				// 4. Retirar de todas las cuentas introducidas, la comisión de 12€ (Llama al
				// método
				double comision = 12;
				retirarComision(cuentas, size);
				break;
			case 5:
				// Muestra la cuenta de mayor saldo
				// si hay solo una cuenta
				muestraCuentaMayorSaldo(cuentas, size);
				break;
			case 6:
				// . Muestras las cuentas que tengan saldo superior a uno introducido por
				// teclado.
				// Si no hay, mensaje indicándolo
				muestraCuentasSaldoMayor(cuentas, size, sc);
				break;
			case 7:
				// (Cuenta cuentas[],Scanner sc)
				muestraCuentaConcreto(cuentas, sc, size);

				break;
			case 8:
				//
				muestraCuentasConLetrras(cuentas, size, sc);
				break;
			case 9:
				// Ordena y muestra las cuentas según su saldo (de mayor a menor saldo
				// ordenar
				ordenar(cuentas, size);
				// muestra
				muestrarCuentas(cuentas, size);
				break;
			case 10:
				//
				salir = true;
				break;
			default:
				//
				System.out.println("opcion no Existe");
				break;
			}

		} while (!salir);

		sc.close();
	}// main

	// return size of the array
	public static int mySize(Cuenta c[]) {
		boolean notFound = true;
		int i = 0;
		while (notFound && i < c.length) {
			if (c[i] == null) {
				notFound = false;
			} else {
				i++;
			}
		}
		return i;
	}

	// introducir cuentas
	public static void introducirCuentas(Cuenta cuentas[], int size, Scanner sc) {
		int numCuentas;
		String titularName;
		double titualrSueldo;

		do {
			System.out.println("Cuantas cuenta/s. queris introducir :");
			numCuentas = sc.nextInt();

			if (numCuentas > (cuentas.length - size)) {
				System.out.println("no puedes depasar 50 cuentas");
			}
			
		} while (numCuentas <= 0 || numCuentas > (cuentas.length - size));

		for (int i = 0; i < numCuentas; i++) {

			System.out.println("Introduce el nombre del titular : ");
			titularName = sc.next();
			System.out.println("Introduce el sueldo del titular : ");
			titualrSueldo = sc.nextDouble();
			cuentas[size + i] = new Cuenta(titularName, titualrSueldo);
		}
	}

	// busacar cuenta para nombre
	public static int buscar(Cuenta c[], String name, int size) {
		int foundAtpos = -1;
		boolean notFound = true;
		int i = 0;
		while (notFound && i < size) {
			if (name.equalsIgnoreCase(c[i].getTitular())) {
				notFound = false;
				foundAtpos = i;
			} else {
				i++;
			}
		}
		return foundAtpos;
	}

	// 2 mostrar cuentas
	public static void muestrarCuentas(Cuenta cuentas[], int size) {
		if (size == 0) {
			System.out.println("El array esta vacia");
		}
		for (int i = 0; i < size; i++) {
			System.out.println(cuentas[i].toString());
		}
	}

	// ingressar cantidad de dinero a cuenta
	public static void ingressarCantidad(Cuenta cuentas[], int size, Scanner sc) {
		if (size == 0) {
			System.out.println("esta vacia ");
		} else {
			String titularName;
			double sueldo;
			int foundtAtposition;
			System.out.println("Introduce el nombre del titular : ");
			titularName = sc.next();

			foundtAtposition = buscar(cuentas, titularName, size);

			if (foundtAtposition == -1) {
				System.out.println("El nombre no existe");
			} else {
				do {
					System.out.println("Introduce el sueldo a ingresar : ");
					sueldo = sc.nextInt();
					if (sueldo <= 0) {
						System.out.println("No se puede ingresar sueldos negativos ");
					}
				} while (sueldo <= 0);

				cuentas[foundtAtposition].ingresar(sueldo);
			}
		}
	}

	// retirar comision de todas cuentas
	public static void retirarComision(Cuenta cuentas[], int size) {
		double comision=12;
		if (size == 0) {
			System.out.println("No hay ninguna cuenta !!");
		} else {
			System.out.println("retirar comision de 12€ de todas cuentas");

			for (int i = 0; i < size; i++) {
				// no puede ser negativo !!
				cuentas[i].retirar(comision);
			}
		}
	}

	// mostratr cuentas que tienen un sueldo mayor a sueldo intro
	public static void muestraCuentaMayorSaldo(Cuenta cuentas[], int size) {
		double mayor = 0;
		int k = -1;

		for (int i = 0; i < size; i++) {
			if (cuentas[i].getCantidad() > mayor) {
				mayor = cuentas[i].getCantidad();
				k = i;
			}
		}

		System.out.println(cuentas[k] + " Tiene mayor saldo");
	}

	public static void muestraCuentasSaldoMayor(Cuenta cuentas[], int size, Scanner sc) {
		double sueldo;
		int existe = 0;

		do {
			System.out.println("Introduce el sueldo : ");
			sueldo = sc.nextDouble();
		} while (sueldo < 0);

		for (int i = 0; i < size; i++) {
			if (cuentas[i].getCantidad() > sueldo) {
				System.out.println(cuentas[i] + " Tiene saldo mayor que " + sueldo);
				existe++;
			}
		}
		if (existe == 0) {
			System.out.println("No hay ninguna cuenta que tiene sueldo mayor que  " + sueldo);
		}
	}

	public static void muestraCuentaConcreto(Cuenta cuentas[], Scanner sc, int size) {
		if (size == 0) {
			System.out.println("El array esta vacia ");
		} else {
			String titularName;
			int foundtAtposition;

			System.out.println("Introduce el nombre del titular : ");
			titularName = sc.next();

			foundtAtposition = buscar(cuentas, titularName, size);

			if (foundtAtposition == -1) {
				System.out.println("El nombre no existe");
			} else {
				System.out.println(cuentas[foundtAtposition]);
			}
		}

	}

	public static void muestraCuentasConLetrras(Cuenta cuentas[], int size, Scanner sc) {
		if (size == 0) {

		} else {
			String letrrasName;
			System.out.println("Introduce letras que el nombre del titular tiene : ");
			letrrasName = sc.next();

			for (int i = 0; i < size; i++) {
				if (cuentas[i].getTitular().contains(letrrasName)) {
					System.out.println(cuentas[i] + " Tiene letras : " + letrrasName);
				}
			}
		}

	}

	
	// lo he cambiado
	public static void ordenar(Cuenta cuentas[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (cuentas[j].getCantidad() > cuentas[i].getCantidad()) {
					Cuenta temp;
					temp = cuentas[j];
					cuentas[j] = cuentas[i];
					cuentas[i] = temp;
				}
			}
		}
	}
	public static void ordenar2(Cuenta cuentas[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size- i - 1; j++) {
				if (cuentas[j].getCantidad() > cuentas[i].getCantidad()) {
					Cuenta temp;
					temp = cuentas[j];
					cuentas[j] = cuentas[i];
					cuentas[i] = temp;
				}
			}
		}
	}

}// class
