package ud3;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
//		Realiza la clase Java Contrase que pide un nombre por pantalla y una contraseña.
//		Compara los valores con unos valores predefinidos y si coinciden muestra un mensaje 
//		de bienvenida. Si no coinciden muestra un mensaje de error por pantalla.
//		El proceso se repite hasta que los datos son correctos o hasta que se produzcan más de 3 intentos.
		
		String nombre="omar";
		String passowrd="123oma";
		
		String userName;
		String userPass;
		int count=3;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca nombre : ");
		userName=sc.next();
		
		System.out.println("Introduzca password : ");
		userPass=sc.next();
		
		while(count >0 && (!userName.equals(nombre) || !userPass.equals(passowrd)) ) {
			
			System.out.println(" ERROR"); 
			
			System.out.println("Introduzca nombre : ");
			userName=sc.next();
			
			System.out.println("Introduzca password : ");
			userPass=sc.next();
			
			count--;
		}
		if(userName.equals(nombre) && userPass.equals(passowrd)) {
			System.out.println("bienvenida   "+nombre);	
		}
		
		
		sc.close();
	}//main

}
