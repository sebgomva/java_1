package b4;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        //declaro arreglo
        int[]  ordename={27,18,2,14,25};
        int[] orden_a = ascendente(ordename);
        int[] orden_b = descendente(ordename);
        Arrays.stream(orden_a).forEach(System.out::println);
        System.out.println("#######################");
        Arrays.stream(orden_b).forEach(System.out::println);

    }
    private static int[] ascendente(int[] arreglo){
        int[] ordenado = arreglo.clone();
        int temporal = 0;

        for (int i = 0; i < ordenado.length; i++) {
            for (int j = 1; j < (ordenado.length - i); j++) {
                if (ordenado[j - 1] > ordenado[j]) {
                    temporal = ordenado[j - 1];
                    ordenado[j - 1] = ordenado[j];
                    ordenado[j] = temporal;
                }
            }
        }
        return ordenado;

    }

    private static int[] descendente(int[] arreglo){
        int[] ordenado = arreglo.clone();
        int temporal = 0;

        for (int i = 0; i < ordenado.length; i++) {
            for (int j = 1; j < (ordenado.length - i); j++) {
                if (ordenado[j - 1] < ordenado[j]) {
                    temporal = ordenado[j - 1];
                    ordenado[j - 1] = ordenado[j];
                    ordenado[j] = temporal;
                }
            }
        }
        return ordenado;

    }

}
