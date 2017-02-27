package ensayo42;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana {
    JFrame Ventana;
    JPanel panelA,panelB;
    JLabel saludo,saludo2;
    
    
    public void crearpanelA(){
        panelA= new JPanel();
        saludo= new JLabel("MASTER MADI");
        panelA.setLayout(new BoxLayout(panelA,BoxLayout.X_AXIS));
        panelA.add(saludo);
    }
    public void crearpanelB(){
        panelB= new JPanel();
    }
    public void crearventana(){
        Ventana= new JFrame();
        Ventana.setTitle("hola a todos");
        Ventana.setSize(400,400);
        Ventana.setLayout(new BoxLayout(Ventana.getContentPane(),BoxLayout.Y_AXIS));
        Ventana.add(panelA);//se crean los paneles
        Ventana.add(panelB);//tanto el a como el b
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
    }
    public Ventana(){//se crea un constructor
        crearpanelA();//se puede notar el orden con el que se crean los panels y demas
        crearpanelB();
        crearventana();
    }
}
