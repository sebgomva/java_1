package b4;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int sum = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            numeros[i] = scanner.nextInt();
            sum += numeros[i];
        }
        double promedio = (double) sum / numeros.length;
        System.out.println("La suma total de las notas es: " + sum + ", el promedio de notas es: " + promedio);

        scanner.close();
    }
}
