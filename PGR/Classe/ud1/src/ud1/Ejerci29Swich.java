package ud1;

import java.util.Scanner;

public class Ejerci29Swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int operacion,num1,num2;
		
		Scanner teclado=new Scanner(System.in);

		System.out.println("Elige la operacion : ");
		System.out.println("\t 1. Sumar ");
		System.out.println("\t 2. Restar ");
		System.out.println("\t 3. Multiplicacion");
		System.out.println("\t 4. divsion");
		System.out.println("\t 5. modulo");
		System.out.println("\t 0. Salir");


		operacion=teclado.nextInt();
		
		if(operacion==0) {
			System.out.println("Salir de program  " );

		}
		else{
			
			System.out.println("numero 1 " );
			num1=teclado.nextInt();
			System.out.println("numero 2 " );
			num2=teclado.nextInt();
			
			switch(operacion) {
			case 1 :
				System.out.println("La suma de  " + num1 + " + " +  num2 +" = " +(num1 + num2) );
				break;
			case 2 :
				System.out.println("La resta  de  " + num1 + " - " +  num2 +" = " +(num1 - num2) );
				break;
			case 3 :
				System.out.println("La  de  " + num1 + " * " +  num2 +" = " +(num1 * num2) );
				break;
			case 4 :
				System.out.println("La  de  " + num1 + " / " +  num2 +" = " +(num1 / num2) );
				break;
			case 5 :
				System.out.println("La  de  " + num1 + " % " +  num2 +" = " +(num1 % num2) );
				break;
			default:
				System.out.println();
			}
			
		}
		
		
		
		
		teclado.close();

		
	}

}
