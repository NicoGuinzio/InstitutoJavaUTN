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
    
    
    private void ingresarDatosAdministrativo(){
        String pts = "";
        pts = JOptionPane.showInputDialog("Ingrese el puntaje:");
        this.puntaje = Integer.parseInt(pts);
        this.horario = JOptionPane.showInputDialog("Ingrese turno de trabajo:");
        ingresarDatosCampus();
        this.activo = true;
    }
    
    
    
    private void ingresarDatosCampus(){
        String password = "";
        this.clave = JOptionPane.showInputDialog("Ingrese clave para el campus:");
        password = JOptionPane.showInputDialog("Ingrese password:");
        this.pass = Integer.parseInt(password);
    }
}
