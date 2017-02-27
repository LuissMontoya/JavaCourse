package ensayo52;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(49, 49, 58, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(49, 105, 58, 14);
		frame.getContentPane().add(lblMatricula);
		
		textField = new JTextField();
		textField.setBounds(117, 46, 258, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 99, 258, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(55, 174, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(154, 174, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(253, 174, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
