
package ejProp;
import javax.swing.JOptionPane;
public class O5 {

    public static void main(String[] args) {
        //M_SCA
        
        int continuar;

        do {
            double fahrenheit = 0;

          
            String fahrenheitStr;
            while (true) {
                fahrenheitStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura en grados Fahrenheit:", "Conversión a Celsius", JOptionPane.QUESTION_MESSAGE);
                if (fahrenheitStr == null || fahrenheitStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    fahrenheit = Double.parseDouble(fahrenheitStr);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Convertir a grados Celsius :b
            double celsius = (fahrenheit - 32) * 5 / 9;

            
            String resultado = "La temperatura en grados Celsius es: " + celsius;
            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);


            continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}

