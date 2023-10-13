package clase5y6;
import javax.swing.JOptionPane;
public class notasContenedoras {
	    public static void main(String[] args) {

	        int cantidadNotas=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de notas "));
	        double[]notas=new double[cantidadNotas];

	        for (int i=0;i<cantidadNotas;i++) {
	        notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la nota " + (i + 1) + ":"));
	           
	        }

	        double suma=0;
	        double notaMaxima=notas[0];
	        double notaMinima=notas[0];
	        double promedio;
	        
	        for (int i=0;i<cantidadNotas;i++) {
	            suma += notas[i];
	            if (notas[i]>notaMaxima) {
	                notaMaxima=notas[i];
	            }
	            if (notas[i]<notaMinima) {
	                notaMinima=notas[i];
	            }
	        }

	        promedio =suma/cantidadNotas;
	        JOptionPane.showMessageDialog(null, "La nota maxima es" + notaMaxima + " \nLa nota minima es " + notaMinima + " \nEl promedio es " + promedio);
	    }
	}