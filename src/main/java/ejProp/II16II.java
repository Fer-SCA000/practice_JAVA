
package ejProp;
import javax.swing.JOptionPane;

public class II16II {

    public static void main(String[] args) {
        //M_SCA
int continuar;

do {
    // Entrada de los tres números
    int num1 = 0, num2 = 0, num3 = 0;

    // Ingreso y validación del primer número
    while (true) {
        String num1Str = JOptionPane.showInputDialog(null, "Ingrese el primer número:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (num1Str == null || num1Str.isBlank()) {
            JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
        try {
            num1 = Integer.parseInt(num1Str);
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Ingreso y validación del segundo número
    while (true) {
        String num2Str = JOptionPane.showInputDialog(null, "Ingrese el segundo número:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (num2Str == null || num2Str.isBlank()) {
            JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
        try {
            num2 = Integer.parseInt(num2Str);
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Ingreso y validación del tercer número
    while (true) {
        String num3Str = JOptionPane.showInputDialog(null, "Ingrese el tercer número:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (num3Str == null || num3Str.isBlank()) {
            JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
        try {
            num3 = Integer.parseInt(num3Str);
            break;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Verificación :b
    boolean esPrimo1 = num1 > 1;
    for (int i = 2; i <= Math.sqrt(num1); i++) {
        if (num1 % i == 0) {
            esPrimo1 = false;
            break;
        }
    }
    String mensaje1 = "El primer número " + num1 + " es " + (esPrimo1 ? "primo" : "no primo") + " y " + (num1 % 2 == 0 ? "par." : "impar.");
    JOptionPane.showMessageDialog(null, mensaje1, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    // Verificación y muestra de resultados para el segundo número
    boolean esPrimo2 = num2 > 1;
    for (int i = 2; i <= Math.sqrt(num2); i++) {
        if (num2 % i == 0) {
            esPrimo2 = false;
            break;
        }
    }
    String mensaje2 = "El segundo número " + num2 + " es " + (esPrimo2 ? "primo" : "no primo") + " y " + (num2 % 2 == 0 ? "par." : "impar.");
    JOptionPane.showMessageDialog(null, mensaje2, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    // Verificación y muestra de resultados para el tercer número
    boolean esPrimo3 = num3 > 1;
    for (int i = 2; i <= Math.sqrt(num3); i++) {
        if (num3 % i == 0) {
            esPrimo3 = false;
            break;
        }
    }
    String mensaje3 = "El tercer número " + num3 + " es " + (esPrimo3 ? "primo" : "no primo") + " y " + (num3 % 2 == 0 ? "par." : "impar.");
    JOptionPane.showMessageDialog(null, mensaje3, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    // Preguntar si desea continuar
    continuar = JOptionPane.showConfirmDialog(null, "¿Desea verificar otros números?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
    }
}
