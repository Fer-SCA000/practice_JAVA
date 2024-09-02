package ejProp;
import javax.swing.JOptionPane;

public class II19II {

    public static void main(String[] args) {
        //M_SCA
         int continuar;

        do {
            // Solicitar la renta anual al usuario
            double rentaAnual = 0;
            while (true) {
                String rentaStr = JOptionPane.showInputDialog(null, "Ingrese su renta anual:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
                if (rentaStr == null || rentaStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "El valor de la renta no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; // Repetir si no se ingresa un valor
                }
                try {
                    rentaAnual = Double.parseDouble(rentaStr);
                    if (rentaAnual < 0) {
                        JOptionPane.showMessageDialog(null, "La renta debe ser un valor positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue; // Repetir si la renta es negativa
                    }
                    break; // Salir del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Determinar el tipo impositivo
            double tipoImpositivo;
            if (rentaAnual < 10000) {
                tipoImpositivo = 5;
            } else if (rentaAnual >= 10000 && rentaAnual < 20000) {
                tipoImpositivo = 15;
            } else if (rentaAnual >= 20000 && rentaAnual < 35000) {
                tipoImpositivo = 20;
            } else if (rentaAnual >= 35000 && rentaAnual < 60000) {
                tipoImpositivo = 30;
            } else {
                tipoImpositivo = 45;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "El tipo impositivo que le corresponde es: " + tipoImpositivo + "%", "Resultado", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si desea continuar
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea calcular el tipo impositivo para otra renta?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}