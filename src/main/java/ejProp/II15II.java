
package ejProp;
import javax.swing.JOptionPane;

public class II15II {

    public static void main(String[] args) {
        //M_SCA

        int continuar;

        do {
            int numero = 0;
            long factorial = 1;

            String numeroStr;
            while (true) {
                numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero para calcular su factorial:", "Cálculo de Factorial", JOptionPane.QUESTION_MESSAGE);
                if (numeroStr == null || numeroStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    numero = Integer.parseInt(numeroStr);
                    if (numero < 0) {
                        JOptionPane.showMessageDialog(null, "El número no puede ser negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Calcular el factorial :b
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial, "Resultado de Factorial", JOptionPane.INFORMATION_MESSAGE);

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea calcular otro factorial?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}
