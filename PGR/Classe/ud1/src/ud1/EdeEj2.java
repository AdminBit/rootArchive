package ud1;

import java.util.Scanner;

public class EdeEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int trabajadores; 
		int dias;
		int horas;
		
		int sumaHoras=0;
		int extraHoras;
		double sumaSlario=0;


		double sueldoDiaNormal;
		double sueldoDiaExtra;

		double sumaSueldoNormal=0;
		double sumaSueldoExtra=0;

		double sueldoSemanal=0;

		double sueldoHora=45.56;
		double sueldoLimit=(45.56*8*5)+(0.3*sueldoHora*8*5);

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Numero de trabajadores :");
		
		trabajadores= sc.nextInt();
		
		for(int i=0;i<trabajadores ;i++ ) {
			//
			do {
				System.out.println("Cuantas dias por el trabajador  " +(i+1) + " : ");
				dias=sc.nextInt();
			}while(dias>5);
			
			for(int j=0 ;j<dias ;j++ ) {
				
				System.out.println("Cuantos horas has trabajado el dia  " +(+j+1)+" :");
				horas=sc.nextInt();
				while(horas>24 || horas <0) {
					System.out.println("ERROR : no puede TRABAJAR mas de 24h al dia .");
					System.out.println("Cuantos horas has trabajado el dia  " +(+j+1)+" :");
					horas=sc.nextInt();
				}
				
					if(horas>8) {
						extraHoras=horas-8;
						
						sueldoDiaNormal=8*sueldoHora;
						sumaSueldoNormal=sumaSueldoNormal+sueldoDiaNormal;
						
						sueldoDiaExtra=extraHoras*(0.3*sueldoHora + sueldoHora);
						sumaSueldoExtra=sumaSueldoExtra+sueldoDiaExtra;
					}else if(horas<=8 && horas>0) {
						sueldoDiaNormal=horas*sueldoHora;
						sumaSueldoNormal=sumaSueldoNormal+sueldoDiaNormal;

					}
					
					sueldoSemanal=sumaSueldoNormal+sumaSueldoExtra;

					
					if(sueldoSemanal>=sueldoLimit) {
						sueldoSemanal=sueldoLimit;
					}else {
						sueldoSemanal=sumaSueldoNormal+sumaSueldoExtra;
					}
				
				}
			System.out.println("******** El trabajador " + (i+1)+" ********");
			System.out.println("El trabajador " + (i+1)+" ha ganado Normal horas : "+ sumaSueldoNormal);
			System.out.println("El trabajador " + (i+1)+" ha ganado Extra horas: "+sumaSueldoExtra);
			System.out.println("El trabajador " + (i+1)+" ha ganado en TOTAL: "+ sueldoSemanal);		
			sumaSlario=sumaSlario+sueldoSemanal;

			horas=0;
			sumaHoras=0;
			sueldoSemanal=0;
			}// next trabajador
			System.out.println("Salario de todos Trabajadores : "+sumaSlario);
		// salir de el bucle trabajador 
		
		sc.close();
	}

}
