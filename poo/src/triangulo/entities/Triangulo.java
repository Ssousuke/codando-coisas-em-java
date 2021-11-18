package triangulo.entities;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double calculaAreaTriangulo() {
        double p = (a + b + c) / 2;
       double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
       return resultado;
    }
}
