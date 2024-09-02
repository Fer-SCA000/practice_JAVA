
package ejProp;
import javax.swing.JOptionPane;
public class O2 {

    public static void main(String[] args) {
        //M_SCA

        double longitud = 0, anchura = 0;

        String longitudStr;
        while (true) {
            longitudStr = JOptionPane.showInputDialog(null, "Ingrese la longitud del rectángulo", "Cálculo de Perímetro y Área", JOptionPane.QUESTION_MESSAGE);
            if (longitudStr == null || longitudStr.isBlank()) {
                JOptionPane.showMessageDialog(null, "La longitud no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                continue; 
            }
            try {
                longitud = Double.parseDouble(longitudStr);
                break; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para la longitud.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        String anchuraStr;
        while (true) {
            anchuraStr = JOptionPane.showInputDialog(null, "Ingrese la anchura del rectángulo:", "Cálculo de Perímetro y Área", JOptionPane.QUESTION_MESSAGE);
            if (anchuraStr == null || anchuraStr.isBlank()) {
                JOptionPane.showMessageDialog(null, "La anchura no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            try {
                anchura = Double.parseDouble(anchuraStr);
                break; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para la anchura, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // CALCULO
        double perimetro = 2 * (longitud + anchura);
        double area = longitud * anchura;

        
        String resultado = "Perímetro del rectángulo: " + perimetro + "\nÁrea del rectángulo: " + area;
        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
