
package ejProp;
import javax.swing.JOptionPane;

public class O4 {

    public static void main(String[] args) {
        //M_SCA
   int continuar;

        do {
            double numero1 = 0, numero2 = 0;

            String num1Str;
            while (true) {
                num1Str = JOptionPane.showInputDialog(null, "Ingrese el primer número:", "Operaciones Matemáticas", JOptionPane.QUESTION_MESSAGE);
                if (num1Str == null || num1Str.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    numero1 = Double.parseDouble(num1Str);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

           
            String num2Str;
            while (true) {
                num2Str = JOptionPane.showInputDialog(null, "Ingrese el segundo número:", "Operaciones Matemáticas", JOptionPane.QUESTION_MESSAGE);
                if (num2Str == null || num2Str.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    numero2 = Double.parseDouble(num2Str);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplicacion = numero1 * numero2;
            String divisionResultado;

            // Manejar la división por cero :3
            if (numero2 != 0) {
                double division = numero1 / numero2;
                divisionResultado = String.valueOf(division);
            } else {
                divisionResultado = "Error: División por cero no es posible.";
            }

          
            String resultado = "Suma: " + suma + 
                               "\nResta: " + resta + 
                               "\nMultiplicación: " + multiplicacion + 
                               "\nDivisión: " + divisionResultado;
            JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);

          
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}