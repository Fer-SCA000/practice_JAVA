
package ejProp;
 import javax.swing.JOptionPane;
public class O3 {


    public static void main(String[] args) {
             //M_SCA
        double cateto1 = 0;
        double cateto2 = 0;

        // PRIMER CATETO
        String cateto1x = JOptionPane.showInputDialog(null, "Ingrese el valor del primer cateto:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        while (cateto1x == null || cateto1x.isBlank()) {
            JOptionPane.showMessageDialog(null, "No se asignó valor", "Error", JOptionPane.ERROR_MESSAGE);
            cateto1x = JOptionPane.showInputDialog(null, "Ingrese el valor del primer cateto:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        }
        try {
            cateto1 = Double.parseDouble(cateto1x);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de ingreso de dato. Intente de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            cateto1x = JOptionPane.showInputDialog(null, "Ingrese el valor del primer cateto:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
            cateto1 = Double.parseDouble(cateto1x); // Suponiendo que el usuario ingresa un valor válido esta vez
        }

        //SEGUNDO CATETO
        String cateto2x = JOptionPane.showInputDialog(null, "Ingrese el valor del segundo cateto:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        while (cateto2x == null || cateto2x.isBlank()) {
            JOptionPane.showMessageDialog(null, "No se asignó valor", "Error", JOptionPane.ERROR_MESSAGE);
            cateto2x = JOptionPane.showInputDialog(null, "Ingrese el valor del segundo cateto:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        }
        try {
            cateto2 = Double.parseDouble(cateto2x);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de ingreso de dato. Intente de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            cateto2x = JOptionPane.showInputDialog(null, "Ingrese el valor del segundo cateto:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
            cateto2 = Double.parseDouble(cateto2x); // Suponiendo que el usuario ingresa un valor válido esta vez
        }
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        JOptionPane.showMessageDialog(null, "La hipotenusa es: " + hipotenusa, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
