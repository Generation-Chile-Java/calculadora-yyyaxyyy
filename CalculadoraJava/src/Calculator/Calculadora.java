package Calculator;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        System.out.println("Ingresa el primer numero: ");
        numero1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double modulo = numero1 % numero2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multipliccion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
        System.out.println("El resultado de la modulo es: " + modulo);

        scanner.close();

    }
}
