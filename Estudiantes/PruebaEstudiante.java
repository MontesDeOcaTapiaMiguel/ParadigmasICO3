
import java.util.Date;
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        //Le solicitamos sus datos al usuario
        System.out.println("Registro de Alumnos\n");
        System.out.println("Ingrese su Apellido Paterno: ");
        String apellidoPaterno = entrada.nextLine();
        System.out.println("\nIngrese su Apellido Materno: ");
        String apellidoMaterno = entrada.nextLine();
        System.out.println("\nIngrese su Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("\nIngrese su Año de Nacimiento: ");
        int añoN = entrada.nextInt();
        entrada.nextLine();
        System.out.println("\nIngrese su Mes de Nacimiento (número): ");
        int mesN = entrada.nextInt();
        entrada.nextLine();
        System.out.println("\nIngrese su Dia de Nacimiento: ");
        int diaN = entrada.nextInt();
        entrada.nextLine();
        System.out.println("\nIngrese su Id de Alumno: ");
        String idAlumno = entrada.nextLine();
        System.out.println("\nIngrese su Calificación promedio: ");
        double promCalif = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("\nIngrese la carrera que esta estudiando: ");
        String carrera = entrada.nextLine();
        System.out.println("\nIngrese el titulo que ha obtenido: ");
        String tituloObtenido = entrada.nextLine();
        System.out.println("\nIngrese su año de graduación esperado: ");
        int aGraduacion = entrada.nextInt();
        entrada.nextLine();

        Date fechaNacimieno = new Date((añoN-1900), (mesN-1), diaN);

        //Creamos un objeto enviando esos datos como argumentos
        Estudiante est1 = new Estudiante(nombre, apellidoPaterno, apellidoMaterno, fechaNacimieno, idAlumno, promCalif, carrera, tituloObtenido, aGraduacion);

        System.out.println("\nSu usuario fue creado");
        System.out.println("Datos del Alumno: ");
        System.out.println(est1.toString());

        System.out.println("\n\nIntroduzca el número de calificaciones en su periodo actual: ");
        int numCal = entrada.nextInt();
        entrada.nextLine();
        String[] calificaciones = new String[numCal];
        System.out.println("A continuación introduzca cada una de sus calficaciónes en formato literal (A, A-, B+, B, B-, C+, C, D, F)\n");
        for(int i = 0; i < numCal; i++){
            System.out.println("Introduzca su calificación " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextLine();
        }
        est1.calcularPromedio(numCal, calificaciones);
        System.out.println("Su calificación promedio es: " + est1.getPromCalif());
        System.out.println("(La escala se evaluo de 0 - 4)");
        System.out.println("\n¿Desea cambiar de carrera al estudiante? Escriba SI o NO: ");
        String respuesta = entrada.nextLine();

        if(respuesta.equalsIgnoreCase("SI")){
            System.out.println("Escriba la carrera a la que desea cambiar: ");
            est1.setCarrera(entrada.nextLine());
            System.out.println("Su cambio ha sido exitoso, la nueva carrera es: " + est1.getCarrera());
            System.out.println("Fin del Programa");
        }else{
        System.out.println("Fin del programa");
        }
    }
}
