package b2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int sum,resta,multi,division;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = scanner.nextInt();
         System.out.println("Ingrese segundo numero");
        int num2 = scanner.nextInt();
        sum = num1 + num2;
        resta = num1-num2;
        multi = num1 * num2;
        division = num1 / num2;
        System.out.println("El resultado de la operacion es: Suma:" + sum + " Resta:" + resta + " Multiplicacion:" + multi + " Division:" + division);
        scanner.close();
    }
}
