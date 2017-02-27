package ensayo49;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ventana implements ActionListener{
    JFrame ventana;
    JMenu opcion1,opcion2,sopcion1,sopcion2,sopcion3,sopcion4;
    JMenuItem sub1,sub2;
    JMenuBar menubar;
    
    public void crearmenu(){
        menubar=new JMenuBar();
        
        opcion1=new JMenu("1");
        opcion2=new JMenu("2");
        
        sopcion1=new JMenu("A");
        sopcion2=new JMenu("B");
        sopcion3=new JMenu("C");
        sopcion4=new JMenu("D");
        
        sub1=new JMenuItem("X");
        sub2=new JMenuItem("Y");
        
        menubar.add(opcion1);
        menubar.add(opcion2);
        
        opcion1.add(sopcion1);
        opcion1.add(sopcion2);
        opcion2.add(sopcion3);
        opcion2.add(sopcion4);
        
        sopcion2.add(sub1);
        sopcion2.add(sub2); 
        
        sopcion1.addActionListener(this);
        sopcion2.addActionListener(this);
        sopcion3.addActionListener(this);
        sopcion4.addActionListener(this);
        
        sub1.addActionListener(this);
        sub2.addActionListener(this);
        
        
    }
        public void crearventana(){
        ventana=new JFrame("ventana con menú");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setSize(300,300);
        ventana.setVisible(true);
        ventana.setJMenuBar(menubar);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        }
        public Ventana(){
            crearmenu();
            crearventana();
        }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub1){
            //System.out.println("ensayo49.Ventana.actionPerformed()");
            //ventana.setSize(500, 500);
            
        }
            
    }
}
