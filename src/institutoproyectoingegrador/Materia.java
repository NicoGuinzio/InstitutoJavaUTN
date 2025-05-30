package institutoproyectoingegrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class Materia {

    private int codigo;
    private String nombre;
    private int cargaHoraria;
    private int comision;
    private Docente docente;
    private ArrayList<Alumno> alumnos;
    private int anioDeCarrera; // 1, 2 o 3

    public Materia(int codigo, String nombre, int cargaHoraria, int anioDeCarrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.anioDeCarrera = anioDeCarrera;
    }

    public Materia() {
        ingresarDatosMateria();
    }

    public int getAnio() {
        return anioDeCarrera;
    }

    public void ingresarDatosMateria() {
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia:"));
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la materia:");
        this.cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la carga horaria (en horas):"));
        this.comision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de comisión:"));

        int anio = 0;
        while (anio < 1 || anio > 3) {
            anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de carrera (1, 2 o 3):"));
            if (anio < 1 || anio > 3) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Solo se permite 1, 2 o 3.");
            }
        }
        this.anioDeCarrera = anio;

        this.alumnos = new ArrayList<>();
        this.docente = null; // Se asignará después desde Administrativo
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + cargaHoraria + " hs)";
    }

    public void mostrarMateria() {
        String mensaje = "Código: " + codigo + "\n"
                + "Nombre: " + nombre + "\n"
                + "Carga horaria: " + cargaHoraria + " hs\n"
                + "Comisión: " + comision + "\n"
                + "Año de carrera: " + anioDeCarrera + "\n";

        // Docente asignado
        if (docente != null) {
            mensaje += "Docente asignado: " + docente.getNombre() + "\n";
        } else {
            mensaje += "Docente asignado: No asignado\n";
        }

        // Cantidad de alumnos
        mensaje += "Cantidad de alumnos inscriptos: " + (alumnos != null ? alumnos.size() : 0) + "\n";

        // Lista de alumnos (opcional)
        if (alumnos != null && !alumnos.isEmpty()) {
            mensaje += "Alumnos:\n";
            for (Alumno alumno : alumnos) {
                mensaje += "- " + alumno.getNombre() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

}
