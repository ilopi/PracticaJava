// Definimos la clase JavaPDF3
public class JavaPDF3 {

    // ───────────────────────────────
    // 1. Atributos (propiedades privadas)
    // ───────────────────────────────
    private String name; // Almacena el nombre
    private int age;     // Almacena la edad

    // ───────────────────────────────
    // 2. Constructor
    // ───────────────────────────────
    // Este constructor se ejecuta al crear un objeto de la clase
    public JavaPDF3(String name, int age) {
        this.name = name; // Asigna el valor recibido al atributo "name"
        this.age = age;   // Asigna el valor recibido al atributo "age"
    }

    // ───────────────────────────────
    // 3. Getter y Setter para "name"
    // ───────────────────────────────

    public String getName() {
        return name; // Devuelve el valor del atributo "name"
    }

    public void setName(String name) {
        this.name = name; // Establece un nuevo valor para "name"
    }

    // ───────────────────────────────
    // 4. Getter y Setter para "age"
    // ───────────────────────────────

    public int getAge() {
        return age; // Devuelve el valor del atributo "age"
    }

    public void setAge(int age) {
        this.age = age; // Establece un nuevo valor para "age"
    }

    // ───────────────────────────────
    // 5. Metodo personalizado: mostrar información
    // ───────────────────────────────

    public void showInfo() {
        // Muestra los valores de "name" y "age"
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

