package Colecciones_JavaPDF8;

import java.util.Set;
import java.util.HashSet; // Importante para usar SET

public class mainColec {

    public static void main(String[] args) {
        /* int[] miArray = new int[10]; → solo puedes guardar 10 elementos.
         * Una colección como ArrayList o HashSet → tantos elementos como necesites.
         * Set es una colección donde no se permiten duplicados.
         */

        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana"); // No se agrega de nuevo porque ya existe

        System.out.println(frutas); // Imprime los elementos, sin repetir "Manzana"

    }
}
