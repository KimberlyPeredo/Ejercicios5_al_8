package Ejercicios4_8.Ejercicio4_6;

import java.util.Vector;


public class EjercicioPropuesto {
    Vector profesores;
    public static void main(String[] args) {
        Prueba3 prueba = new Prueba3();
        Prueba3.profesores = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);
        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.imprimir();
        }
    }
}
//En el pdf muestra que el codigo esta mal y no se va compilar