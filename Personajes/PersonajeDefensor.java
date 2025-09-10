public class PersonajeDefensor extends PersonajeCuerpoACuerpo {

    private double reduccionDeDaño; // Porcentaje de reducción del daño recibido

    public PersonajeDefensor(String nombre, String afinidad, double vida, double ataque, double defensa, int bloqueo, String arma, double reduccionDeDaño){
        super(nombre, afinidad, vida, ataque, defensa, bloqueo, arma);
        if((reduccionDeDaño < 0) || (reduccionDeDaño > 1.0))
            throw new IllegalArgumentException("La reducción de daño debe estar entre 0.0 y 1.0");

        this.reduccionDeDaño = reduccionDeDaño;
    }

    public void setReduccion(double reduccionDeDaño){
        this.reduccionDeDaño = reduccionDeDaño;
    }
    public double getReduccion(){
        return reduccionDeDaño;
    }

    @Override
    public String recibirAtaque(double ataqueRecibido){
        if((ataqueRecibido * (1.0 - reduccionDeDaño)) > defensa)
            return "Recibiste" + (ataqueRecibido * (1.0 - reduccionDeDaño) - defensa) + " de daño";
        else
            return "No recibiste daño";
    }

    @Override
    public String toString(){
        return String.format("%s %n%s %n%s: %,.2f", 
        "Personaje Defensor", super.toString(), "Reducción de Daño", getReduccion());
    }

}
