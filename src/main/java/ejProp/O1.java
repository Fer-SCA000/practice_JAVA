
package ejProp;
import javax.swing.JOptionPane;
public class O1 {

    public static void main(String[] args) {
        //M_SCA

        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre, por favor c:", "Saludo", JOptionPane.QUESTION_MESSAGE);

        if (nombre != null && !nombre.isBlank()) {
            JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "! Bienvenido!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresó un nombre, inténtel de neuvo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
