public class Circulo extends Figura { //Montes de Oca Tapia Miguel Angel
    private double radio;
    private final double pi = 3.14159;

    public Circulo(){
    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public Circulo(double perimetro, double area, double radio){
        super(perimetro, area);
        this.radio = radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * pi * radio;
    }

    @Override
    public double calcularArea(){
        return pi * radio * radio;
    }
}
