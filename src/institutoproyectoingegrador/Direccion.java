package institutoproyectoingegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class Direccion {

    private String calle;
    private int numero;
    private String ciudad;
    private String codigoPostal;

    public Direccion() {
        ingresarDatosDireccion();
    }

    private void ingresarDatosDireccion() {
        this.calle = JOptionPane.showInputDialog("Ingrese la calle: ");
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: "));
        this.codigoPostal = JOptionPane.showInputDialog("Ingrese el codigo postal: ");
        this.ciudad = JOptionPane.showInputDialog("Ingrese la Ciudad: ");

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDatos del domicilo: ");
        sb.append("\nCalle: ").append(calle);
        sb.append("\nAltura: ").append(numero);
        sb.append("\nCiudad: ").append(ciudad);
        sb.append("\nCP: " ).append(codigoPostal);
        return sb.toString();
    }

    
}
