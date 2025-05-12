/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutoproyectoingegrador;

import java.util.ArrayList;

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

    public int getAnio() {
        return anioDeCarrera;
    }

    
    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + cargaHoraria + " hs)";
    }
    
    
}

