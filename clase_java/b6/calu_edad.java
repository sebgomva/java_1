package b6;
import  java.util.Scanner;
import java.time.LocalDate;

public class calu_edad {
    public static void main(String[] args) {
        LocalDate fecha=LocalDate.now();
        int año =fecha.getYear();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa su fecha de nacimiento");

        int fechaNacimiento=scanner.nextInt();

        System.out.println(fechaNacimiento);
        System.out.println(año);

    }
}
