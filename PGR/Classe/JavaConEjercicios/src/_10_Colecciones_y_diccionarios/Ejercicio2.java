package _10_Colecciones_y_diccionarios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
//		ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
//		números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
//		y 20 elementos ambos inclusive.
		ArrayList<Integer> listNum= new ArrayList<Integer>();
		Random rand = new Random();
		int size,valore;
		int min=101;
		int max=-1;
		int suma=0;
		size=rand.nextInt(10,21);
		System.out.println("** size = "+size +"**");
		for(int i=0;i<size ;i++) {
			valore=rand.nextInt(0,101);
			listNum.add(valore);
			suma=suma+valore;
		}
		System.out.println("suma =" +suma );
		System.out.println("media =" +suma/(double)size );
		for(int i:listNum) {
			if(i>max) {
				max=i;
			}else if(i<min) {
				min=i;
			}
			System.out.println(i);
		}
		System.out.println("Max ="+max);
		System.out.println("Min ="+min);
	}//main

}
