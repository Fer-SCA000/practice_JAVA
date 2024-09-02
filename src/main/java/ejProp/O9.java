

package ejProp;
import javax.swing.JOptionPane;
public class O9 {

    public static void main(String[] args) {
        //M_SCA
     int continuar;
        do {
            double numerador = 0, divisor = 0;

            String numeradorStr;
            while (true) {
                numeradorStr = JOptionPane.showInputDialog(null, "Ingrese el numerador:", "División de Números", JOptionPane.QUESTION_MESSAGE);
                if (numeradorStr == null || numeradorStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; // Repetir la solicitud
                }
                try {
                    numerador = Double.parseDouble(numeradorStr);
                    break; // Salir del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            String divisorStr;
            while (true) {
                divisorStr = JOptionPane.showInputDialog(null, "Ingrese el divisor:", "División de Números", JOptionPane.QUESTION_MESSAGE);
                if (divisorStr == null || divisorStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; // Repetir la solicitud
                }
                try {
                    divisor = Double.parseDouble(divisorStr);
                    if (divisor == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Calcular la división :b
            double resultado = numerador / divisor;
           
            String mensajeResultado = "El resultado de la división es: " + resultado;
            JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}