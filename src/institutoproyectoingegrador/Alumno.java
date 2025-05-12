package institutoproyectoingegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class Alumno extends Persona {

    private Materia materiasCursadas;
    private boolean condicionRegular;
    private int legajo;
    private int materias_aprobadas;
    private String clave;
    private int pass;

    private static int contadorLegajos = 1;

    public Alumno() {
        super();
        ingresarDatosAlumno();
        this.legajo = contadorLegajos++;
    }

    private void ingresarDatosAlumno() {
        int condicion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese la condición del alumno:\n1 - Regular\n2 - Irregular"));
        this.condicionRegular = (condicion == 1);
        this.materias_aprobadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de materias aprobadas:"));
        ingresarDatosCampus();
    }
    
    private void ingresarDatosCampus(){
        String password = "";
        this.clave = JOptionPane.showInputDialog("Ingrese clave para el campus:");
        password = JOptionPane.showInputDialog("Ingrese password:");
        this.pass = Integer.parseInt(password);
    }

}
