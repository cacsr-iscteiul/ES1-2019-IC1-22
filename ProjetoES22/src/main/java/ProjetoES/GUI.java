package ProjetoES;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class GUI {

	private JFrame frame;
	private final JButton btnAvaliarQualidasw = new JButton("Avaliar Qualidade");
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblQualidadeDeDeteo = new JLabel("Qualidade de Deteção de Erros");
		lblQualidadeDeDeteo.setBounds(86, 11, 200, 14);
		lblQualidadeDeDeteo.setForeground(Color.BLUE);
		frame.getContentPane().add(lblQualidadeDeDeteo);

		
		JButton btnMostrarExcel = new JButton("Mostrar Excel");
		btnMostrarExcel.setBounds(109, 50, 134, 23);
		btnMostrarExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Excel excel = new Excel();
					excel.readexcel();
					
					 
			} catch (IOException e1) {
					// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		});
		frame.getContentPane().add(btnMostrarExcel);
		
		JComboBox Metrica = new JComboBox();
		Metrica.setBounds(26, 113, 74, 20);
		Metrica.setModel(new DefaultComboBoxModel(new String[] {"Metrica"}));
		Metrica.setToolTipText("");
		frame.getContentPane().add(Metrica);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(131, 113, 104, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Comparador", ">", "<", ">=", "<="}));
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(285, 113, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(131, 182, 104, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"And", "Or"}));
		frame.getContentPane().add(comboBox_1);
		 
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(26, 280, 74, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Metrica"}));
		frame.getContentPane().add(comboBox_2);
		 
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(131, 280, 104, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Comparador", ">", "<", ">=", "<="}));
		frame.getContentPane().add(comboBox_3);
		 
		textField_1 = new JTextField();
		textField_1.setBounds(285, 280, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnAvaliarQualidasw.setBounds(118, 375, 117, 23);
		frame.getContentPane().add(btnAvaliarQualidasw);
		
		table = new JTable();
		table.setBounds(420, 50, 280, 390);
		frame.getContentPane().add(table);
		
		
		
	}
}
