package ud3;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//. Realiza la clase Java Medianum que pide números por pantalla y los almacena 
		//en un array hasta que se introduzca
		//un número negativo que no será tenido en cuenta o el array esté lleno.
		//Después calcula la Media y la muestra.

		int n= 5;
		int numero;
		double media=0.0;
		int[] b= new int[n];
		
		int i=1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero positivo :");
		numero= sc.nextInt();
		b[0]=numero;
		media=media+b[0];
		
		while( numero >=0 && i<b.length) {
			
			System.out.println("Introduzca un numero positivo :");
			numero= sc.nextInt();
			
			b[i]=numero;
			media=media+b[i];
			i++;
	

		}
		media=media/i;
	
		/*for(int j=0;j<i ;j++) {
			sum=b[j]+sum;
			
		}
		*/
		System.out.println(media);
		System.out.println(i);
		for(int j=0 ;j<b.length;j++) {
			System.out.print(b[j]+ " \t ");
		}
		
		
		sc.close();
	}

}
