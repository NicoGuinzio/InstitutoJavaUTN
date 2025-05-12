/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutoproyectoingegrador;

import java.util.ArrayList;

/**
 *
 * @author nicolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de Materias
        ArrayList<Materia> materias = new ArrayList<>();

        // 1er Año
        materias.add(new Materia(60101, "Análisis Matemático I", 4, 1));
        materias.add(new Materia(00102, "Álgebra, Probabilidades y Estadística", 4, 1));
        materias.add(new Materia(60150, "Laboratorio", 6, 1));
        materias.add(new Materia(60151, "Programación I", 6, 1));
        materias.add(new Materia(00103, "Inglés Técnico I", 2, 1));
        materias.add(new Materia(60152, "Economía y Organización", 4, 1));
        materias.add(new Materia(60110, "Complementos de Física y Química", 4, 1));

        // 2do Año
        materias.add(new Materia(60253, "Modelos Discretos", 6, 2));
        materias.add(new Materia(60201, "Análisis Matemático II", 4, 2));
        materias.add(new Materia(60251, "Programación II", 6, 2));
        materias.add(new Materia(60254, "Sistemas de Computación I", 6, 2));
        materias.add(new Materia(60255, "Estructura y Base de Datos", 6, 2));
        materias.add(new Materia(00203, "Inglés Técnico II", 2, 2));

        // 3er Año
        materias.add(new Materia(60356, "Probabilidad Aplicada", 4, 3));
        materias.add(new Materia(60357, "Técnicas Digitales / Página Web", 2, 3));
        materias.add(new Materia(60351, "Programación III", 6, 3));
        materias.add(new Materia(60354, "Sistemas de Computación II", 6, 3));
        materias.add(new Materia(60358, "Seminario", 6, 3));
        materias.add(new Materia(00303, "Inglés Técnico III", 2, 3));
        materias.add(new Materia(00035, "Problemática de la Realidad Contemporánea", 3, 3));

        
        //FIN creacion de materias
        
        Persona persona1 = new Persona();
        persona1.mostrarPersona();

        persona1.fechaDeNacimiento();
    }

}
