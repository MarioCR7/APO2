package clase5y6;

import javax.swing.JOptionPane;

public class Factorial {
	public static void main(String[]args) {
	while (true) {
		int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero positivo"));
if (num<0) {
	JOptionPane.showMessageDialog(null,"Has ingresado un numero negativo, por favor ingresa un numero positivo");
continue;
}
else if (num==0) {
	JOptionPane.showMessageDialog(null,"Has salido del programa");
	break;

}
			int resultado= calcularFactorial( num);
		JOptionPane.showMessageDialog(null,resultado);
		JOptionPane.showMessageDialog(null,"Digita un entero positivo para obtener su factorial\n"+"si deseas salir del programa digita 0");
	}
	}
	//Funcion Calcular Factorial
	public static int calcularFactorial(int x) {
	    int factorial =1;
        for (int i = 2; i <= x; i++) {
            factorial *= i;
        }
        return factorial; 
	}
}
