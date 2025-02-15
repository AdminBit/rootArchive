package ud6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMediaTemperaturas {

	public static void main(String[] args) {

		double tempera;
		double tempMedia;
		double tempSuma = 0;

		int countMayor = 0;
		int countMenos = 0;
		int countIgual = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> tempArr = new ArrayList<Double>();

		// condi-999
		// . Después calcula la temperatura media y
		// muestra el número de temperaturas que son mayores que la media, iguales que
		// la media, e inferiores a la
		// media.

		System.out.println("Introduzca la temperatura :");
		tempera = sc.nextInt();
		while (tempera != -999) {
			tempArr.add(tempera);
			tempSuma = tempSuma + tempera;

			System.out.println("Introduzca la temperatura :");
			tempera = sc.nextInt();
		}
		tempMedia = tempSuma / tempArr.size();
		System.out.println("Temp media " + tempMedia);

		// Opción 2: for each
		for (Double s : tempArr) {
			if (s > tempMedia) {
				countMayor++;
			} else if (s < tempMedia) {
				countMenos++;
			} else {
				countIgual++;
			}
		}
		System.out.println("Temp mayores que media son : " + countMayor);
		System.out.println("Temp menores que media son : " + countMenos);
		System.out.println("Temp eguales que media son : " + countIgual);

		sc.close();
	}// main

}// class
