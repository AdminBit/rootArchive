package ud3;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Realiza la clase Java Numveces que pide números de 0 a 9 por pantalla 
//		y calcula el número de veces que han sido introducidos utilizando un array.
//		Finaliza la introducción de datos cuando se introduce un valor negativo o el array
//		está lleno. Al finalizar la introducción de datos muestra por pantalla el número de vece
//		que se ha introducido cada número.
		
		
		int numero;
		
		int[] b= {0,0,0,0,0,0,0,0,0,0};
		
		boolean k=true;
		int suma=0;// just to avoid break 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero entre 0 -9 :");
		numero= sc.nextInt();
		
		
		while(k && numero >=0 && numero <=9) {
			
			b[numero]=b[numero]+1;

			
			// aqui error otra manera sin usar break 
			for(int i=0;i<b.length;i++ ) {
				if (b[i]==0) {
					suma=suma+1;
					//k=true;
					//break;
				}
		
			}// for
			
			if(suma>0) {
				k=true;
			}else {
				k=false;
			}
			
			System.out.println("Introduzca un numero   entre 0 -9 :");
			numero= sc.nextInt();
			
			suma=0;
		}
		
		

		
		System.out.println("Array length : "+b.length);
		for(int j=0;j<b.length ;j++) {
			System.out.println(" la pos " +j+" tiene "+b[j]);

		}
		
		
		sc.close();
		
	}//

}
