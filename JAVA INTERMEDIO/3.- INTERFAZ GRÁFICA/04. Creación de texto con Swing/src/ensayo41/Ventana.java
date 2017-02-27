package ensayo41;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana {
    JFrame Ventana;
    JPanel PanelA, PanelB;
    JLabel saludo, saludo2;
    
    
    public void crearpanelA(){
       PanelA = new JPanel();
       saludo= new JLabel("BIENVENIDOS");
       saludo2= new JLabel("bienvenido nuevamente");//se puede agregar un texto usando la etiqueta Jlabel
       PanelA.setLayout(new BoxLayout(PanelA, BoxLayout.X_AXIS));
       PanelA.setLayout(new BoxLayout(PanelA, BoxLayout.X_AXIS));//se crea el layaout
       PanelA.add(saludo);
       PanelA.add(saludo2);//y se adjunta uqe es como dar el permiso
    }
    public void crearpanelB(){
       PanelB = new JPanel();
    }
    
    public void crearventana(){
        Ventana = new JFrame();
        Ventana.setTitle("MASTER MADI");
        Ventana.setSize(400, 400);
        Ventana.setLayout(new BoxLayout(Ventana.getContentPane(),BoxLayout.Y_AXIS));
        
        Ventana.setLocationRelativeTo(null);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
    }
}
