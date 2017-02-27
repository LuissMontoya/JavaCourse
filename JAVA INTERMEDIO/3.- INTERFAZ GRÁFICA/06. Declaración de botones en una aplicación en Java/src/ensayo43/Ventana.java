package ensayo43;

import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana {
    JFrame Ventana;
    JPanel panelA,panelB;
    JLabel saludo;
    JButton boton;//se crea la etiqueta par el boton

public void crearpanelA(){
    panelA= new JPanel();
    saludo=new JLabel("COMPUTER FAILED");
    panelA.setLayout(new BoxLayout(panelA,BoxLayout.X_AXIS));
    panelA.add(saludo);
}

public void crearpanelB(){
    panelB=new JPanel();
    boton=new JButton("Entrar");//se inicia el nuevo boton
    panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));//se le da posicicón
    panelB.add(boton);//se adjunta y listo
            
}

public void crearventana(){
    Ventana= new JFrame();
    Ventana.setTitle("MASTER MADI");
    Ventana.setSize(400, 400);
    Ventana.setLayout(new BoxLayout(Ventana.getContentPane(),BoxLayout.Y_AXIS));
    Ventana.setLocationRelativeTo(null);
    Ventana.add(panelA);
    Ventana.add(panelB);
    Ventana.setVisible(true);
    Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
}

public Ventana(){
    crearpanelA();
    crearpanelB();
    crearventana();
    
}

    private void setIconImage(Image image) {
        setIconImage(new ImageIcon(getClass().getResource("..//Complements//icon1.jpg")).getImage());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
