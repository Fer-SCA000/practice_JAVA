package ejProp;
import javax.swing.JOptionPane;

public class II12II {

    public static void main(String[] args) {
        //M_SCA
 
        int continuar;

        do {
            
            String[] opcionesBebidas = {"Café", "Té", "Jugo", "Agua"};
            String bebidaSeleccionada = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la bebida:", "Menú de Bebidas",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesBebidas, opcionesBebidas[0]);

            // Preguntar si desea helada, caliente o sin azúcar :b
            String[] opcionesTemperatura = {"Helada", "Caliente", "Sin azúcar", "Con azúcar"};
            String temperaturaSeleccionada = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la opción:", "Temperatura de la Bebida",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);

           
            int cantidad = 0;
            String cantidadStr;
            while (true) {
                cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de bebidas:", "Cantidad", JOptionPane.QUESTION_MESSAGE);
                if (cantidadStr == null || cantidadStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "La cantidad no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; 
                }
                try {
                    cantidad = Integer.parseInt(cantidadStr);
                    if (cantidad <= 0) {
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue; 
                    }
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

 
            double precioUnitario = 0;
            switch (bebidaSeleccionada) {
                case "Café":
                    precioUnitario = 2.5;
                    break;
                case "Té":
                    precioUnitario = 2.0;
                    break;
                case "Jugo":
                    precioUnitario = 3.0;
                    break;
                case "Agua":
                    precioUnitario = 1.0;
                    break;
            }

            // Calcular precio total :b
            double precioTotal = cantidad * precioUnitario;

  
            String[] opcionesPago = {"Efectivo", "Tarjeta", "Yape"};
            String metodoPago = (String) JOptionPane.showInputDialog(null,
                    "Seleccione el método de pago:", "Método de Pago",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesPago, opcionesPago[0]);

            String mensaje = "Usted ha pedido " + cantidad + " " + bebidaSeleccionada + "(s) " +
                    temperaturaSeleccionada + ".\nTotal a pagar: $" + precioTotal + "\nMétodo de pago: " + metodoPago;
            JOptionPane.showMessageDialog(null, mensaje, "Resumen del Pedido", JOptionPane.INFORMATION_MESSAGE);

         
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro pedido?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}