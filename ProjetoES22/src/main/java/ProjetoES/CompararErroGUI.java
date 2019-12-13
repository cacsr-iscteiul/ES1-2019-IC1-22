package ProjetoES;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class CompararErroGUI {

	private JFrame frame;
	private JTable table;
	DefaultTableModel dtm = new DefaultTableModel();
	private JTable table_1;
	private Operacoes operacoes;
	private JTable table_2;
	

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint  
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompararErroGUI window = new CompararErroGUI();
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
//public CompararErroGUI() {
//		initialize(operacoes);
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(Operacoes operacoes) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 74, 164, 43);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(); 
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
				{operacoes.getDCI_longMehtod_plasma(),operacoes.getDII_longMehtod_plasma(), operacoes.getADCI_longMehtod_plasma(),operacoes.getADII_longMehtod_plasma()},
				},
			new String[] {
					"DCI", "DII", "ADCI", "ADII"
			} 
		));
		
		JLabel lblIplasma = new JLabel("IPLASMA");
		lblIplasma.setBounds(88, 50, 63, 14);
		frame.getContentPane().add(lblIplasma);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(236, 75, 188, 43);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				
				{operacoes.getDCI_longMehtod_PMD(), operacoes.getDII_longMehtod_PMD(), operacoes.getADCI_longMehtod_PMD(), operacoes.getADII_longMehtod_PMD()},
			},
			new String[] {
					"DCI", "DII", "ADCI", "ADII"
			}
		));
		
		JLabel lblPmd = new JLabel("PMD");
		lblPmd.setBounds(319, 50, 46, 14);
		frame.getContentPane().add(lblPmd);
		
		JLabel lblRegra = new JLabel("REGRA");
		lblRegra.setBounds(199, 162, 86, 14);
		frame.getContentPane().add(lblRegra);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(116, 187, 196, 43);
		frame.getContentPane().add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{operacoes.getDCI_Regra(), operacoes.getDII_Regra(), operacoes.getADCI_Regra(), operacoes.getADII_Regra()},
			},
			new String[] {
				"DCI", "DII", "ADCI", "ADII"
			}
		));
		frame.setVisible(true);
	}
}
