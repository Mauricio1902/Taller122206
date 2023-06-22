import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué figura geométrica deseas ingresar?");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        int opcionFigura = scanner.nextInt();

        if (opcionFigura == 1) {
            System.out.println("Ingrese las coordenadas del primer punto:");
            System.out.print("x: ");
            double x1 = scanner.nextDouble();
            System.out.print("y: ");
            double y1 = scanner.nextDouble();
            Punto punto1 = new Punto(x1, y1);

            System.out.println("Ingrese las coordenadas del segundo punto:");
            System.out.print("x: ");
            double x2 = scanner.nextDouble();
            System.out.print("y: ");
            double y2 = scanner.nextDouble();
            Punto punto2 = new Punto(x2, y2);

            System.out.println("Ingrese las coordenadas del tercer punto:");
            System.out.print("x: ");
            double x3 = scanner.nextDouble();
            System.out.print("y: ");
            double y3 = scanner.nextDouble();
            Punto punto3 = new Punto(x3, y3);

            Triangulo triangulo = new Triangulo(punto1, punto2, punto3);

            System.out.println("¿Qué deseas calcular?");
            System.out.println("a) Área");
            System.out.println("b) Perímetro");
            char opcionCalculo = scanner.next().charAt(0);

            if (opcionCalculo == 'a') {
                double area = triangulo.calcularArea();
                System.out.println("Área del triángulo: " + area);
            } else if (opcionCalculo == 'b') {
                double perimetro = triangulo.calcularPerimetro();
                System.out.println("Perímetro del triángulo: " + perimetro);
            }

        } else if (opcionFigura == 2) {
            System.out.println("Ingrese las coordenadas del primer punto:");
            System.out.print("x: ");
            double x1 = scanner.nextDouble();
            System.out.print("y: ");
            double y1 = scanner.nextDouble();
            Punto punto1 = new Punto(x1, y1);

            System.out.println("Ingrese las coordenadas del segundo punto:");
            System.out.print("x: ");
            double x2 = scanner.nextDouble();
            System.out.print("y: ");
            double y2 = scanner.nextDouble();
            Punto punto2 = new Punto(x2, y2);

            System.out.println("Ingrese las coordenadas del tercer punto:");
            System.out.print("x: ");
            double x3 = scanner.nextDouble();
            System.out.print("y: ");
            double y3 = scanner.nextDouble();
            Punto punto3 = new Punto(x3, y3);

            System.out.println("Ingrese las coordenadas del cuarto punto:");
            System.out.print("x: ");
            double x4 = scanner.nextDouble();
            System.out.print("y: ");
            double y4 = scanner.nextDouble();
            Punto punto4 = new Punto(x4, y4);

            Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);

            if (cuadrado.esCuadrado()) {
                System.out.println("¿Qué deseas calcular?");
                System.out.println("a) Área");
                System.out.println("b) Perímetro");
                char opcionCalculo = scanner.next().charAt(0);

                if (opcionCalculo == 'a') {
                    double area = cuadrado.calcularArea();
                    System.out.println("Área del cuadrado: " + area);
                } else if (opcionCalculo == 'b') {
                    double perimetro = cuadrado.calcularPerimetro();
                    System.out.println("Perímetro del cuadrado: " + perimetro);
                }
            } else {
                System.out.println("Los puntos ingresados no forman un cuadrado.");
            }

        } else if (opcionFigura == 3) {
            System.out.println("Ingrese las coordenadas del centro:");
            System.out.print("x: ");
            double x1 = scanner.nextDouble();
            System.out.print("y: ");
            double y1 = scanner.nextDouble();
            Punto centro = new Punto(x1, y1);

            System.out.println("Ingrese las coordenadas del punto en el borde:");
            System.out.print("x: ");
            double x2 = scanner.nextDouble();
            System.out.print("y: ");
            double y2 = scanner.nextDouble();
            Punto punto = new Punto(x2, y2);

            Circulo circulo = new Circulo(centro, punto);

            System.out.println("¿Qué deseas calcular?");
            System.out.println("a) Área");
            System.out.println("b) Perímetro");
            char opcionCalculo = scanner.next().charAt(0);

            if (opcionCalculo == 'a') {
                double area = circulo.calcularArea();
                System.out.println("Área del círculo: " + area);
            } else if (opcionCalculo == 'b') {
                double perimetro = circulo.calcularPerimetro();
                System.out.println("Perímetro del círculo: " + perimetro);
            }
        }

        scanner.close();
    }
}