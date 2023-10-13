package clase3;

import java.util.Scanner;

public class Menu {
	public static void main(String[]args) {
		System.out.print("Menu\n"+"1:Comversor moneda\n"+ "2:Promedio notas\n"+ "3:Clasificacion equipo\n"+ "4:Par o Impar\n"+ "5:Exit\n");
	
		Scanner sc=new Scanner (System.in);
		double opcion = sc.nextDouble();
		
		if (opcion==1) {	
			System.out.print("Bienvenido al comversor dijita tu valor en pesos:");
			Scanner sc1=new Scanner (System.in);
			float pesos = sc1.nextFloat();
			float dollar = 4150;
			float resul = 0;
			resul= (pesos/dollar);
			System.out.print("el rsultado en dolares es:" +resul);
		}
		
		else if (opcion==2) {
			System.out.print("Bienvenido al promedio de notas\n"+"Ingresa las 3 notas notas seguidas de un enter");
			float resul = 0;
			float nota1 = sc.nextFloat();
			float nota2 = sc.nextFloat();
			float nota3 = sc.nextFloat();
			resul= ((nota1+nota2+nota3)/3);
			System.out.println(resul);
		}
	
		else if (opcion==3) {
			System.out.print("Bienvenido al Clasificacion equipo\n"+"Ingresa el numero de partidos ganados\n");
			double pg= sc.nextDouble();
			System.out.print("Ingresa el numero de partidos empatados");
			double pe= sc.nextDouble();
			System.out.print("Ingresa el numero de partidos perdidos");
			double pp= sc.nextDouble();
			double Tpuntos= (pg*3)+(pe*1);
			System.out.print("Puntos totales:"+ Tpuntos);
		}
		
		else if (opcion==4) {
			System.out.print("Bienvenido al par o impar, digita tu numero");
			
			int x = sc.nextInt();
			int num =0;
			float par   = 0;
			float impar = 0;
			boolean result = num%2==0;
			if (x==0) {
				System.out.print("es cero:");
			}
			else if (x>0) {
			
			if (x%2==0) { 
				System.out.print("es par:");
			}	
			else if (x>0) {
				System.out.print("es impar");
			}
			}
		}
		else if (opcion==5) {
			System.out.print("Has salido del menu");
		}
		
		else if (opcion>5) {
			System.out.print("Esta opcion no esta en el menu");
		}
	}
	}


