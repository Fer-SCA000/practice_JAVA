
package ejProp;
import javax.swing.JOptionPane;
public class O8 {

    public static void main(String[] args) {
             //M_SCA
        double totalCompra = 0;

        String totalCompraStr = JOptionPane.showInputDialog(null, "Ingrese el total de la compra:", "Calculo de Descuento", JOptionPane.QUESTION_MESSAGE);
       
        while (totalCompraStr == null || totalCompraStr.isBlank()) {
            JOptionPane.showMessageDialog(null, "No se asignó valor", "Error", JOptionPane.ERROR_MESSAGE);
            totalCompraStr = JOptionPane.showInputDialog(null, "Ingrese el total de la compra:", "Calculo de Descuento", JOptionPane.QUESTION_MESSAGE);
        }
        
        try {
            totalCompra = Double.parseDouble(totalCompraStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de ingreso de dato. Intente de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            totalCompraStr = JOptionPane.showInputDialog(null, "Ingrese el total de la compra:", "Calculo de Descuento", JOptionPane.QUESTION_MESSAGE);
            totalCompra = Double.parseDouble(totalCompraStr); // Suponiendo que el usuario ingresa un valor válido esta vez
        }

        // Calcular descuento
        double descuento = totalCompra * 0.15;
        double totalAPagar = totalCompra - descuento;

        JOptionPane.showMessageDialog(null, "El total de la compra es: " + totalCompra + "\n" +
                                          "Descuento (15%): " + descuento + "\n" +
                                          "Total a pagar: " + totalAPagar, 
                                          "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
