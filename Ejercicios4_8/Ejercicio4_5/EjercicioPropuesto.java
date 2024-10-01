package Ejercicios4_8.Ejercicio4_5;

public class EjercicioPropuesto {
    public static void main(String[] args) {
        ProfesorTitular profesor1 = new ProfesorTitular();
        ProfesorTitular profesor2 = (ProfesorTitular) profesor1;
        profesor2.imprimir();
    }
}
