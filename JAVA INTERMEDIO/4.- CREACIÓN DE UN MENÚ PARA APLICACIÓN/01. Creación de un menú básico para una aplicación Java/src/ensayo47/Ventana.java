package ensayo47;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ventana {
    JFrame ventana;
    JMenu opcion1,opcion2;
    JMenuItem sub1;
    JMenuBar menubar;
    
    public void crearmenu(){
        menubar= new JMenuBar();
        
        opcion1=new JMenu("1");
        opcion2=new JMenu("2");
    }
    
    public void crearventana(){
        ventana=new JFrame("ventana con menú");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setSize(300,300);
        ventana.setVisible(true);
        ventana.setJMenuBar(menubar);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        
    }
}
