package ejProp;
import javax.swing.JOptionPane;

public class II11II {

    public static void main(String[] args) {
        //M_SCA

        double a = 0, b = 0, c = 0;

        String aStr;
        while (true) {
            aStr = JOptionPane.showInputDialog(null, "Ingrese el coeficiente a:", "Ecuación Cuadrática", JOptionPane.QUESTION_MESSAGE);
            if (aStr == null || aStr.isBlank()) {
                JOptionPane.showMessageDialog(null, "El coeficiente a no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                continue; 
            }
            try {
                a = Double.parseDouble(aStr);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el coeficiente a.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        
        String bStr;
        while (true) {
            bStr = JOptionPane.showInputDialog(null, "Ingrese el coeficiente b:", "Ecuación Cuadrática", JOptionPane.QUESTION_MESSAGE);
            if (bStr == null || bStr.isBlank()) {
                JOptionPane.showMessageDialog(null, "El coeficiente b no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                continue; 
            }
            try {
                b = Double.parseDouble(bStr);
                break; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el coeficiente b.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        String cStr;
        while (true) {
            cStr = JOptionPane.showInputDialog(null, "Ingrese el coeficiente c:", "Ecuación Cuadrática", JOptionPane.QUESTION_MESSAGE);
            if (cStr == null || cStr.isBlank()) {
                JOptionPane.showMessageDialog(null, "El coeficiente c no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                continue; 
            }
            try {
                c = Double.parseDouble(cStr);
                break; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el coeficiente c.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        // DISCRIMINANTE
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Las raíces son:\nRaíz 1: " + raiz1 + "\nRaíz 2: " + raiz2, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "La raíz es:\nRaíz: " + raiz, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La ecuación no tiene raíces reales.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
