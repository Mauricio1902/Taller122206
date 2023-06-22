import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Triangulo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public double calcularDistancia(Punto punto1, Punto punto2) {
        double distanciaX = punto2.getX() - punto1.getX();
        double distanciaY = punto2.getY() - punto1.getY();

        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    public double calcularArea() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);

        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    public double calcularPerimetro() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);

        return lado1 + lado2 + lado3;
    }
}