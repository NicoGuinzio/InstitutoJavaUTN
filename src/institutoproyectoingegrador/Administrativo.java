
package institutoproyectoingegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class Administrativo extends Persona {
    private String rol;
    private Boolean activo; // Si está trabajando actualmente
    private String horario;
    private String clave;
    private int pass;

    public Administrativo() {
        super();
        ingresarDatosAdministrativo();
    }
    
    
    private void ingresarDatosAdministrativo(){
        this.rol = JOptionPane.showInputDialog("Ingrese el rol del administrativo:");
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
