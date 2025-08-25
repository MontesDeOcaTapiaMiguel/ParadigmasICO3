public class Animal {
    private String nombre;
    private String raza;
    private String color;

    public Animal(String nombre, String raza, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
    
    //Definimos getter y setter para cada campo
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    public String getNombre(){
    return nombre;
    }
    

    public void setRaza(String raza){
    this.raza = raza;
    }

    public String getRaza(){
    return raza;
    }

    
    public void setColor(String color){
    this.color = color;
    }

    public String getColor(){
    return color;
    }
}