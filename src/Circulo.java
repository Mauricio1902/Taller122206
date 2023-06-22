import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Circulo {
    private Punto centro;
    private Punto punto;

    public Circulo(Punto centro, Punto punto) {
        this.centro = centro;
        this.punto = punto;
    }

    public double calcularDistancia(Punto punto1, Punto punto2) {
        double distanciaX = punto2.getX() - punto1.getX();
        double distanciaY = punto2.getY() - punto1.getY();

        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    public double calcularArea() {
        double radio = calcularDistancia(centro, punto);
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        double radio = calcularDistancia(centro, punto);
        return 2 * Math.PI * radio;
    }
}

