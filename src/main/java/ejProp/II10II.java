
package ejProp;
import javax.swing.JOptionPane;
public class II10II {

    public static void main(String[] args) {
        //M_SCA
    int continuar;

        do {
            int numero = 0;

           
            String numeroStr;
            while (true) {
                numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero:", "Verificación de Par o Impar", JOptionPane.QUESTION_MESSAGE);
                if (numeroStr == null || numeroStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El número no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    numero = Integer.parseInt(numeroStr);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Verificar si es par o impar :b
            String resultado = (numero % 2 == 0) ? "El número " + numero + " es par." : "El número " + numero + " es impar.";
            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea relizar otra verificación?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}