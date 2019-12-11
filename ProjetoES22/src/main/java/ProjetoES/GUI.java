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
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.ScrollPane;

public class GUI {

	private JFrame frmQualidadeDeDeteo;
	private final JButton btnAvaliarQualidasw = new JButton("Adicionar Regra");
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private File excel;
	private Regra regra;
	DefaultTableModel dtm = new DefaultTableModel();  //mudei isto para aqui

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmQualidadeDeDeteo.setVisible(true);
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
		frmQualidadeDeDeteo = new JFrame();
		frmQualidadeDeDeteo.setFont(new Font("Algerian", Font.BOLD, 14));
		frmQualidadeDeDeteo.setTitle("Qualidade de Deteção de Erros\r\n");
		frmQualidadeDeDeteo.setBounds(100, 100, 894, 567);
		frmQualidadeDeDeteo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQualidadeDeDeteo.getContentPane().setLayout(null);


		JButton btnMostrarExcel = new JButton("Mostrar Excel");
		btnMostrarExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Excel ex = new Excel();
				final JFileChooser jf = new JFileChooser();
				int jff = jf.showOpenDialog(jf);
			//	DefaultTableModel dtm = new DefaultTableModel();
				if(jff ==JFileChooser.APPROVE_OPTION) {
					try { 
						 excel = jf.getSelectedFile();
						FileInputStream excelFIS = new FileInputStream(excel);
						BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
						XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
						XSSFSheet excelsh = excelJTable.getSheetAt(0);

						boolean primlinha = true;
						for(int linha=0; linha <= excelsh.getLastRowNum(); linha++) {
							XSSFRow linhaexcel = excelsh.getRow(linha); 
							XSSFCell[] cell = new XSSFCell[linhaexcel.getLastCellNum()];
							for(int a = 0; a<linhaexcel.getLastCellNum(); a++) {
								cell[a] = linhaexcel.getCell(a);
							}
							if(primlinha) {
								dtm.setColumnIdentifiers(cell);
								primlinha=false;
							}else
								dtm.addRow(cell);
					//		System.out.println(cell);

						} 

						Operacoes.comparador_longMehtod_plasma(excel);
					}catch (FileNotFoundException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					} 
				}}
		});
		btnMostrarExcel.setBounds(27, 23, 167, 23);
		frmQualidadeDeDeteo.getContentPane().add(btnMostrarExcel);

		final JComboBox comboBoxMetricaBaixo = new JComboBox();
		comboBoxMetricaBaixo.setBounds(438, 89, 99, 20);
		comboBoxMetricaBaixo.setModel(new DefaultComboBoxModel(new String[] {"Metrica", "LOC", "CYCLO", "ATFD", "LAA"}));
		comboBoxMetricaBaixo.setToolTipText("");
		frmQualidadeDeDeteo.getContentPane().add(comboBoxMetricaBaixo);

		final JComboBox comboBoxComparador = new JComboBox();
		comboBoxComparador.setBounds(582, 24, 104, 20);
		comboBoxComparador.setModel(new DefaultComboBoxModel(new String[] {"Comparador", "IGUAL","MAIOR","MENOR","MAIORouIGUAL","MENORouIGUAL"}));
		frmQualidadeDeDeteo.getContentPane().add(comboBoxComparador);


		textField = new JTextField();
		textField.setBounds(728, 89, 99, 20);
		frmQualidadeDeDeteo.getContentPane().add(textField);
		textField.setColumns(10);

		final JComboBox comboBoxAndOr = new JComboBox();
		comboBoxAndOr.setBounds(728, 58, 103, 20);
		comboBoxAndOr.setModel(new DefaultComboBoxModel(new String[] {"And", "Or"}));
		frmQualidadeDeDeteo.getContentPane().add(comboBoxAndOr);

		final JComboBox comboBoxMetricaCima = new JComboBox();
		comboBoxMetricaCima.setBounds(438, 24, 99, 20);
		comboBoxMetricaCima.setModel(new DefaultComboBoxModel(new String[] {"Metrica", "LOC", "CYCLO", "ATFD", "LAA"}));
		frmQualidadeDeDeteo.getContentPane().add(comboBoxMetricaCima);

		final JComboBox comboBoxComparadorCima = new JComboBox();
		comboBoxComparadorCima.setBounds(582, 89, 104, 20);
		comboBoxComparadorCima.setModel(new DefaultComboBoxModel(new String[] {"Comparador", "IGUAL","MAIOR","MENOR","MAIORouIGUAL","MENORouIGUAL"}));
		frmQualidadeDeDeteo.getContentPane().add(comboBoxComparadorCima);

		textField_1 = new JTextField();
		textField_1.setBounds(728, 24, 99, 20);
		frmQualidadeDeDeteo.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnAvaliarQualidasw.setBounds(582, 142, 145, 23);
		frmQualidadeDeDeteo.getContentPane().add(btnAvaliarQualidasw);
   
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 176, 858, 341);
		frmQualidadeDeDeteo.getContentPane().add(scrollPane);

		table = new JTable();

		scrollPane.setViewportView(table);

//		table.setModel(new DefaultTableModel(
//				new Object[][] {
//					
//				},   
//				new String [] {
//						
//				}
//				));
		table.setModel(dtm); // fez me sentido ser assim
		
		JButton btnAvaliarQualidadeInicial = new JButton("Detetar Erros");
		btnAvaliarQualidadeInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DetetarErroGUI d = new DetetarErroGUI();
				d.main(null);
				DetecaoDefeito d1 = new DetecaoDefeito();
				d1.detetarDefeito(regra,excel);
			}
		});
		btnAvaliarQualidadeInicial.setBounds(27, 68, 167, 23);
		frmQualidadeDeDeteo.getContentPane().add(btnAvaliarQualidadeInicial);
		
		JButton btnNewButton = new JButton("Comparar erros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Regra: " + "  " + "Iplasma: " + "   " + "PMD: \t" + "Regra: " + "  " + "Iplasma: " + "   " + "PMD: \t");
				
			}
		});
		btnNewButton.setBounds(27, 114, 167, 23);
		frmQualidadeDeDeteo.getContentPane().add(btnNewButton);
		
		btnAvaliarQualidasw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valorBaixo = Integer.parseInt(textField.getText());
				int valorCima = Integer.parseInt(textField_1.getText());
				System.out.println(valorCima);
				System.out.println(valorBaixo);
				String comparadorStringCima = (String)comboBoxComparador.getSelectedItem();
				String comparadorStringBaixo = (String)comboBoxComparadorCima.getSelectedItem();
				Comparador comparadorCima = Comparador.valueOf(comparadorStringCima);
				Comparador comparadorBaixo = Comparador.valueOf(comparadorStringBaixo);
				System.out.println(comparadorCima);
				System.out.println(comparadorBaixo);
				String metricaStringCima = (String)comboBoxMetricaCima.getSelectedItem();
				String metricaStringBaixo = (String)comboBoxMetricaBaixo.getSelectedItem();
				Metrica metricaCima = Metrica.valueOf(metricaStringCima);
				Metrica metricaBaixo = Metrica.valueOf(metricaStringBaixo);
				System.out.println(metricaCima);
				System.out.println(metricaBaixo);
				String AndOrString = (String)comboBoxAndOr.getSelectedItem();
				AndOr inha =AndOr.valueOf(AndOrString);
				regra = new Regra(1,comparadorCima,comparadorBaixo,valorCima,valorBaixo,metricaCima,metricaBaixo,inha);
			}
		});

	}
}
