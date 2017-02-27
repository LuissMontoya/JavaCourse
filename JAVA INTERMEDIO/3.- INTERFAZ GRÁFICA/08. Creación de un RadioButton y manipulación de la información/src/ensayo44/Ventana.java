package ensayo44;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana implements ChangeListener{
    JFrame Ventana;
    JPanel panelA,panelB,panelC;
    JLabel saludo;
    JButton boton;
    JRadioButton botonA,botonB,botonC;
    ButtonGroup grupo;
    public void crearpanelA(){
        panelA = new JPanel();
        saludo= new JLabel("BIENVENIDOS");
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(saludo);
                
    }
    public void crearpanelB(){
        panelB =new JPanel();
        boton= new JButton("Entrar");
        panelB.setLayout(new BoxLayout(panelB,BoxLayout.X_AXIS ));
        panelB.add(boton);
    }
    public void crearpanelC(){
        panelC=new JPanel();
        grupo= new ButtonGroup();
        
        botonA=new JRadioButton("A");
        botonA.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(botonA);
        
        botonB=new JRadioButton("B");
        botonB.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(botonB);
        
        botonC=new JRadioButton("C");
        botonC.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(botonC);
        
        grupo.add(botonA);
        grupo.add(botonB);
        grupo.add(botonC);
    }
    public void stateChanged(ChangeEvent arg0){
        if (botonA.isSelected()){
            System.out.println("BOTON 1");
        }
        if (botonB.isSelected()){
            System.out.println("BOTON 2");
        }
        if (botonC.isSelected()){
            System.out.println("BOTON 3");
        }
    }
    public void crearventana(){
        Ventana= new JFrame();
        Ventana.setTitle("MASTER MADI");
        Ventana.setSize(400, 400);
        Ventana.setLayout(new BoxLayout(Ventana.getContentPane(), BoxLayout.Y_AXIS));
        Ventana.setLocationRelativeTo(null);
        Ventana.setVisible(true);
        Ventana.add(panelA);
        Ventana.add(panelB);
        Ventana.add(panelC);
        Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
    }
    public Ventana(){
        crearpanelA();
        crearpanelB();
        crearpanelC();
        crearventana();
    }
}
