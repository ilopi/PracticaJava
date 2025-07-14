package Enum_JavaPDF7;

public class EnumExample {

    public static void main(String[] args) {

        // Creamos una variable de tipo Day y le asignamos un valor del enum
        Day today = Day.MONDAY;

        // Llamamos a un metodo que imprime un mensaje según el día
        printDayMessage(today);

        // Imprimimos todos los valores posibles del enum
        System.out.println("── Todos los días del enum:");
        for (Day day : Day.values()) {
            // El metodo .name() devuelve el nombre en forma de String
            System.out.println(day.name());
        }
    }

    // Este metodo recibe un día y muestra un mensaje específico
    public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("End of the work week!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day.");
        }
    }
}
