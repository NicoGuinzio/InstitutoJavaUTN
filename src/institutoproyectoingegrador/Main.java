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
        ArrayList<Administrativo> administrativos = new ArrayList<>();
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        //Creacion de Administrativos
        Administrativo administrativo1 = new Administrativo();
        administrativos.add(administrativo1);

        for (int i = 0; i < 3; i++) {
            administrativo1.cargarMateria(materias);
        }
        administrativo1.cargarAlumno(alumnos);
        administrativo1.cargarDocente(docentes);

        alumnos.get(0).mostrarPersona();
        docentes.get(0).mostrarPersona();
        administrativos.get(0).mostrarPersona();
//        administrativo1.asignarMateriaAAlumno(alumno, materia);
//        administrativo1.asignarMateriaADocente (docente, materia);

    }

}

//
//        // 1er Año
//        materias.add(new Materia(60101, "Análisis Matemático I", 4, 1));
//        materias.add(new Materia(00102, "Álgebra, Probabilidades y Estadística", 4, 1));
//        materias.add(new Materia(60150, "Laboratorio", 6, 1));
//        materias.add(new Materia(60151, "Programación I", 6, 1));
//        materias.add(new Materia(00103, "Inglés Técnico I", 2, 1));
//        materias.add(new Materia(60152, "Economía y Organización", 4, 1));
//        materias.add(new Materia(60110, "Complementos de Física y Química", 4, 1));
//
//        // 2do Año
//        materias.add(new Materia(60253, "Modelos Discretos", 6, 2));
//        materias.add(new Materia(60201, "Análisis Matemático II", 4, 2));
//        materias.add(new Materia(60251, "Programación II", 6, 2));
//        materias.add(new Materia(60254, "Sistemas de Computación I", 6, 2));
//        materias.add(new Materia(60255, "Estructura y Base de Datos", 6, 2));
//        materias.add(new Materia(00203, "Inglés Técnico II", 2, 2));
//
//        // 3er Año
//        materias.add(new Materia(60356, "Probabilidad Aplicada", 4, 3));
//        materias.add(new Materia(60357, "Técnicas Digitales / Página Web", 2, 3));
//        materias.add(new Materia(60351, "Programación III", 6, 3));
//        materias.add(new Materia(60354, "Sistemas de Computación II", 6, 3));
//        materias.add(new Materia(60358, "Seminario", 6, 3));
//        materias.add(new Materia(00303, "Inglés Técnico III", 2, 3));
//        materias.add(new Materia(00035, "Problemática de la Realidad Contemporánea", 3, 3));
//
//        
//        //FIN creacion de materias
//       
//        //Creacion de los alumnos
//        alumnos.add(new Alumno());
//        alumnos.add(new Alumno());
//        alumnos.add(new Alumno());
//        
//        //Creacion de Docentes
//        docentes.add(new Docente());
//        docentes.add(new Docente());
//        
