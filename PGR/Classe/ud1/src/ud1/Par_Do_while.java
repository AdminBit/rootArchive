package ud1;

import java.util.Scanner;

public class Par_Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		Scanner teclado=new Scanner(System.in);
	

		do {
			System.out.println("Inroduce un numero no par ? ");
			n=teclado.nextInt();
			}while(n%2 !=0);
		
			System.out.println(" este es pare "+n);
			
			teclado.close();
		
	}

}
