public class Figura{ //Montes de Oca Tapia Miguel Angel
    private double perimetro;
    private double area; 
    public Figura(){
    }
    public Figura(double perimetro, double area){
        this.perimetro = perimetro;
        this.area = area;
    }

    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
    public double getPetimetro(){
        return perimetro;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return area;
    }

    public double calcularPerimetro(){
        return perimetro;
    }
    public double calcularArea(){
        return area;
    }

}