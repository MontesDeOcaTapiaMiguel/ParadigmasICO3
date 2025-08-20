public class FigurasTest { //Montes de Oca Tapia Miguel Angel

    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(5.0);
        Triangulo tri = new Triangulo(6.0, 3.0, 5.0, 4.5);
        Circulo cir = new Circulo(4.0);

        System.out.println("Perimetro del cuadrado: ");
        System.out.println(cuad.calcularPerimetro());
        System.out.println("Area del cuadrado: ");
        System.out.println(cuad.calcularArea());

        System.out.println("\nPerimetro del Triangulo: ");
        System.out.println(tri.calcularPerimetro());
        System.out.println("Area del triangulo: ");
        System.out.println(tri.calcularArea());

        System.out.println("\nPerimetro del Circulo: ");
        System.out.println(cir.calcularPerimetro());
        System.out.println("Area del Circulo: ");
        System.out.println(cir.calcularArea());
    }
}