public class Triangulo extends Figura { //Montes de Oca Tapia Miguel Angel
    private double ladoIzq;
    private double ladoDer;
    private double base;
    private double altura;

    public Triangulo(){
    }
    public Triangulo(double ladoIzq, double ladoDer, double base, double altura){
        this.ladoIzq = ladoIzq;
        this.ladoDer = ladoDer;
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(double perimetro, double area, double ladoIzq, double ladoDer, double base, double altura){
        super(perimetro, area);
        this.ladoIzq = ladoIzq;
        this.ladoDer = ladoDer;
        this.base = base;
        this.altura = altura;
    }

    public void setLadoIzq(double ladoIzq){
        this.ladoIzq = ladoIzq;
    } 
    public double getLadoIzq(){
        return ladoIzq;
    }
    public void setLadoDer(double ladoDer){
        this.ladoDer = ladoDer;
    } 
    public double getLadoDer(){
        return ladoDer;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    @Override
    public double calcularPerimetro(){
        return ladoIzq + ladoDer + base;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
    
}
