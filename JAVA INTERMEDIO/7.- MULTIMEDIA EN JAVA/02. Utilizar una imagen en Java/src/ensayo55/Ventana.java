package ensayo55;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Ventana {
        public Ventana(){
            JFrame frame=new JFrame();
            frame.add(new MyComponent());
            
            frame.setVisible(true);
            frame.setSize(400,400);
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            
        }
}
class MyComponent extends JComponent{
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        AffineTransform tx=new AffineTransform();
        
        double x=100;
        double y=100;
        tx.translate(x, y);
        
        //tx.rotate(60);
        
        g2d.setTransform(tx);
        g2d.drawImage(new ImageIcon("C:\\Users\\MITCH\\OneDrive - Universidad de la Amazonia\\SOLUCIÓN DE TUTORIALES\\JAVA INTERMEDIO\\7.- MULTIMEDIA EN JAVA\\1.jpg").getImage(), tx, this);
        
    }
}