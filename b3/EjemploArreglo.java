package b3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploArreglo {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros2 = new int[5];
        numeros2[0]=1;
        numeros2[1]=2;
        numeros2[2]=2;
        numeros2[3]=3;
        numeros2[4]=6;

        Arrays.stream(numeros2).forEach(num-> System.out.println(num));

        System.out.println("###################");
        int[] numeros = {1, 2, 3, 4, 5};

        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println("###############");
        List<String> listNombre = new ArrayList<>();
        listNombre.add("Sebastian");
        listNombre.add("Janeth");

        System.out.println("############");
        listNombre.stream().forEach(System.out::println);

        System.out.println("############");
        listNombre.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
