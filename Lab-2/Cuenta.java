public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double interes;
    private double saldo;

    // Constructor por defecto
    public Cuenta() {
        this.nombreCliente = "";
        this.numeroCuenta = "";
        this.interes = 0.0;
        this.saldo = 0.0;
    }

    // Constructor con parámetros
    public Cuenta(String nombreCliente, String numeroCuenta, double interes, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método ingreso
    public boolean ingreso(double cantidad) {
        if (cantidad < 0) {
            return false;
        }
        saldo += cantidad;
        return true;
    }

    // Método extracción
    public boolean extraccion(double cantidad) {
        if (cantidad < 0 || cantidad > saldo) {
            return false;
        }
        saldo -= cantidad;
        return true;
    }

    // Método transferencia
    public boolean transferencia(Cuenta destino, double importe) {
        if (importe < 0 || this.saldo < importe) {
            return false;
        }
        this.saldo -= importe;
        destino.saldo += importe;
        return true;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Interés: " + interes);
        System.out.println("Saldo: " + saldo);
        System.out.println("-------------------------");
    }
}