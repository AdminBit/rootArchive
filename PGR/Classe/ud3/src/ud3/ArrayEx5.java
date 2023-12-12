package ud3;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura[]= new int[7];
		String dias []= {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"	};
		String tempBajoMedia[]= new String[7];
		String tempEncimaMedia[]= new String[7];
		
		int sumaTemperatura=0;
		double mediaC;
		double mediaF;
		int masCaluroso=-100;
		int masFrio=100;

		Scanner sc = new Scanner(System.in);

//		
//		- Los días por debajo de la media.

		// llenar
		for (int i =0;i<temperatura.length ;i++) {
			System.out.println("La temperatura del dia en ºC "+ dias[i]);
			temperatura[i]=sc.nextInt();
		}
		// la suma 
		for (int i =0;i<temperatura.length ;i++) {
			sumaTemperatura=sumaTemperatura+temperatura[i];
		}
		// la media en F and C 
		mediaC=(double)sumaTemperatura/temperatura.length;
		mediaF=(((double)mediaC*9/5)+32);
		System.out.println("La temperatura media de este semana en ºC es "+ mediaC);
		System.out.println("La temperatura media de este semana en ºF es "+ mediaF);
		int diaMasCalor=0;
		int diaMasFrio=0;
		// El día más caluroso y más frio
		for (int i =0;i<temperatura.length ;i++) {
			if(temperatura[i]>masCaluroso) {
				masCaluroso=temperatura[i];
				diaMasCalor=i;
			}
			if(temperatura[i]<masFrio) {
				masFrio=temperatura[i];
				diaMasFrio=i;
			}
		}
	
	
		
		System.out.println("El dia el mas Calor este semana es : " + dias[diaMasCalor]);
		System.out.println("El dia el mas Frio este semana es : " + dias[diaMasFrio]);
		//- Los días por encima de la media.
		int encima=0;
		int bajo=0;
		for (int i =0;i<temperatura.length ;i++) {
			if(temperatura[i]>mediaC) {
				tempEncimaMedia[encima]=dias[i];
				encima++;
			}else if(temperatura[i]<mediaC) {
				tempBajoMedia[bajo]=dias[i];
				bajo++;
			}
		}
		//
		int z=0;
		while(tempEncimaMedia[z] != null&& z<tempEncimaMedia.length) {
			System.out.println("La temperatura encima media  "+	tempEncimaMedia[z]);
			z++;
		}
		
		
		int y=0;
		while(tempBajoMedia[y] != null && y<tempBajoMedia.length) {
			System.out.println("La temperatura bajo media  "+tempBajoMedia[y]);
			y++;
		}
		
		
		sc.close();
	}// main

}
