package ensayo39;

import javax.swing.JFrame;

public class Ventana {
    JFrame ventana;  // Jframe es elemeto que nos permite poder crear una ventana
    
    public void ventana(){//el constructor
        ventana= new JFrame();//el objeto
        ventana.setTitle("MASTER MADI");//el titulo de la ventana
        ventana.setSize(400,400);//el tamaño de la ventana
        
    }
}
