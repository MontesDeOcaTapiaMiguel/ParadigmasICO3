package eventos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
// Importar paquetes adicionales
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class EventosTeclado extends JFrame 
{
    public EventosTeclado() 
    {
        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25, 10, 350, 30);

        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25, 165, 200, 30);

        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);

        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);
        
        // Generamos el objeto de tipo listener para detectar eventos del teclado
        // Creando la clase anonima para implementae a la interfaz KeyListener
        KeyListener keyL = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
                System.out.println("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent event) {
                System.out.println("keyPressed");

                //SEGUNDA EJECUCIÓN
                //Detectar cual es la tecla que se ha presionado
                //Explicar que se deben dirigir a la documentación del API y verificar la clase KeyEvent
                //y verificar la lista de campos/atributos estáticos los cuales corresponden a las teclas
                //o combinaciones de teclas a detectar
                if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Has presionado enter");
                }
                if (event.getKeyCode() == KeyEvent.VK_F1) {
                    System.out.println("Has presionado la tecla F1");
                }
                //¿Porqué implementamos este código aquí y no en KeyTyped?
                //Tambien podemos detectae las teclas por caracteres unicode que se han presionado
                if (event.getKeyCode() == KeyEvent.VK_A) {
                    System.out.println("Has presionado la tecla a");
                }
            }

            @Override
            public void keyReleased(KeyEvent event) {
                System.out.println("keyReleased");
            }
        };

        //Agregar el listener al componente campoSaludo
        campoSaludo.addKeyListener(keyL);

        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        EventosTeclado objEventosTeclado = new EventosTeclado();
    }
}