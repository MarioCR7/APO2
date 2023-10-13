package clase5y6;

import javax.swing.JOptionPane;

public class funciones {
	public static void main(String[]args) {

int x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero")); 
int y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero")); 
int z=suma(x,y);
JOptionPane.showMessageDialog(null,"La suma es: "+z);
int a=resta(x,y);
JOptionPane.showMessageDialog(null,"La resta es: "+a);
int b=multiplicacion(x,y);
JOptionPane.showMessageDialog(null,"La multiplicacion es: "+b);
double c=division(x,y);
JOptionPane.showMessageDialog(null,"La division es: "+c);

}

	public static int suma(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
	public static int resta(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}
	
	public static int multiplicacion(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	public static double division(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}
}