package ensayo48;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ventana {
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
    }
    
    public void crearventana(){
        ventana=new JFrame("ventana con menú");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setSize(300,300);
        ventana.setVisible(true);
        ventana.setJMenuBar(menubar);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
    public ventana(){
        crearmenu();
        crearventana();
    }
}
