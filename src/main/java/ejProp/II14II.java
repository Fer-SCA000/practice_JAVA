
package ejProp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class II14II {

    public static void main(String[] args) {
        //M_SCA
 
    ArrayList<String> grupoA = new ArrayList<>();
        ArrayList<String> grupoB = new ArrayList<>();

        String continuar;
        do {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante:", "Dividir Estudiantes", JOptionPane.QUESTION_MESSAGE);

            String seleccion = (String) JOptionPane.showInputDialog(null,
                    "Ingrese su género:", "Datos del estudiante",
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Femenino", "Masculino"}, "Femenino");
        
            if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "Se canceló la operación.", "Error", JOptionPane.ERROR_MESSAGE);
                break; 
            }
            if (seleccion.equals("Masculino")) {
                grupoA.add(nombre);
            } else {
                grupoB.add(nombre);
            }

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro estudiante?", "Continuar", JOptionPane.YES_NO_OPTION);
            continuar = (opcion == JOptionPane.YES_OPTION) ? "S" : "N";
        } while (continuar.equalsIgnoreCase("S"));

   
        StringBuilder resultado = new StringBuilder();
        resultado.append("Grupo A (Masculino):\n");
        for (String estudiante : grupoA) {
            resultado.append(estudiante).append("\n");
        }
        resultado.append("\nGrupo B (Femenino):\n");
        for (String estudiante : grupoB) {
            resultado.append(estudiante).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
