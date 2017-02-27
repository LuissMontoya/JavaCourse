package ensayo56;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
        JTextField entrada;
        File archivo;
        JButton boton;
        
        public Ventana(){
            entrada=new JTextField("Escribe");
            boton=new JButton("Guardar");
            add(entrada);
            add(boton);
            boton.addActionListener(this);
            
            Container contenedor =getContentPane();
            contenedor.add(entrada,BorderLayout.NORTH);
            
            setSize(400, 400);
            setVisible(true);
        }
        
    
    public void actionPerformed(ActionEvent e) {
        String texto= entrada.getText();
        
        if(e.getSource()==boton){
            File archivo =new File("C:\\Users\\MITCH\\OneDrive - Universidad de la Amazonia\\SOLUCIÓN DE TUTORIALES\\JAVA INTERMEDIO\\archivo.txt");
            
            try {
                FileWriter writer =new FileWriter(archivo);
                PrintWriter  escribir =new PrintWriter(writer);
                escribir.append("hola");
                escribir.println();
                escribir.println();
                escribir.append(texto);
                escribir.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
}
