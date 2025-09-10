public class PersonajeDeApoyo extends Personaje {

    private double curacion; // Porcentaje de Curacion en base a su vida

    public PersonajeDeApoyo(String nombre, String afinidad, double vida, double ataque, double defensa, double curacion){
        super(nombre, afinidad, vida, ataque, defensa);
        if((curacion < 0) || (curacion > 1.0))
            throw new IllegalArgumentException("La curación debe estar entre 0.0 y 1.0");

        this.curacion = curacion;
    }

    public void setCuracion(double curacion){
        this.curacion = curacion;
    }
    public double getCuracion(){
        return curacion;
    }

    public String curar(){
        return "Regeneraste " + (super.getVida() * curacion) + " pts. de Vida a un aliado";
    }

    @Override
    public String atacar(){
        return "Lanzaste un ataque de " + super.getAtaque() + " pts. de Ataque";
    }

    @Override
    public String toString(){
        return String.format("%s %n%s %n%s: %,.2f de su Vida", 
        "Personaje de Apoyo", super.toString(), "Curación", getCuracion());
    }
}
