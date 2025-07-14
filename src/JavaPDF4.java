// ──────────────────────────────────────
// CLASE JavaPDF4 → Contiene el metodo main()
// Se usa para probar la clase JavaPDF3
// ──────────────────────────────────────
public class JavaPDF4 {

    public static void main(String[] args) {
        // Crear un objeto de tipo JavaPDF3 (nombre y edad iniciales)
        JavaPDF3 persona = new JavaPDF3("Laura", 25);

        // Mostrar los datos actuales (usa showInfo)
        persona.showInfo(); // → Name: Laura, Age: 25

        // Cambiar el nombre y la edad usando setters
        persona.setName("Lucía");
        persona.setAge(30);

        // Mostrar la nueva información actualizada
        persona.showInfo(); // → Name: Lucía, Age: 30
    }
}
