package ud1;

import java.util.Scanner;

public class Ejer112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,n=0,sum;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cual es tu nombre ? ");
		numero=teclado.nextInt();
		 sum=0;
		 
			while(n<=numero) {
				sum = sum + n;
				if(n==numero ) {
					System.out.print("Suma es : " + sum);
				}
				n++;
			}
			
			teclado.close();
	}

}
