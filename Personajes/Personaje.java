public abstract class Personaje {

    private final String nombre;
    private String afinidad;
    public double vida;
    public double ataque;
    public double defensa;

    public Personaje(String nombre, String afinidad, double vida, double ataque, double defensa){
        if((vida < 0.0) || (ataque < 0.0) || (defensa < 0.0))
            throw new IllegalArgumentException("Las estadísticas no pueden ser negativas");
        this.nombre = nombre;
        this.afinidad = afinidad;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void setAfinidad(String afinidad){
        this.afinidad = afinidad;
    }
    public void setVida(double vida){
        if(vida < 0.0)
            throw new IllegalArgumentException("La vida no puede ser negativa");
        this.vida = vida;
    }
    public void setAtaque(double ataque){
        if(ataque < 0.0)
            throw new IllegalArgumentException("El ataque no puede ser negativo");
        this.ataque = ataque;
    }
    public void setDefensa(double defensa){
        if(defensa < 0.0)
            throw new IllegalArgumentException("La defensa no puede ser negativa");
        this.defensa = defensa;
    }

    public String getNombre(){
        return nombre;
    }
    public String getAfinidad(){
        return afinidad;
    }
    public double getVida(){
        return vida;
    }
    public double getAtaque(){
        return ataque;
    }
    public double getDefensa(){
        return defensa;
    }

    public void nerfPersonaje(){ //Reduce las estadísticas del personaje en 10%
        setVida(vida * 0.9);
        setAtaque(ataque * 0.9);
        setDefensa(defensa * 0.9);
    }

    public String recibirAtaque(double ataqueRecibido){
        if(ataqueRecibido > defensa)
            return "Recibiste " + (ataqueRecibido - defensa) + " de daño";
        else
            return "No recibiste daño";
    }

    //Método abstracto
    public abstract String atacar();

    @Override
    public String toString(){
        return String.format("%s %n%s: %,.2f pts. %n%s: %,.2f pts. %n%s: %,.2f pts. %n%s: %s", 
        getNombre(), "Vida", getVida(), "Ataque", getAtaque(), "Defensa", getDefensa(), "Afinidad", getAfinidad());
    }

}
