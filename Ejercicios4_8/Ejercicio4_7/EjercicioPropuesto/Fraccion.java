package Ejercicios4_8.Ejercicio4_7.EjercicioPropuesto;

public class Fraccion extends Numerica {
    protected  int numerador;
    protected  int denominador;
    public  Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    @Override
    public String toString{
        return numerador+"/"+denominador;
    }

}
