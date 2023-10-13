package clase5y6;

import javax.swing.JOptionPane;

public class contenedoras {
    public static void main(String[] args) {
        // Uso de contenedoras
        // Constantes
        double notas[] = new double[3];
        double promedio;
        notas[0]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota "));
        notas[1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota "));
        notas[2]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota "));
        promedio=(notas[0]+notas[1]+notas[2])/3;
        JOptionPane.showMessageDialog(null, "el promedio es "+promedio);

    }
}	        JOptionPane.showMessageDialog(null, asignaturas[0]+" : "+notas[0]+"\n"+asignaturas[1]+" : "+notas[1]+"\n"+asignaturas[2]+" : "+notas[2]+"\n"+asignaturas[3]+" : "+notas[3]+"\n"+asignaturas[4]+" : "+notas[4]+"\n");
