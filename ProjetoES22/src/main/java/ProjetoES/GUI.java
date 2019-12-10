package ProjetoES;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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
import javax.swing.table.DefaultTableModel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
		frame.setBounds(100, 100, 894, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblQualidadeDeDeteo = new JLabel("Qualidade de Deteção de Erros");
		lblQualidadeDeDeteo.setBounds(99, 11, 200, 14);
		lblQualidadeDeDeteo.setForeground(Color.BLUE);
		frame.getContentPane().add(lblQualidadeDeDeteo);

		
		JButton btnMostrarExcel = new JButton("Mostrar Excel");
		btnMostrarExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Excel ex = new Excel();
				final JFileChooser jf = new JFileChooser();
				int jff = jf.showOpenDialog(jf);
				DefaultTableModel dtm = new DefaultTableModel();
				if(jff ==JFileChooser.APPROVE_OPTION) {
					try { 
						File excel = jf.getSelectedFile();
						FileInputStream excelFIS = new FileInputStream(excel);
						BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
						XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
						XSSFSheet excelsh = excelJTable.getSheetAt(0);
						
						boolean primlinha = true;
						for(int coluna=0; coluna <= excelsh.getLastRowNum(); coluna++) {
							XSSFRow colunaexcel = excelsh.getRow(coluna); 
							XSSFCell[] cell = new XSSFCell[colunaexcel.getLastCellNum()];
							for(int a = 0; a<colunaexcel.getLastCellNum(); a++) {
								cell[a] = colunaexcel.getCell(a);
							}
							if(primlinha) {
								dtm.setColumnIdentifiers(cell);
								primlinha=true;
							}else
								dtm.addRow(cell);
								
						}
								
							
						}catch (FileNotFoundException e) {
							JOptionPane.showMessageDialog(null, e.getMessage());
						} catch (IOException e) {
							JOptionPane.showMessageDialog(null, e.getMessage());
						} finally {
						try {
							ex.readexcel();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}}
		});
		btnMostrarExcel.setBounds(109, 50, 145, 23);
		frame.getContentPane().add(btnMostrarExcel);
		
		JComboBox Metrica = new JComboBox();
		Metrica.setBounds(26, 113, 74, 20);
		Metrica.setModel(new DefaultComboBoxModel(new String[] {"Metrica", "LOC", "CYCLO", "ATFD", "LAA"}));
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
		comboBox_1.setBounds(131, 196, 104, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"And", "Or"}));
		frame.getContentPane().add(comboBox_1);
		 
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(26, 280, 74, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Metrica", "LOC", "CYCLO", "ATFD", "LAA"}));
		frame.getContentPane().add(comboBox_2);
		 
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(131, 280, 104, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Comparador", ">", "<", ">=", "<="}));
		frame.getContentPane().add(comboBox_3);
		 
		textField_1 = new JTextField();
		textField_1.setBounds(285, 280, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnAvaliarQualidasw.setBounds(109, 375, 145, 23);
		frame.getContentPane().add(btnAvaliarQualidasw);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(395, 11, 473, 506);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		
		
	}
}
