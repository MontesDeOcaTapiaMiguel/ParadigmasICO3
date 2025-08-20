
public class Tiempo1 {
   // definimos 3 variables de tipo privadas
    private int hora;
    private int minuto;
    private int segundo;
// ahora establecemos el metodo que nos dice a cuanto va a equivaler cada variable
    public void establecerTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60) {
//con esta linea se estableze que si llega a pasar algun valos de las variables se marque
            throw new IllegalArgumentException(
                "hora, minuto y/o segundo estaban fuera de rango" );
        }
// ahora el metodo asigna valores a las variables
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

//ya teniendo lo anterior hacemos el metodo para devolver la hora
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
// con este metodo se devuelve igual la hora pero definiendolo en 12 horas
    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((hora == 0 || hora == 12) ? 12 : hora % 12),
            minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
}