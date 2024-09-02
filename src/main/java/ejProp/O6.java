
package ejProp;
import javax.swing.JOptionPane;
public class O6 {
    
    public static void main(String[] args) {
        //M_SCA
  int continuar;

        do {
            double numero1 = 0, numero2 = 0, numero3 = 0;

            // PRIMER NÚMERO
            String num1Str;
            while (true) {
                num1Str = JOptionPane.showInputDialog(null, "Ingrese el primer número:", "Cálculo de la Media", JOptionPane.QUESTION_MESSAGE);
                if (num1Str == null || num1Str.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    numero1 = Double.parseDouble(num1Str);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // SEGUNDO NÚMERO
            String num2Str;
            while (true) {
                num2Str = JOptionPane.showInputDialog(null, "Ingrese el segundo número:", "Cálculo de la Media", JOptionPane.QUESTION_MESSAGE);
                if (num2Str == null || num2Str.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    numero2 = Double.parseDouble(num2Str);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            //TERCDER NÚMERO
            String num3Str;
            while (true) {
                num3Str = JOptionPane.showInputDialog(null, "Ingrese el tercer número:", "Cálculo de la Media", JOptionPane.QUESTION_MESSAGE);
                if (num3Str == null || num3Str.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    numero3 = Double.parseDouble(num3Str);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Calcular la media :b
            double media = (numero1 + numero2 + numero3) / 3;


            String resultado = "La media de los tres números es: " + media;
            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);


            continuar = JOptionPane.showConfirmDialog(null, "¿Desea calcular la media de otros tres números?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}