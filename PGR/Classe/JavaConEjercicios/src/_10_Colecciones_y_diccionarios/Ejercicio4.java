package _10_Colecciones_y_diccionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int size=10;
		
		for(int i=0;i<size ;i++) {
			System.out.println("Introduzca palabra : ");
			arr.add(sc.next());
		}
		
		for(String s: arr) {
			System.out.println(s);
		}
		
		
		sc.close();
	}//main

}
