
package ejProp;
import javax.swing.JOptionPane;

public class II17II {

    public static void main(String[] args) {
        //M_SCA
        
int continuar;

do {
    int lado1 = 0, lado2 = 0, lado3 = 0;


    while (true) {
        String lado1Str = JOptionPane.showInputDialog(null, "Ingrese el primer lado del triángulo:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (lado1Str == null || lado1Str.isBlank()) {
            JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
        try {
            lado1 = Integer.parseInt(lado1Str);
            if (lado1 <= 0) {
                JOptionPane.showMessageDialog(null, "El lado debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    while (true) {
        String lado2Str = JOptionPane.showInputDialog(null, "Ingrese el segundo lado del triángulo:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (lado2Str == null || lado2Str.isBlank()) {
            JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
        try {
            lado2 = Integer.parseInt(lado2Str);
            if (lado2 <= 0) {
                JOptionPane.showMessageDialog(null, "El lado debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    while (true) {
        String lado3Str = JOptionPane.showInputDialog(null, "Ingrese el tercer lado del triángulo:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (lado3Str == null || lado3Str.isBlank()) {
            JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
        try {
            lado3 = Integer.parseInt(lado3Str);
            if (lado3 <= 0) {
                JOptionPane.showMessageDialog(null, "El lado debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Verificación :b
    String tipoTriangulo;
    if (lado1 == lado2 && lado2 == lado3) {
        tipoTriangulo = "equilátero";
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipoTriangulo = "isósceles";
    } else {
        tipoTriangulo = "escaleno";
    }

 
    JOptionPane.showMessageDialog(null, "El triángulo es " + tipoTriangulo, "Resultado", JOptionPane.INFORMATION_MESSAGE);


    continuar = JOptionPane.showConfirmDialog(null, "¿Desea verificar otro triángulo?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}