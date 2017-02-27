package ensayo51;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana implements ActionListener{
    JFrame ventana;
    JButton boton;
    JPanel panelA,panelB,panelC;
    TextField texto;
    JLabel text;
    public void crearpanelC(){
        panelC=new JPanel();
        text=new JLabel("MASTER MADI");
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(text);
    }
    public void crearpanelA(){
        panelA=new JPanel();
        texto=new TextField();
        texto.addActionListener(this);
        texto.setColumns(10);
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(texto);
        
    }
    public void crearpanelB(){
        panelB=new JPanel();
        boton=new JButton("Entrar");
        boton.setBounds(139, 53, 89, 23);
        boton.addActionListener(this);
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
        ventana.add(panelC);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
    public Ventana(){
        crearpanelA();
        crearpanelB();
        crearpanelC();
        crearventana();
    }

    public void actionPerformed(ActionEvent e) {
        String dato= boton.getText();
        if(dato.equals("HOLA")){
            System.out.println("hola");//pendiente la puta interación
        }
    }
}


