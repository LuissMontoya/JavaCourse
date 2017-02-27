package ensayo59;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int num1,num2,r;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblN = new JLabel("N=");
		lblN.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblD = new JLabel("R=");
		lblD.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblR = new JLabel("R=");
		lblR.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblR);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(66, 8, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 57, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 117, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					r=num1/num2;
					textField_2.setText(String.valueOf(r));
				} catch (NumberFormatException numberFormatException) {
					// TODO: handle exception
					System.out.println("escribe dos numeros mayores de cero");
				} catch(ArithmeticException arithmeticException){
					System.out.println(arithmeticException.toString());
				}
				
			}
		});
		btnDividir.setBounds(63, 169, 89, 23);
		frame.getContentPane().add(btnDividir);
	}
}
