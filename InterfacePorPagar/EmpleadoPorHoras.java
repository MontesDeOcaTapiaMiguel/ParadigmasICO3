public class EmpleadoPorHoras extends Empleado {
    private double sueldo; //Sueldo por hora
    private double horas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, 
        String numeroSeguroSocial, double sueldo, double horas)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");

        if((horas < 0.0) || (horas > 168.0))
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");

        this.sueldo = sueldo;
        this.horas = horas;
    }

    public void setSueldo(double sueldo)
    {
        if(sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");

        this.sueldo = sueldo;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setHoras(double horas)
    {
        if((horas < 0.0) || (horas > 168.0))
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");

        this.horas = horas;
    }

    public double getHoras()
    {
        return horas;
    }

    @Override
    public double obtenerMontoPago()
    {
        if (getHoras() <= 40) //Valida horas extras
            return getSueldo() * getHoras();
        else
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
    }

    @Override
    public String toString()
    {
        return String.format("Emlpeado por horas: %s%n%s: $%,.2f; %s: %,.2f", 
            super.toString(), "Sueldo por hora", getSueldo(), "Horas trabajadas", getHoras());
    }

}
