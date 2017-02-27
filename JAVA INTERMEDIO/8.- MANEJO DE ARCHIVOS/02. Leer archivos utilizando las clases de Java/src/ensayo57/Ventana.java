package ensayo57;

import java.awt.BorderLayout;
import java.awt.Container;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
        JTextArea salida;
        JTextField entrada;
        
    public Ventana(){
        entrada=new JTextField("escribe el archivo\\directorio");
        entrada.addActionListener(this);
        
        salida=new JTextArea();
        ScrollPane scroll=new ScrollPane();
        scroll.add(salida);
        
        Container contenedor= getContentPane();
        contenedor.add(entrada,BorderLayout.NORTH);
        contenedor.add(scroll,BorderLayout.CENTER);
        setSize(400, 400);
        setVisible(true);
        /*
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        try{
        setIconImage(new ImageIcon(getClass().getResource("/Complements/icon.jpg")).getImage());}
        catch(Exception in){
            JOptionPane.showMessageDialog(rootPane, "damaged program, icon file not found");
        }
         try{
         ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Complements/Background4.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());}
         catch(Exception in){
             JOptionPane.showMessageDialog(rootPane, "damaged program, background file not found");
         }*/
    }
  
    public void actionPerformed(ActionEvent e) {
        File archivo=new File(e.getActionCommand());
        if(archivo.exists()){
            salida.setText(archivo.getName()+"existe\n");
            if(archivo.isFile()){
                salida.append("Es un archivo\n");
            }else{
                salida.append("no es un archivo\n");
                 }
             if(archivo.isDirectory()){
                 salida.append("es un directorio\n");
             }else{
                 salida.append("no es un directorio\n");
            }
             if(archivo.isFile()){
                 try{
                     BufferedReader leer=new BufferedReader(new FileReader(archivo));
                     StringBuffer buffer=new StringBuffer();
                     String texto;
                     
                     salida.append("\n\n\n");
                     
                     while ((texto=leer.readLine())!=null){
                         buffer.append("- "+texto+"\n");
                     }
                     
                     salida.append(buffer.toString());
                     
                 }catch(IOException ex){
                     JOptionPane.showMessageDialog(this, "error en archivo", "esto es un error", JOptionPane.ERROR_MESSAGE);
                     
                     } 
             }
             if(archivo.isDirectory()){
                 String directorio[]= archivo.list();
                 salida.append("archivos del directorio \n\n\n");
                 for (int i=0;i<directorio.length;i++)
                     salida.append("- "+ directorio[i]+"\n");
                 }
             }
        }
    }
    
  
