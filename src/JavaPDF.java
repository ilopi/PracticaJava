import java.util.Scanner;

public class JavaPDF {

    public static void main(String[] args) {

        /* Todos los wrappers (excepto Boolean) disponen
        de los valores máximos y mínimos: */

        Float minFloat = Float.MIN_VALUE;
        Integer maxInteger = Integer.MAX_VALUE;

        System.out.println(maxInteger + " y " + minFloat);

        Scanner reader = new Scanner(System.in); // Creamos un lector para la entrada por teclado

        System.out.println("Escribe el numero1: ");

        int numero1 = Integer.parseInt(reader.nextLine());

        /* También podemos hacer (más largo): */

        System.out.println("Escribe el numero2: ");

        String numero2 = reader.nextLine();

        int numero2_entero = Integer.parseInt(numero2); // Conversion


        /* Autoboxing (Envolver objeto): */

        Character ch = 'a'; //Estamos metiendo un char en un Character


        /* Arrays: */

        int[] unArray; // Definir el array del tipo de dato

        unArray = new int[10]; // Cantidad de elementos que va a almacenar

        int[] otroArray = new int[10]; // Declarar e inicializar a la vez

        unArray[0] = 100; // Agregamos en la posición 0 el valor 100
        unArray[1] = 200; // Agregamos en la posición 1 el valor 200
        unArray[2] = 300; // Agregamos en la posición 2 el valor 300
        unArray[3] = 400; // Agregamos en la posición 3 el valor 400
        unArray[4] = 500; // Agregamos en la posición 4 el valor 500
        unArray[5] = 600; // Agregamos en la posición 5 el valor 600
        unArray[6] = 700; // Agregamos en la posición 6 el valor 700
        unArray[7] = 800; // Agregamos en la posición 7 el valor 800
        unArray[8] = 900; // Agregamos en la posición 8 el valor 900
        unArray[9] = 1000; // Agregamos en la posición 9 el valor 1000

        int[] masArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        }; // Otra sintaxis para inicializar


        /* Formas de imprimir un Array: */

        System.out.println("Forma manual: Elemento del índice 1: " + unArray[1]); // Manual

        for(int i = 0; i < unArray.length; i++) {
            System.out.println("Con for: Elemento del índice " + i + ": " + unArray[i]);
        } // Con bucle for


        /* Arrays Multidimensionales: */

        String[][] names = {
                {"Mr.", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        }; // Los elementos que componen el array “names” son a su vez arrays

        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        /* Explicación de lo anterior:
        *  Es una matriz de 2 filas:
        *   names[0] → Es un array con títulos:n
        *   -> names[0][0] → "Mr."
        *   -> names[0][1] → "Mrs. "
        *   -> names[0][2] → "Ms. "
        *   names[1] → Es un array con apellidos:
        *   -> names[1][0] → "Smith"
        *   -> names[1][1] → "Jones"
        * */


        /* Copiar Arrays: */

        String[] todosLosEstudiantes = {"Ana", "Luis", "Marta", "Juan", "Carlos"}; // Creamos un array con todos los estudiantes
        String[] aprobados = new String[3]; // Creamos otro array donde vamos a copiar solo a los 3 primeros (los aprobados)

        // Usar System.arraycopy para copiar los 3 primeros estudiantes a "aprobados"

        System.arraycopy(todosLosEstudiantes, 0, aprobados, 0, 3);

        // Imprimir los aprobados
        System.out.println("Estudiantes aprobados:");
        for (String nombre : aprobados) {
            System.out.println(nombre);
        }

    }
}