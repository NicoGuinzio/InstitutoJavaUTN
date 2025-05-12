package institutoproyectoingegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class Docente extends Persona {

    private Boolean activo; // Si está trabajando actualmente
    private String horario;
    private String clave;
    private int pass;
    private int puntaje;

    private Materia materiasDictadas;

    public Docente() {
        super();
        ingresarDatosAdministrativo();
    }

    private void ingresarDatosAdministrativo() {
        String pts = "";
        pts = JOptionPane.showInputDialog("Ingrese el puntaje:");
        this.puntaje = Integer.parseInt(pts);
        this.horario = JOptionPane.showInputDialog("Ingrese turno de trabajo:");
        ingresarDatosCampus();
        this.activo = true;
    }

    private void ingresarDatosCampus() {
        String password = "";
        this.clave = JOptionPane.showInputDialog("Ingrese clave para el campus:");
        password = JOptionPane.showInputDialog("Ingrese password:");
        this.pass = Integer.parseInt(password);
    }

    public void mostrarDocente() {
        // Mostrar datos heredados de Persona
        super.mostrarPersona();

        // Mostrar datos específicos del Docente
        String mensajeDocente = "Puntaje: " + puntaje + "\n"
                + "Turno de trabajo: " + horario + "\n"
                + "Estado: " + (activo ? "Activo" : "Inactivo") + "\n"
                + "Clave: " + clave + "\n"
                + "Password: " + pass;

        // Si tiene materia asignada, mostrarla
        if (materiasDictadas != null) {
            mensajeDocente += "\nMateria dictada: " + materiasDictadas.toString();
        } else {
            mensajeDocente += "\nNo dicta ninguna materia. ";
        }

        JOptionPane.showMessageDialog(null, mensajeDocente);
    }

    
    
}
