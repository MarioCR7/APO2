package clase5y6;

import javax.swing.JOptionPane;

public class MenuNew {
	public static void main(String[]args) {
		JOptionPane.showMessageDialog(null, "1:conversor de moneda\n 2:promedio de notas\n 3:partidos\n 4:pares e impares\n 5:salida","WELCOME TO THE MENU",-1);

		int op =0;
		while(op!=5) {	 
			int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge una opcion\n 1:conversor de moneda\n 2:promedio de notas\n 3:partidos\n 4:pares e impares\n 5:salida"));
		switch (op1) {
		case 1:

			int pesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los pesos a calcular"));
			int dollar = 4150;
			double resul = 0;
			resul= (pesos/dollar);
			JOptionPane.showMessageDialog(null, "el resultado en pesos del conversor de moneda es:"+resul);

		break;
		
		case 2:
			
			int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota 1 para su promedio"));
			int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota 1 para su promedio"));
			int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota 1 para su promedio"));
			double prom= ((nota1+nota2+nota3)/3);
			JOptionPane.showMessageDialog(null, "El promedio de notas es:"+prom);
			break;
		
		case 3:
			int pg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de partidos ganados"));
			int pe = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de partidos empatados"));
			double result= (pg*3)+(pe*1);
			JOptionPane.showMessageDialog(null, "el total de los puntos para los partidos es"+result);

		case 4:
			int x1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los numeros para su determinacion"));
			int num1 =0;
			float par   = 0;
			float impar = 0;
			boolean resultado = num1%2==0;
			 if (x1==0) {
				 JOptionPane.showMessageDialog(null, "es cero");
			}
			 else if (x1>0) {
				 
			 if (x1%2==0) {
				 JOptionPane.showMessageDialog(null, "es par");
			 }
			
		   else if (x1>0) {
				 JOptionPane.showMessageDialog(null, "es impar");
		   }
		   }
		   break;
		   
		case 5 :
			
			 JOptionPane.showMessageDialog(null, "EXIT");
		break;
		default:
			 JOptionPane.showMessageDialog(null, "Numero no valido");		}
	
}
}
}

