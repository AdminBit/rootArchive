package ud1;

import java.util.Scanner;

public class MenuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,palabra1,palabra2;
		int opcion,numero;
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cual es tu nombre ? ");
		name=teclado.next();
		System.out.println("Bienvenido " + name + ". ¿Qué quieres hacer? ");

		System.out.println("1.- Dar la vuelta a una palabra.");
		System.out.println("2.- Comparar dos palabras.");
		System.out.println("3.-Numero de letras");
		System.out.println("4.- Repetir palabra");
		System.out.println("5.- Repetir palabra (Mayúscula / Minúscula)");
		System.out.println("6.- Salir del programa");

		
		opcion=teclado.nextInt();

		
		switch(opcion) {
		case 1:
			// dar la vuelta a una palabra
			System.out.println("palabra 1 ");
			palabra1=teclado.next();
						
			StringBuffer str=new StringBuffer(palabra1);
			str.reverse();
			System.out.println(" la palabra antes : " + palabra1);
			System.out.println(" la palabra antes : " + str);

			
			break;
		case 2:
			System.out.println("2" );
			//comarar dos palabras
			System.out.println("palabra 1 ");
			palabra1=teclado.next();
			System.out.println("palabra 2 ");
			palabra2=teclado.next();
			if(palabra1.equals(palabra2)) {
				System.out.println(palabra1 + " y " + palabra2 + " son eguales");
			}else {
				System.out.println(palabra1 + " y " + palabra2 + " NO son eguales");
			}
			
			break;
		case 3:
			// numero de letras 
			System.out.println("Inserta una palabra: ");
			palabra1=teclado.next();
			
			if(palabra1.length()>=7) {
				System.out.println("Numero de letras: " + palabra1.length());
				System.out.println("El tamaño de la palabra es grande.");
			}else {
				System.out.println("Numero de letras: " + palabra1.length());
				System.out.println("El tamaño de la palabra es pequeño");

			}
		
			break;
		case 4:
			// repetir n veces
			System.out.println("Inserta la palabra que quieras repetir: " );
			palabra1=teclado.next();
			System.out.println("¿Cuantas veces la quieres repetir?: " );
			numero=teclado.nextInt();
			for(int i=0;i<numero ;i++ ) {
				
				System.out.println(palabra1.toUpperCase() + " ");
				System.out.println(numero + " veces");
			}

			break;
		case 5 :
			//System.out.println("5" );
			//¿Mayúscula o Minúscula?: Minuscula
			System.out.println("Inserta la palabra que quieras repetir: " );
			palabra1=teclado.next();
			
			
			System.out.println("elige may por Mayúscula o min por Minúscula" );

			String ch;
			ch=teclado.next();

			switch(ch) {
			case "may || MAY":

				System.out.println("¿Cuantas veces la quieres repetir?" );
				numero=teclado.nextInt();

				while(numero>6) {
					System.out.println("No se puede repetir más de 6 veces" );
					System.out.println("¿Cuantas veces la quieres repetir?" );
					numero=teclado.nextInt();
				}
				
				for(int i=0;i<numero ;i++ ) {
					System.out.print(palabra1.toUpperCase()+ " ");
				}	
				break;
			case "min || MIN ":
				System.out.println("¿Cuantas veces la quieres repetir?" );
				numero=teclado.nextInt();

				while(numero>6) {
					System.out.println("No se puede repetir más de 6 veces" );
					System.out.println("¿Cuantas veces la quieres repetir?" );
					numero=teclado.nextInt();
				}
				
				for(int i=0;i<numero ;i++ ) {
					System.out.print(palabra1.toLowerCase()+ " ");
				}	
				
				break;
			default:
				System.out.println("no exit " );

				
			}
	
			break;
			
		case 6 :
			// slair de programa
			System.out.println("Muchas gracias y hasta pronto." );
			System.exit(6);
			break;
		default:
			System.out.println("ERROR");

		teclado.close();
	}

	}
	
}
