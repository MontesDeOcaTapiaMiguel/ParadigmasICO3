public class PruebaPersonajes {
    public static void main(String[] args) {
        PersonajeADistancia pjDistancia = new PersonajeADistancia("Exusiai", "Fuego", 25000, 8000, 1500, 10, 20);
        PersonajeCuerpoACuerpo pjCorporal = new PersonajeCuerpoACuerpo("Faenón", "INT", 35000, 12000, 3500, 2, "Espada");
        PersonajeDefensor pjDefensor = new PersonajeDefensor("Gohan Beast", "STR", 50000, 4500, 5000, 4, "Puño Limpio", 0.4);
        PersonajeDeApoyo pjApoyo = new PersonajeDeApoyo("Robin", "Físico", 40000, 5000, 2000, 0.7);

        Perosnaje[] personajes = new Personaje[4];
        
        Personaje[0] = pjDistancia;
        Personaje[1] = pjCorporal;
        Personaje[2] = pjDefensor;
        Personaje[3] = pjApoyo;

        System.out.println("Empleados procesados en forma polimorfica:\n");

        for (Empleado personajeActual : personaje){
            System.out.println(personajeActual);

            if (personajeActual instanceof PersonajeDeApoyo)
            {
                PersonajeDeApoyo pj = (PersonajeDeApoyo) personajeActual;

                System.out.println(pj.curar());
            } 
            System.out.printf("Ataque: %s", personajeActual.atacar());
        }

        for(int j = 0; j < personajes.length; j++){
            System.out.printf("El personaje %d es un %s\n", (j + 1), personajes[j].getClass().getName());
        }
    }
}
