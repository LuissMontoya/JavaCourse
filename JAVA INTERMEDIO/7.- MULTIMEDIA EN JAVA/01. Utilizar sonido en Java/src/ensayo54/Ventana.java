    package ensayo54;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Ventana implements ActionListener{
    JFrame ventana;
    JPanel panelA;
    JButton boton;
    Clip sonido;
    public void crearpanelA(){
        panelA=new JPanel();
        panelA.setSize(120,120);
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
       
        boton=new JButton();
        
        boton.setSize(100, 100);
        boton.setText("Play");
        panelA.add(boton);
    }
    public void ejecutarAudio() throws IOException, UnsupportedAudioFileException, InterruptedException, LineUnavailableException{
        try{
        sonido= AudioSystem.getClip();
            File Archivo=new File("C:\\Users\\MITCH\\OneDrive - Universidad de la Amazonia\\SOLUCIÓN DE TUTORIALES\\JAVA INTERMEDIO\\7.- MULTIMEDIA EN JAVA\\Kalimba.mp3");
            //File Archivo=new File("1.mp3");
            sonido.open(AudioSystem.getAudioInputStream(Archivo));
            sonido.start();
            Thread.sleep(1000);
            sonido.close();
            //System.out.println("ENTRAR");
        }catch(LineUnavailableException e){
            e.printStackTrace();
        }
    }
     public void crearventana(){
         ventana=new JFrame();
         ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
         ventana.setTitle("MASTER MADI");
         ventana.setSize(400,400);
         ventana.add(panelA);
         boton.addActionListener(this);
         ventana.setVisible(true);
         ventana.setLocationRelativeTo(null);
         ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
         
     }
     public Ventana(){
         crearpanelA();
         crearventana();
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            ejecutarAudio();
        } catch (IOException | UnsupportedAudioFileException e1) {
            e1.printStackTrace();
        } catch(InterruptedException e1){
            e1.printStackTrace();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    




