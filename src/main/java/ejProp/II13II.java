
package ejProp;
import javax.swing.JOptionPane;


public class II13II {

    public static void main(String[] args) {
        //M_SCA

    int continuar;
        do {
            int edad = 0;
            double ingresos = 0;

            String edadStr;
            while (true) {
                edadStr = JOptionPane.showInputDialog(null, "Ingrese su edad:", "Verificación de Edad", JOptionPane.QUESTION_MESSAGE);
                if (edadStr == null || edadStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "La edad no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    edad = Integer.parseInt(edadStr);
                    if (edad < 0) {
                        JOptionPane.showMessageDialog(null, "La edad no puede ser negativa.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue; 
                    }
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese una edad válida, por fvor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

  
            String ingresosStr;
            while (true) {
                ingresosStr = JOptionPane.showInputDialog(null, "Ingrese sus ingresos mensuales (en soles):", "Verificación de Ingresos", JOptionPane.QUESTION_MESSAGE);
                if (ingresosStr == null || ingresosStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Los ingresos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    ingresos = Double.parseDouble(ingresosStr);
                    if (ingresos < 0) {
                        JOptionPane.showMessageDialog(null, "Los ingresos no pueden ser negativos.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese ingresos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Determinar si debe tributar :b
            String resultado;
            if (edad > 18 && ingresos >= 1300) {
                resultado = "Usted debe tributar.";
            } else {
                resultado = "Usted no debe tributar.";
            }
            
            JOptionPane.showMessageDialog(null, resultado, "Resultado de Tributación", JOptionPane.INFORMATION_MESSAGE);

            
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra verificación?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}