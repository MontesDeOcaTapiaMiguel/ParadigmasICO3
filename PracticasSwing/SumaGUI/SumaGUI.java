import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumaGUI
{
    private Frame f;
    private Panel pan1, pan2, pan3;
    private JLabel lblInstruccion, lblNum1, lblNum2,lblResultado;
    private TextField tfNum1, tfNum2, tfResultado;
    private Button btSalir, btCalcular;

    public SumaGUI()
    {
        f = new Frame("Suma de dos números");
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();
        lblInstruccion = new JLabel("<html><Center>Instrucciones: Ingrese los números a sumar en los cuadros de texto. <br>Posteriormente de clic en el botón SUMAR</Center></html>");
        lblNum1 = new JLabel("<html>Primer número: </html>");
        lblNum2 = new JLabel("<html>Segundo número: </html>");
        lblResultado = new JLabel("<html>Resultado: </html>");
        tfNum1 = new TextField(5);
        tfNum2 = new TextField(5);
        tfResultado = new TextField(8);
        tfResultado.setEditable(false);
        btCalcular = new Button("Calcular");
        btSalir = new Button("Salir");
    }

    public void acomodarEnFrame()
    {
        btCalcular.addActionListener(new MnjBotonCalcular());
        btSalir.addActionListener(new MnjBotonSalir());
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0); // El 0 indica que la aplicación se cierra a si misma
            }
        });

        //Agregamos los componentes del panel 1
        pan1.add(lblInstruccion);
        f.add(pan1, BorderLayout.NORTH);

        //Agregamos los componentes del Panel 2
        pan2.setLayout(new GridLayout(3, 2)); //Definimos el esquema de ordenación, 3 filas y 2 columnas para el primer panel
        pan2.add(lblNum1);
        pan2.add(tfNum1);
        pan2.add(lblNum2);
        pan2.add(tfNum2);
        pan2.add(lblResultado);
        pan2.add(tfResultado);
        f.add(pan2, BorderLayout.CENTER);

        //Agregamos los componentes del Panel 3
        pan3.setLayout(new GridLayout(1, 2));
        pan3.add(btCalcular);
        pan3.add(btSalir);
        f.add(pan3, BorderLayout.SOUTH);

        f.setSize(300, 300);
        f.setVisible(true);
    }

    class MnjBotonCalcular implements ActionListener 
    {
        public void actionPerformed(java.awt.event.ActionEvent actionEvent)
        {
            double n1, n2, res;
            n1 = Double.valueOf(tfNum1.getText());
            n2 = Double.valueOf(tfNum2.getText());
            res = n1 + n2;
            tfResultado.setText(Double.toString(res));
        }
    }

    class MnjBotonSalir implements ActionListener 
    {
        public void actionPerformed(java.awt.event.ActionEvent actionEvent)
        {
            System.exit(-1); //El -1 Indica que fue el usuario quien cerró la aplicación
        }
    }

    public static void main(String[] args) {
        SumaGUI ventanaSuma = new SumaGUI();
        ventanaSuma.acomodarEnFrame();
    }
}