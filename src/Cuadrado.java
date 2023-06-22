import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Cuadrado {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public double calcularDistancia(Punto punto1, Punto punto2) {
        double distanciaX = punto2.getX() - punto1.getX();
        double distanciaY = punto2.getY() - punto1.getY();

        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    public boolean esCuadrado() {
        double distancia1 = calcularDistancia(punto1, punto2);
        double distancia2 = calcularDistancia(punto2, punto3);
        double distancia3 = calcularDistancia(punto3, punto4);
        double distancia4 = calcularDistancia(punto4, punto1);

        return distancia1 == distancia2 && distancia2 == distancia3 && distancia3 == distancia4;
    }

    public double calcularArea() {
        double lado = calcularDistancia(punto1, punto2);
        return lado * lado;
    }

    public double calcularPerimetro() {
        double lado = calcularDistancia(punto1, punto2);
        return lado * 4;
    }
}