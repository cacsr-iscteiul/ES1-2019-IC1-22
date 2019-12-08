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

public class GUI {

	private JFrame frame;
	private final JButton btnAvaliarQualidasw = new JButton("Avaliar Qualidade");
	private JTextField textField;
	private JTextField textField_1;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 79, 35, 91, 146, 0, 0, 12, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblQualidadeDeDeteo = new JLabel("Qualidade de Deteção de Erros");
		lblQualidadeDeDeteo.setForeground(Color.BLUE);
		GridBagConstraints gbc_lblQualidadeDeDeteo = new GridBagConstraints();
		gbc_lblQualidadeDeDeteo.insets = new Insets(0, 0, 5, 5);
		gbc_lblQualidadeDeDeteo.gridx = 4;
		gbc_lblQualidadeDeDeteo.gridy = 0;
		frame.getContentPane().add(lblQualidadeDeDeteo, gbc_lblQualidadeDeDeteo);
		
		JButton btnMostrarExcel = new JButton("Mostrar Excel");
		GridBagConstraints gbc_btnMostrarExcel = new GridBagConstraints();
		gbc_btnMostrarExcel.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarExcel.gridx = 4;
		gbc_btnMostrarExcel.gridy = 1;
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
		frame.getContentPane().add(btnMostrarExcel, gbc_btnMostrarExcel);
		
		JComboBox Metrica = new JComboBox();
		Metrica.setModel(new DefaultComboBoxModel(new String[] {"Metrica"}));
		Metrica.setToolTipText("");
		GridBagConstraints gbc_Metrica = new GridBagConstraints();
		gbc_Metrica.fill = GridBagConstraints.HORIZONTAL;
		gbc_Metrica.insets = new Insets(0, 0, 5, 5);
		gbc_Metrica.gridx = 1;
		gbc_Metrica.gridy = 3;
		frame.getContentPane().add(Metrica, gbc_Metrica);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Comparador", ">", "<", ">=", "<="}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 3;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.VERTICAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 3;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 5;
		frame.getContentPane().add(comboBox_1, gbc_comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Metrica"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 7;
		frame.getContentPane().add(comboBox_2, gbc_comboBox_2);
		 
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Comparador", ">", "<", ">=", "<="}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 7;
		frame.getContentPane().add(comboBox_3, gbc_comboBox_3);
		 
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.VERTICAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 7;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		GridBagConstraints gbc_btnAvaliarQualidasw = new GridBagConstraints();
		gbc_btnAvaliarQualidasw.insets = new Insets(0, 0, 0, 5);
		gbc_btnAvaliarQualidasw.gridx = 4;
		gbc_btnAvaliarQualidasw.gridy = 9;
		frame.getContentPane().add(btnAvaliarQualidasw, gbc_btnAvaliarQualidasw);
	}

}
