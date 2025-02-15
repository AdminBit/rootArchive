package ud6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCadenasMenu {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();

		int opc;
		
		do {
			System.out.println("1.Añadir String. Pide un String y lo añade al array.");
			System.out.println("2.Buscar String. Pide un String y lo busca en el array. Muestra un mensaje con la posición en que se.encuentra o un mensaje de error si no se encuentra en el array.");
			System.out.println("3.Borrar String. Pide un String y lo elimina, si es que existe, del array.");
			System.out.println("4.Listar Array. Muestra todos los elementos del array por pantalla, si es que tiene elementos.");
			System.out.println("5.Salir. Realiza las operaciones necesarias para la correcta finalización del programa.");
			System.out.println("Que queres hacer :");
			opc=sc.nextInt();
			
			switch (opc) {
			case 1 : 
				//Añadir String
					anadirString(sc,arr);
				break;
			case 2 : 
				//
				int pos;
				pos = buscarString(sc,arr);
				if(pos==-1) {
					System.out.println("NO existe ");
				}else {
					System.out.println("existe en la posicion "+pos);
				}
				break;
			case 3 : 
				//
				borrarString(sc,arr);
				break;
			case 4 : 
				//
				listarArray(sc,arr);
				break;
			case 5 : 
				//
				System.out.println("Bye Bye...");
				break;
			}
			
		}while(opc !=5);
	
	}//main 
	
	public static void anadirString(Scanner sc, ArrayList<String> arr) {
		String entrada;
		System.out.println("un String ");
		entrada= sc.next();
		arr.add(entrada);
	}
	
	public static int buscarString(Scanner sc, ArrayList<String> arr) {
		String entrada;
		System.out.println("un String ");
		entrada= sc.next();
		return arr.indexOf(entrada);	
	}

	
	public static void borrarString(Scanner sc, ArrayList<String> arr) {
		String entrada;
		boolean del;
		System.out.println("un String ");
		entrada= sc.next();
		del=arr.remove(entrada);
		if(del) {
			System.out.println(" se ha borrado ..");
		}
		else {
			System.out.println(" no existe");
		}
	}
	
	public static void listarArray(Scanner sc, ArrayList<String> arr) {
		System.out.println("***** for ******");

		for(int i=0;i<arr.size() ;i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("***** for each ******");
		// Opción 2: for each
		for (String s : arr) {
		System.out.println(s);
		}
		
		
		// Opción 3: iterator
		System.out.println("***** Iterator ******");
		Iterator<String> i = arr.iterator();
		while (i.hasNext()) {
		 System.out.println(i.next());
		}
	}
	

}//class
