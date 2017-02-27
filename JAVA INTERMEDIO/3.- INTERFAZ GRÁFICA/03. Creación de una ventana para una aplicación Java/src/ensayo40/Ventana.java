package ensayo40;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana {
    JFrame Ventana;
    JPanel panelA,panelB;
    JLabel saludo;
    
    
    public void CrearPanelA(){//se crea el metodo para los paneles
        panelA = new JPanel();
        saludo = new JLabel("Bienvenidos");//el J lebel se usa par creae una bienvenida es una etiqueta
       // saludo.setText("bienvenidos"); se puede de ambas formas
       panelA.setLayout(new BoxLayout(panelA,BoxLayout.X_AXIS));//con el setlayout podemos incluirla en el panel
       panelA.add(saludo);
        
        
    }
    public void CrearPanelB(){//tanto par el panel a coo para el b
        panelB = new JPanel();
        
        
    }
    public void crearVentana(){
     Ventana=new JFrame();
     Ventana.setTitle("nueva ventana");
     Ventana.setSize(400,400);
     Ventana.setLayout(new BoxLayout(Ventana.getContentPane(),BoxLayout.Y_AXIS));//se agrega la ventana
     
     
     Ventana.setLocationRelativeTo(null);//no se quiere que la ventana sea de posición relativa
     Ventana.setVisible(true);//se usa para poder ver la ventana
     Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);//se usa para cerrar la ventana obligatoriamente
    }
    
    
    
    
}
