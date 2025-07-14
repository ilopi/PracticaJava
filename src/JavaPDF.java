import java.util.Scanner; // Para introducir valores por consola

public class JavaPDF {

    public static void main(String[] args) {

        // ───────────────────────────────
        // 1. WRAPPERS: valores máximos y mínimos
        // ───────────────────────────────
        // Todos los wrappers (excepto Boolean) tienen valores máximos y mínimos definidos
        Float minFloat = Float.MIN_VALUE;
        Integer maxInteger = Integer.MAX_VALUE;

        System.out.println("Máximo Integer y mínimo Float:");
        System.out.println(maxInteger + " y " + minFloat);

        // ───────────────────────────────
        // 2. ENTRADA POR TECLADO CON SCANNER
        // ───────────────────────────────
        Scanner reader = new Scanner(System.in); // Creamos un lector para la entrada por teclado

        // Leemos un número directamente con parseo incluido
        System.out.println("Escribe el numero1: ");
        int numero1 = Integer.parseInt(reader.nextLine());

        // Alternativa: leer como String y luego convertir
        System.out.println("Escribe el numero2: ");
        String numero2 = reader.nextLine();
        int numero2_entero = Integer.parseInt(numero2); // Conversion

        // ───────────────────────────────
        // 3. AUTOBOXING
        // ───────────────────────────────
        Character ch = 'a'; // Autoboxing: meter un tipo primitivo (char) en su clase wrapper (Character)

        // ───────────────────────────────
        // 4. ARRAYS SIMPLES
        // ───────────────────────────────
        int[] unArray;                   // Declarar un array
        unArray = new int[10];          // Inicializar con tamaño 10

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

        // ───────────────────────────────
        // 🖨️ 5. IMPRIMIR ARRAYS
        // ───────────────────────────────
        // Forma manual (una posición específica)
        System.out.println("Forma manual: Elemento del índice 1: " + unArray[1]);

        // Forma con bucle for
        System.out.println("Recorriendo array con for:");
        for (int i = 0; i < unArray.length; i++) {
            System.out.println("Elemento del índice " + i + ": " + unArray[i]);
        }

        // ───────────────────────────────
        // 6. ARRAYS MULTIDIMENSIONALES
        // ───────────────────────────────
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

        // ───────────────────────────────
        // 7. COPIAR ARRAYS CON System.arraycopy()
        // ───────────────────────────────

        String[] todosLosEstudiantes = {"Ana", "Luis", "Marta", "Juan", "Carlos"}; // Creamos un array con todos los estudiantes
        String[] aprobados = new String[3]; // Creamos otro array donde vamos a copiar solo a los 3 primeros (los aprobados)

        // Copiamos desde índice 0 de origen al índice 0 de destino, 3 elementos

        System.arraycopy(todosLosEstudiantes, 0, aprobados, 0, 3);

        // Imprimir los aprobados
        System.out.println("Estudiantes aprobados:");
        for (String nombre : aprobados) {
            System.out.println(nombre);
        }

    }
}