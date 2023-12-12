package ud3;


import java.util.Scanner;

public class TiendaLibrosBorja {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String titulo[] = new String [20];
		int precio[] = new int [20];
		int menu=0,precioE=0;
		String tituloE="",respuesta="SI";
		
		titulo[0]="Nada";
		titulo[1]="Timidamente de la oscuridad a la luz";
		titulo[2]="Pajaros a golpes";
		titulo[3]="Caperucita Roja";
		titulo[4]="12 cuentos clasicos";
		titulo[5]="Pepe y Mila";
		titulo[6]="Enojaos";
		titulo[7]="En casa vacia";
		titulo[8]="123";
		titulo[9]="Dia Negro";
		titulo[10]="El Hobbit";
		titulo[11]="aaa";
		titulo[12]="bbb";
		titulo[13]="ccc";
		titulo[14]="ddd";
		titulo[15]="eee";
		titulo[16]="fff";
		titulo[17]="ggg";
		titulo[18]="hhh";
		titulo[19]="iii";

		
		
		precio[0]=15;
		precio[1]=12;
		precio[2]=15;
		precio[3]=25;
		precio[4]=19;
		precio[5]=17;
		precio[6]=25;
		precio[7]=13;
		precio[8]=11;
		precio[9]=18;
		precio[10]=10;
		precio[11]=20;
		precio[12]=30;
		precio[13]=40;
		precio[14]=50;
		precio[15]=60;
		precio[16]=70;
		precio[17]=80;
		precio[18]=90;
		precio[19]=100;
		
		
		System.out.println("Bienvenido/a usuario");
		do {
			System.out.println("1.Mostrar titulo de todos los libros");
			System.out.println("2.Mostrar el titulo y el precio de todos los libro");
			System.out.println("3.Mostrar el precio de un libro");
			System.out.println("4.Introducir un nuevo libro");
			System.out.println("5.Eliminar un libro");
			System.out.println("6.Modificar el precio de un libro");
			System.out.println("7.Modificar el titulo de un libro");
			System.out.println("8.Salir del programa");
			//control user choice :-) i also forget it 
			menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					sc.reset();
					sc.nextLine();
					for (int i=0;i<titulo.length;i++) {
						if(titulo[i]!=null) {
							System.out.println(titulo[i]);
						}
					}
					//it will be better to write it once on while loop
					// Not controlling if the user writes something else
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta=sc.nextLine();
					break;
				
				case 2:
					sc.reset();
					sc.nextLine();
					for (int i=0;i<titulo.length;i++) {
						if(titulo[i]!=null) {
							System.out.println("El libro con titulo: "+titulo[i]+" tiene un precio de: "+precio[i]+" Euros");
						}
					}
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta=sc.nextLine();
					break;
				
				case 3:
					boolean encontrado = false;
					int i=0;
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cual es el titulo del libro?");
					tituloE = sc.nextLine();
					while(i<titulo.length && encontrado == false) {
						if(titulo[i].equalsIgnoreCase(tituloE)) {
							System.out.println("El precio de "+titulo[i]+" son "+precio[i]+" euros");
							encontrado = true;
						}
						i++;
					}
					
					/*for(int i=0;i<titulo.length;i++) {	//MISMO PERO CON FOR
						if(titulo[i]!=null) {
							if(titulo[i].equalsIgnoreCase(tituloE)) {
								System.out.println("El precio de "+titulo[i]+" son "+precio[i]+" euros");
								encontrado = true;
							}
						}
					}*/
					if (encontrado == false) {
						System.out.println("ERROR, el libro introducido no se encuentra en la base de datos");
					}
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta=sc.nextLine();
					break;
				
				case 4: 
					sc.reset();
					sc.nextLine();
					boolean lleno = false;
					i = 0;
					while(titulo[i]!=null && i!=titulo.length && lleno == false) {
						if(i == titulo.length - 1) {
							System.out.println("La base de datos esta llena");
							lleno = true;
					}else {
						i++;
						}
					}
					
					
					if (lleno == false) {
						System.out.println("¿Cual es el titulo del libro?");
						tituloE = sc.nextLine();
						System.out.println("¿Cual es el precio?");
						precioE = sc.nextInt();
						//i love it .i did not think of it 
						while(precioE<0) {
							System.out.println("ERROR,El precio introducido no puede ser negativo");
							System.out.println("Introduzca de nuevo el precio");
							precioE = sc.nextInt();
						}
						System.out.println("El libro ha sido guardado");
						titulo[i]=tituloE;
						precio[i]=precioE;						
					}
					sc.reset();
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta=sc.nextLine();
					break;
					
				case 5:
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cuál es el título del libro?");
					tituloE = sc.nextLine();
					encontrado = false;
					
					int eliminado = -1; // Para rastrear el índice del libro eliminado
	
					for (int a = 0; a < titulo.length; a++) {
					    if (tituloE.equalsIgnoreCase(titulo[a])) {
					        eliminado = a;
					        System.out.println("El libro ha sido eliminado");
					        encontrado = true;
					    }
					}
					
					if (encontrado == false) {
						System.out.println("ERROR, el libro introducido no se encuentra en la base de datos");
					}
	
					if (eliminado != -1) {
					    for (int a = eliminado; a < titulo.length - 1; a++) {
					        titulo[a] = titulo[a + 1];
					        precio[a] = precio[a + 1];
					    }
					    titulo[titulo.length - 1] = null; // Establece el último elemento en null
					    precio[titulo.length - 1] = 0; // Establece el último precio en 0 o el valor apropiado
					}
	
					sc.reset();
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta = sc.nextLine();
					break;
					
				case 6:
					// global vriables
					encontrado = false;
					i=0;
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cual es el titulo del libro?");
					tituloE = sc.nextLine();
					//you can write just encontrado because its already false
					while(i<titulo.length && encontrado == false) {
						if(titulo[i].equalsIgnoreCase(tituloE)) {
							System.out.println("El precio de "+titulo[i]+" son "+precio[i]+" euros");
							System.out.println("Introduzca el nuevo precio de "+titulo[i]);
							// your idea about negative prices
							precio[i]=sc.nextInt();
							System.out.println("El precio se ha cambiado");
							System.out.println("El nuevo precio del libro "+titulo[i]+" son "+precio[i]+" euros");
							encontrado = true;
						}
						i++;
					}
					
					/*for(int a=0;a<titulo.length;a++) {
						if(tituloE.equalsIgnoreCase(titulo[a])) {
							System.out.println("El precio del libro "+titulo[a]+" son "+precio[a]+" euros");
							System.out.println("Introduzca el nuevo precio de "+titulo[a]);
							precio[a]=sc.nextInt();
							System.out.println("El precio se ha cambiado");
							System.out.println("El nuevo precio del libro "+titulo[a]+" son "+precio[a]+" euros");
							encontrado = true;
						}
						
					}*/
					
					if (encontrado == false) {
						System.out.println("ERROR, el libro introducido no se encuentra en la base de datos");
					}
					
					sc.reset();
					sc.nextLine();
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta = sc.nextLine();
					break;
					
				case 7:
					i=0;
					String antiguo = "";
					encontrado = false;
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cual es el titulo del libro?");
					tituloE = sc.nextLine();
					
					while(i<titulo.length && encontrado == false) {
						if(titulo[i].equalsIgnoreCase(tituloE)) {
							antiguo=titulo[i];
							System.out.println("¿Cual es el nuevo titulo de "+titulo[i]+"?");
							titulo[i]=sc.nextLine();
							System.out.println("El nuevo titulo del libro "+antiguo+" es "+titulo[i]);
							encontrado = true;
						}
						i++;
					}
					/*for(int a=0;a<titulo.length;a++) {
						if(tituloE.equalsIgnoreCase(titulo[a])) {
							antiguo=titulo[a];
							System.out.println("¿Cual es el nuevo titulo de "+titulo[a]+"?");
							titulo[a]=sc.nextLine();
							System.out.println("El nuevo titulo del libro "+antiguo+" es "+titulo[a]);
							encontrado = true;
						}
					}*/
					
					if (encontrado == false) {
						System.out.println("ERROR, el libro introducido no se encuentra en la base de datos");
					}
					
					sc.reset();
					System.out.println("¿Quieres continuar con el programa? SI/NO");
					respuesta = sc.nextLine();
					break;
					
				case 8:
					System.exit(0);
					break;
				
				default:
					System.out.println("ERROR,Tiene que elegir una opcion del menu");
					break;
			}
				
			}while(respuesta.equalsIgnoreCase("SI"));
			
			
			
			sc.close();

		}
	}
