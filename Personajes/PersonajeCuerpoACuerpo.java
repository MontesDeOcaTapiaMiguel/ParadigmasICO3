public class PersonajeCuerpoACuerpo extends Personaje {

    private int bloqueo; //Cantidad de enemigos que puede bloquear a la vez
    private String arma;
    public PersonajeCuerpoACuerpo(String nombre, String afinidad, double vida, double ataque, double defensa, int bloqueo, String arma){
        super(nombre, afinidad, vida, ataque, defensa);

        if(bloqueo < 0)
            throw new IllegalArgumentException("El bloqueo no puede ser negativo");

        this.bloqueo = bloqueo;
        this.arma = arma;
    }

    public void setArma(String arma){
        this.arma = arma;
    }
    public String getArma(){
        return arma;
    }
    public void setBloqueo(int bloqueo){
        this.bloqueo = bloqueo;
    }
    public int getBloqueo(){
        return bloqueo;
    }

    @Override
    public String atacar(){
        return "Golpeaste " + super.getAtaque() + "pts. de Ataque con tu " + getArma();
    }

    @Override
    public String toString(){
        return String.format("%s %n%s %n%s: %s %n%s %d enemigos", 
        "Personaje Cuerpo a Cuerpo", super.toString(), "Arma", getArma(), "Puede bloquear a", getBloqueo());
    }
}
