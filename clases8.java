package clasesapo;

import javax.swing.JOptionPane;

public class clases8 {
	    public static void main(String[] args) {
	        int op;
	        
	        while (true) {
	            op = mostrarMenu();
	            
	            switch (op) {
	                case 1:
	                    CalcFact();
	                    break;
	                case 2:
	                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
	                    System.exit(0);
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese una opción válida.");
	            }
	        }
	    }
	    
	    public static int mostrarMenu() {
	        String[] opciones = {"Calcular Factorial", "Salir"};
	        int opcionElegida = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Calculadora de Factorial", 
	                                                         JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
	                                                         null, opciones, opciones[0]);
	        return opcionElegida + 1;
	    }
	    
	    public static void CalcFact() {
	        int numero;
	        String input = JOptionPane.showInputDialog("Ingrese un número:");
	        
	        if (input == null) {
	            JOptionPane.showMessageDialog(null, "¡Hasta luego!");
	            System.exit(0);
	        }
	        
	        try {
	            numero = Integer.parseInt(input);
	            
	            if (numero < 0) {
	                JOptionPane.showMessageDialog(null, "Error: El número no puede ser negativo.");
	            } else {
	                long factorial = 1;
	                for (int i = 1; i <= numero; i++) {
	                    factorial *= i;
	                }
	                JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial);
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
	        }
	    }
	}
