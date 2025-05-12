
package institutoproyectoingegrador;

import java.util.ArrayList;
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
    
    
    //Cargar Materias
    public void cargarAlumno(ArrayList<Alumno> listaAlumnos) {
        Alumno nuevoAlumno = new Alumno();  // Esto ya llama a los JOptionPane internos
        listaAlumnos.add(nuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno cargado con éxito.");
    }
    public void cargarDocente(ArrayList<Docente> listaDocentes){
        Docente nuevoDocente = new Docente();  // Esto ya llama a los JOptionPane internos
        listaDocentes.add(nuevoDocente);
        JOptionPane.showMessageDialog(null, "Docente cargado con éxito.");
    }
    public void cargarMateria(ArrayList<Materia> listaMaterias){
        Materia nuevoDocente = new Materia();  // Esto ya llama a los JOptionPane internos
        listaMaterias.add(nuevoDocente);
        JOptionPane.showMessageDialog(null, "Docente cargado con éxito.");
    }
    
    public void asignarMateriaAAlumno(Alumno alumno, Materia materia) { 
    
    }
    
    public void asignarMateriaADocente(Docente docente, Materia materia) { 
    
    }
}
