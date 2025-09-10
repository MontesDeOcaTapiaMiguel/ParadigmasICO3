// Programa de prueba de la interfaz PorPagar que procesa objetos
// Factura y Empleado mediante el polimorfismo
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {

        // crea arreglo PorPagar con cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[7];

        // Llama el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barns", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        objetosPorPagar[5] = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        objetosPorPagar[6] = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Facturas y Empleados procesados en forma polimorfica:");

        // procesa en forma genérica cada elemento en el arreglo objetosPorPagar
        for (PorPagar porPagarActual : objetosPorPagar) {
            // Imprime porPagarActual y su monto de pago apropiado
            System.out.println(porPagarActual);

            if(porPagarActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) porPagarActual;

                empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());

                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n",
                        empleado.obtenerSalarioBase());
            }

            System.out.printf("%s: $%,.2f%n\n", "Pago vencido", porPagarActual.obtenerMontoPago());
        }
    }
}
