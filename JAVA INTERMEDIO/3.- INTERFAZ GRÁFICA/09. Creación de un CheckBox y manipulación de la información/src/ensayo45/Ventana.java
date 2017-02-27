package ensayo45;

import java.awt.TextField;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public   class Ventana implements ChangeListener{
    JFrame ventana;
    JPanel panelA,panelB,panelC,panelD;
    JLabel saludo;
    JButton botonP;
    JRadioButton botonA,botonB,botonC;
    ButtonGroup grupo;
    TextField texto;
    JCheckBox checarA,checarB,checarC;
    
    public void crearpanelA(){
        panelA =new JPanel();
        saludo =new JLabel("BIENVENIDOS");
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(saludo);
    }
    
    public void crearpanelB(){
        panelB=new JPanel();
        botonP=new JButton("Entrar");
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(botonP);
    }
    
    public void crearpanelC(){
        panelC= new JPanel();
        
        grupo= new ButtonGroup();
        
        botonA= new JRadioButton("1");
        botonA.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(botonA);
        
        botonB=new JRadioButton("2");
        botonB.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(botonB);
        
        botonC=new JRadioButton("3");
        botonB.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(botonC);
        
        grupo.add(botonA);
        grupo.add(botonB);
        grupo.add(botonC);
        
        texto =new TextField();
        texto.setColumns(10);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(texto);
        
        checarA=new JCheckBox("1");
        checarA.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(checarA);
        
        checarB=new JCheckBox("2");
        checarB.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(checarB);
        
        checarC=new JCheckBox("3");
        checarC.addChangeListener(this);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(checarC);
        
    }
    public void stateChanged(ChangeEvent arg0){
        if (botonA.isSelected()){
            System.out.println("1");
        }
        if (botonB.isSelected()){
            System.out.println("2");
        }
        if (botonC.isSelected()){
            System.out.println("3");
        }
        if (checarA.isSelected()==true){
            texto.setText("a");
        }else if(checarB.isSelected()==true){
            texto.setText("b");
        }else if(checarC.isSelected()==true){
            texto.setText("c");
        }
    }
    
    public void crearventana(){
        ventana=new JFrame();
        ventana.setTitle("MASTER MADI");
        ventana.setSize(400,400);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.add(panelA);
        ventana.add(panelB);
        ventana.add(panelC);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
    public Ventana(){
        crearpanelA();
        crearpanelB();
        crearpanelC();
        crearventana();
        
    }
    
 }
            

