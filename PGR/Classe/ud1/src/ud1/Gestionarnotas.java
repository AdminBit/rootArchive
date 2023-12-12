package ud1;

import java.util.Scanner;

public class Gestionarnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String usario,name,suraName,password,msg="";
		int opcion;
		double notaEx1,notaEx2,notaEx3,notaUltimo,notaTrabajo,notaFinal;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Introduce tu usuario:");
		usario=sc.next();
		
		do {
			System.out.println("Introduce tu contraseña");
			password=sc.next();
			if(password.contains("e") || password.contains("E")) {
				System.out.println("ERROR, en la contraseña no puede aparecer la letra e.Introduce de nuevo, por favor:");
			}
		}while(password.contains("e") || password.contains("E"));
		
		//menu 
		System.out.println("Que Quires Hacer:");
		System.out.println("1 .- Introducir notas.");
		System.out.println("2 .- Salir del programa");


		opcion=sc.nextInt();
		switch(opcion) {
		case 1 :
		
			System.out.println("Introduce tu nombre:");
			name=sc.next();
			System.out.println("Introduce tu apellido:");
			suraName=sc.next();
			System.out.println("Introducir Notas");

			do {			
				System.out.println("Introducir la nota del examen 1 : ");
				notaEx1=sc.nextInt();
				if(notaEx1 >10 ) {
					System.out.println( notaEx1 +  " ERROR ! La nota no puede ser mayor a 10 " );
				}else if(notaEx1< 0 ) {
					System.out.println( notaEx1 +  " ERROR ! La nota no puede ser negativa. " );
				}
			}while(notaEx1<0 || notaEx1>10);
				

			do {			
				System.out.println("Introducir la nota del examen 2 : ");
				notaEx2=sc.nextInt();
				if(notaEx2 >10 ) {
					System.out.println( notaEx2 +  " ERROR ! La nota no puede ser mayor a 10 "  );
				}else if(notaEx2< 0 ) {
					System.out.println( notaEx2 +  " ERROR! La nota no puede ser negativa. " );
				}
			}while(notaEx2<0 || notaEx2>10);
			
			do {			
				System.out.println("Introducir la nota del examen 3 : ");
				notaEx3=sc.nextInt();
				if(notaEx3 >10 ) {
					System.out.println( notaEx3 +  " ERROR ! La nota no puede ser mayor a 10 "  );
				}else if(notaEx2< 0 ) {
					System.out.println( notaEx3 +  " ERROR! La nota no puede ser negativa. " );
				}
			}while(notaEx3<0 || notaEx3>10);
			// 3 exam 
			
			do {			
				System.out.println("Introducir la nota del último examen : ");
				notaUltimo=sc.nextInt();
				if(notaUltimo >10 ) {
					System.out.println( notaUltimo + " ERROR ! La nota no puede ser mayor a 10 "  );
				}else if(notaUltimo< 0 ) {
					System.out.println( notaUltimo +  " ERROR! La nota no puede ser negativa. " );
				}
			}while(notaUltimo<0 || notaUltimo>10);
			// ultimo
			
			do {			
				System.out.println("Introducir la nota del trabajo: ");
				notaTrabajo=sc.nextInt();
				if(notaTrabajo >10 ) {
					System.out.println( notaUltimo + " ERROR ! La nota no puede ser mayor a 10 "  );
				}else if(notaTrabajo< 0 ) {
					System.out.println( notaUltimo +  " ERROR! La nota no puede ser negativa. " );
				}
			}while(notaTrabajo<0 || notaTrabajo>10);
			// trabajo 
			
			// calcul de nota final 
			notaFinal=((notaEx1+notaEx1+notaEx3)/3)*0.55 + (notaUltimo * 0.30)+ (notaTrabajo*0.15);
			if(notaFinal>=0 && notaFinal<5) {
				msg ="SUSPENSO";
			}else if(notaFinal>=5 && notaFinal<6){
				msg ="SUFICIENTE";	
			}else if(notaFinal>=6 && notaFinal<7){
				msg ="BIEN";	
			}else if(notaFinal>=7 && notaFinal<9){
				msg ="NOTABLE";	
			}
			else if(notaFinal>=9 && notaFinal<=10){
				msg ="SOBRESALIENTE";	
			}
	

			System.out.println("La nota final del alumno "+ name + " "+ suraName +" es " + notaFinal +" , " +msg);

			break;
		case 2:
			System.out.println("Muchas gracias y hasta pront");
			System.exit(2);
			break;
		default:
			System.out.println("opcion no existe !");
		}
		sc.close();
	}

}
