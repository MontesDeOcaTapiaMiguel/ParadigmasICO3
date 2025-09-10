public class ExcepcionCapturada {
    public static void main(String[] args) {
        int a,b;
        try{
            a = 0;
            b = 10/a; //Aquí ocurre la excepcion
            System.out.println("Esta linea de código ya no se lee");
        }catch(ArithmeticException ex){
            System.out.println("Error, División entre cero" + ex);
        }

        System.out.println("Aquí continúa el programa despues de la gestión de excepción");
    }
}

