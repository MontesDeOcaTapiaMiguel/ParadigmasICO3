public class TryAnidadoException {
    public static void main(String[] args) {
        try
        {
            int c = args.length;
            int a = 10/c;
            System.out.println("Valor de a = " + a);
            try
            {
                if(c == 1)
                    a = a/(c-1);
                if(c == 2)
                {
                    int[] b = {100, 5};
                    b[3] = 0;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Segunda Excepción. Índice duera de límites => " + e);
            }

            catch(Exception e)
            {
                System.out.println("Excepción GENERICA... " + e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Primera Excepción. División por cero: " + e);
        }
    }
}
