package ensayo50;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana {
    JFrame ventana;
    JPanel panelA,panelB;
    JTextField texto;
    JButton boton;
    
    public void crearpanelA(){
        panelA=new JPanel();
        texto=new JTextField();
        texto.setColumns(10);
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(texto);
        
    }
    public void crearpanelB(){
        panelB=new JPanel();
        boton=new JButton("Entrar");
        boton.setBounds(139, 53, 89, 23);
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(boton);
    }
    
    public void crearventana(){
        ventana=new JFrame();
        ventana.setTitle("MASTER MADI");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setSize(400, 400);
        ventana.add(panelA);
        ventana.add(panelB);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
    public Ventana(){
        crearpanelA();
        crearpanelB();
        crearventana();
    }
}
