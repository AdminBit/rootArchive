package ud3;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
	
//Realiza la clase Java Arraysumaprimo que pide números enteros por pantalla
//y los almacena en un array hasta que se introduzca un número negativo que no será
//tenido en cuenta o el array esté lleno. Después calcula la suma de
//todos ellos y comprueba si esa suma es un número primo o no.
		
	
		int arr[] = new int [10];
		int numero;
		int j=0;
		int suma=0;
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un número positivo : ");
		numero=sc.nextInt();
		
		while(numero>0 && j<10) {
			arr[j]= numero;
			System.out.println("introduzca un número positivo : ");
			numero=sc.nextInt();
			j++;
		}
		
		for(int i =0;i<j ;i++ ) {
			suma=suma+arr[i];
		}
		
		for(int k=2 ;k<=suma ;k++ ) {
			if(suma %k ==0) {
				count++;
			}
		}
		
		if(count==1) {
			System.out.println("el numero  : "+ suma +" es primero");
		}else {
			System.out.println("el numero  : "+ suma +" NO es primero");

		}
		
		sc.close();
	}//main

}
