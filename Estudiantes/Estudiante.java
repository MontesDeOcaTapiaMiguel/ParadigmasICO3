
import java.util.Date;

public class Estudiante extends Persona {
    private String idAlumno;
    private double promCalif;
    private String carrera;
    private String tituloObtenido;
    private int aGraduacion;

    public Estudiante(String nombre, String apellidoPaterno,   
   String apellidoMaterno, Date fechaNacimiento, String idAlumno, 
   double promCalif, String carrera, String tituloObtenido, int aGraduacion)
   {
    super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);

    this.idAlumno = idAlumno;
    this.promCalif = promCalif;
    this.carrera = carrera;
    this.tituloObtenido = tituloObtenido;
    this. aGraduacion = aGraduacion;
   }

   public void setCarrera(String carrera){
    this.carrera = carrera;
   }
   public void setTituloObtenido(String tituloObtenido){
    this.tituloObtenido = tituloObtenido;
   }
   public void setAGraduacion(int añoGraduacion){
    this.aGraduacion = añoGraduacion;
   }
   public void setPromCalif(double promCalif){
    this.promCalif = promCalif;
   }

   public String getIdAlumno(){
    return idAlumno;
   }
   public double getPromCalif(){
    return promCalif;
   }
   public String getCarrera(){
    return carrera;
   }
   public String getTituloObtenido(){
    return tituloObtenido;
   }
   public int getAGraduacion(){
    return aGraduacion;
   }

   public double calcularPromedio(int numCal, String[] calificaciones){
    double suma = 0;
    for(int i = 0; i < numCal; i++){

        if(calificaciones[i].equalsIgnoreCase("A")){
            suma = suma + 4.0;
        }
        if(calificaciones[i].equalsIgnoreCase("A-")){
            suma = suma + 3.67;
        }
        if(calificaciones[i].equalsIgnoreCase("B+")){
            suma = suma + 3.33;
        }
        if(calificaciones[i].equalsIgnoreCase("B")){
            suma = suma + 3.0;
        }
        if(calificaciones[i].equalsIgnoreCase("B-")){
            suma = suma + 2.67;
        }
        if(calificaciones[i].equalsIgnoreCase("C+")){
            suma = suma + 2.33;
        }
        if(calificaciones[i].equalsIgnoreCase("C")){
            suma = suma + 2.0;
        }
        if(calificaciones[i].equalsIgnoreCase("D")){
            suma = suma + 1.0;
        }
        if(calificaciones[i].equalsIgnoreCase("F")){
            suma = suma + 0.0;
        }

    }

    promCalif = suma / numCal;
    return promCalif;
   }

   @Override
   public String toString()
   {
    return String.format("%s: %s %n%s: %tD %n%s: %s %n%s: %.2f %n%s: %s %n%s: %s %n%s: %d",
    "Nombre del Alumno", obtenerNombreCompleto(), "Fecha de Nacimiento", obtenerFechaNacimiento(), 
    "Id del Alumno", getIdAlumno(), "Promedio", getPromCalif(), "Carrera", getCarrera(), "Grado obtenido", getTituloObtenido(), 
    "Año de graduación esperado", getAGraduacion());
   }
}
