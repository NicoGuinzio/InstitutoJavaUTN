package institutoproyectoingegrador;

/**
 *
 * @author nicolas
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class Persona {

    private String nombre;
    private int dni;
    private Direccion direccion;
    private LocalDate fechaDeNacimiento;
    private int edad;

    public Persona(String nombre, LocalDate fechaNacimiento, int dni, boolean condicionRegular, int materias_aprobadas) {
        this.nombre = nombre;
        LocalDate hoy = LocalDate.now();
        this.edad = Period.between(fechaNacimiento, hoy).getYears();
        this.dni = dni;
        this.direccion = new Direccion();
        this.fechaDeNacimiento = fechaNacimiento;
    }

    public Persona() {
        ingresarDatos();
    }

    private void ingresarDatos() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        this.fechaDeNacimiento = ingresarEdad();
        this.dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI: "));

        this.direccion = new Direccion();

    }

    public void mostrarPersona() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n"
                + "Fecha de nacimiento: " + fechaDeNacimiento + "\n"
                + "Edad: " + (edad == 0 ? "Edad invalida" : edad) + "\n"
                + "DNI: " + dni + "\n"
                + "Mayor de edad: " + (edad > 18 ? "SI" : (edad == 0 ? "Edad invalida" : "NO")) + "\n"
                + direccion.toString() + "\n");
//        System.out.println("Nombre: " + nombre + "\n"
//                + "Fecha de nacimiento: " + fechaDeNacimiento + "\n"
//                + "Edad: " + (edad == 0 ? "Edad invalida" : edad) + "\n"
//                + "DNI: " + dni + "\n"
//                + "Mayor de edad: " + (edad > 18 ? "SI" : (edad == 0 ? "Edad invalida" : "NO")) + "\n"
//                + direccion.toString() + "\n");

    }

    public String getNombre() {
        return nombre;
    }

    
    
    //INICIO> METODOS PARA LA EDAD DE LA PERSONA.
    public void fechaDeNacimiento() {
        JOptionPane.showMessageDialog(null, edad);
    }

    private LocalDate ingresarEdad() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = null;

        while (fecha == null) {
            String input = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (dd/MM/yyyy):");

            try {
                fecha = LocalDate.parse(input, formato);

                edad = calcularEdad(fecha);
                this.fechaDeNacimiento = fecha;
                String mensaje = "Fecha ingresada: " + fecha
                        + "\nEdad: " + edad + " años\n"
                        + (edad >= 18 ? "Es mayor de edad." : "Es menor de edad.");
                JOptionPane.showMessageDialog(null, mensaje);

            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Formato inválido. Debe ser dd/MM/yyyy (ej: 15/04/2000).");
            }
        }

        return fecha;
    }

    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    //FIN> METODOS PARA LA EDAD DE LA PERSONA.
}
