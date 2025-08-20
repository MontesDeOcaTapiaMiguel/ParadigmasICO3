public class Cuadrado extends Figura { //Montes de Oca Tapia Miguel Angel
    private double lado;

    public Cuadrado(){
    }
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public Cuadrado(double perimetro, double area, double lado){
        super(perimetro, area);
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }

    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
