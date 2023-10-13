package clase5y6;

import javax.swing.JOptionPane;

public class conteNotas {
    public static void main(String[] args) {

        int notas[] = new int[20];
        for (int i=0;i<20;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce nota"+i));
        }
        
        JOptionPane.showMessageDialog(null, "el promedio es "+promedio);
    }
}