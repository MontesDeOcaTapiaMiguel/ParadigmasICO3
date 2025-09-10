public class PersonajeADistancia extends Personaje {

    private double rangoAtaque; 
    private int municion;  

    public PersonajeADistancia(String nombre, String afinidad, double vida, double ataque, double defensa, double rangoAtaque, int municion){
        super(nombre, afinidad, vida, rangoAtaque, defensa);
        if((rangoAtaque < 0.0) || (municion < 0))
            throw new IllegalArgumentException("No puedes tener rango y/o municion < 0");

        this.rangoAtaque = rangoAtaque;
        this.municion = municion;
    }

    public void setRangoAtaque(double rangoAtaque){
        if(rangoAtaque < 0.0)
            throw new IllegalArgumentException("No puedes tener rango < 0");
        this.rangoAtaque = rangoAtaque;
    }
    public double getRangoAtaque(){
        return rangoAtaque;
    }
    public void setMunicion(int municion){
        if(municion < 0)
            throw new IllegalArgumentException("No puedes tener municion < 0");
        this.municion = municion;
    }
    public int getMunicion(){
        return municion;
    }

    @Override
    public String atacar(){
        if(municion > 0){
            setMunicion(municion - 1);
            return "Disparaste un proyectil de " + super.getAtaque() + " pts. de Ataque. Munición restante: " + getMunicion();
        }
        else
            return "Munición agotada";
    }

    @Override
    public String toString(){
        return String.format("%s %n%s %n%s: %,.2f unidades %n%s: %d", 
        "Personaje a Distancia", super.toString(), "Rango de Ataque", getRangoAtaque(), "Municion", getMunicion());
    }
}
