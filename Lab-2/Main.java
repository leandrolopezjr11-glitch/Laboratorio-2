public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Juan Pérez", "12345", 1.5, 1000);
        Cuenta cuenta2 = new Cuenta("María López", "67890", 1.2, 500);

        // Mostrar estado inicial
        System.out.println("Estado inicial:");
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();

        // Ingreso
        cuenta1.ingreso(200);

        // Extracción
        cuenta2.extraccion(100);

        // Transferencia
        cuenta1.transferencia(cuenta2, 300);

        // Mostrar estado final
        System.out.println("Estado final:");
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();
    }
}