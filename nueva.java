package clasesapo;

import javax.swing.JOptionPane;

public class nueva {
	
	public static void main(String[]args){
	 // Uso de contenedoras
    // Constantes
    double notas[] = new double[3];
    double promedio;
    notas[0]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
    notas[1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
    notas[2]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
    promedio=(notas[0]+notas[1]+notas[2])/3;
    JOptionPane.showMessageDialog(null, "Las notas son " + notas[0] + "  " + notas[1]+ "  " + notas[2]);
    JOptionPane.showMessageDialog(null, "el promedio es "+promedio);
    }
}
