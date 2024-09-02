
package ejProp;
import javax.swing.JOptionPane;
public class O7 {

    public static void main(String[] args) {
        //M_SCA
 int continuar;

        do {
            int minutos = 0;
            String minutosStr;
            while (true) {
                minutosStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de minutos:", "Conversión de Minutos a Horas", JOptionPane.QUESTION_MESSAGE);
                if (minutosStr == null || minutosStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; // Repetir la solicitud
                }
                try {
                    minutos = Integer.parseInt(minutosStr);
                    if (minutos < 0) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue; 
                    }
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingerse un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Convertir minutos a horas y minutos :b
            int horas = minutos / 60;
            int minutosRestantes = minutos % 60;

            String resultado = minutos + " minutos son " + horas + " horas y " + minutosRestantes + " minutos.";
            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}