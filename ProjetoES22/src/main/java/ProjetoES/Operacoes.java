package ProjetoES;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Operacoes {

	private  int DCI_longMehtod_plasma; //true true
	private  int DII_longMehtod_plasma; //true false 
	private  int ADCI_longMehtod_plasma; //false false
	private  int ADII_longMehtod_plasma;

	private  int DCI_longMehtod_PMD; //true true
	private  int DII_longMehtod_PMD; //true false 
	private  int ADCI_longMehtod_PMD; //false false
	private  int ADII_longMehtod_PMD;

	private  int DCI_Regra; //true true
	private  int DII_Regra; //true false 
	private  int ADCI_Regra; //false false
	private  int ADII_Regra;

	public  void comparador_longMehtod_plasma(File excel) {
		try { 
			FileInputStream excelFIS = new FileInputStream(excel);
			BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
			XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
			XSSFSheet excelSheet = excelJTable.getSheetAt(0);		
			Boolean[] vetor1 = new Boolean[excelSheet.getLastRowNum()];
			Boolean[] vetor2 = new Boolean[excelSheet.getLastRowNum()];
			//false true       plasma,long
			DCI_longMehtod_plasma=0;
			DII_longMehtod_plasma=0;
			ADCI_longMehtod_plasma=0;
			ADII_longMehtod_plasma=0;

			//Perguntar PMD ou iPlasma
			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor2.length; linha++,a++) {
				//plasma
				XSSFRow linhaExcel = excelSheet.getRow(linha);
				vetor2[a] = linhaExcel.getCell(9).getBooleanCellValue();
			}		
			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor1.length; linha++,a++) {
				//long_method
				XSSFRow linhaExcel = excelSheet.getRow(linha);
				vetor1[a] = linhaExcel.getCell(8).getBooleanCellValue();
			}

			for(int i=0;i!=vetor1.length;i++) {
				if(vetor1[i]==true && vetor2[i]==true ) {
					DCI_longMehtod_plasma++;
				}
				else if(vetor2[i]==true && vetor1[i]==false) {
					DII_longMehtod_plasma++;
				}
				else if(vetor1[i]==false && vetor2[i]==false) {
					ADCI_longMehtod_plasma++;
				}
				else if(vetor2[i]==false && vetor1[i]==true) {
					ADII_longMehtod_plasma++;
				}

				//System.out.println("DCI:"+DCI);
				//System.out.println("DII:"+DII);
				//tem.out.println("ADCI"+ADCI);
				//				System.out.println("ADII"+ADII);


			}
			System.out.println(DCI_longMehtod_plasma);
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public  void comparador_longMehtod_PMD(File excel) {
		try { 
			FileInputStream excelFIS = new FileInputStream(excel);
			BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
			XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
			XSSFSheet excelSheet = excelJTable.getSheetAt(0);		
			Boolean[] vetor1 = new Boolean[excelSheet.getLastRowNum()];
			Boolean[] vetor2 = new Boolean[excelSheet.getLastRowNum()];
			DCI_longMehtod_PMD=0;//true true
			DII_longMehtod_PMD=0;//true false 
			ADCI_longMehtod_PMD=0;//false false
			ADII_longMehtod_PMD=0;     


			//Perguntar PMD ou iPlasma
			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor1.length; linha++,a++) {
				//long_method
				XSSFRow linhaExcel = excelSheet.getRow(linha);
				vetor1[a] = linhaExcel.getCell(8).getBooleanCellValue();
			}

			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor2.length; linha++,a++) {
				//PMD
				XSSFRow linhaExcel = excelSheet.getRow(linha);
				vetor2[a] = linhaExcel.getCell(10).getBooleanCellValue();
			}		

			for(int i=0;i!=vetor1.length;i++) {
				if(vetor1[i]==true && vetor2[i]==true) {
					DCI_longMehtod_PMD++;
				}
				else if(vetor2[i]==true && vetor1[i]==false) {
					DII_longMehtod_PMD++;
				}
				else if(vetor1[i]==false && vetor2[i]==false ) {
					ADCI_longMehtod_PMD++;
				}
				else if(vetor2[i]==false && vetor1[i]==true) {
					ADII_longMehtod_PMD++;
				}

				//				System.out.println("DCI:"+DCI);
				//				System.out.println("DII:"+DII);
				//				System.out.println("ADCI"+ADCI);
				//				System.out.println("ADII"+ADII);


			}
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void  comparador_Regra(File excel, Boolean[] vetorBoolean, Regra r) {
		try { 

			FileInputStream excelFIS = new FileInputStream(excel);
			BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
			XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
			XSSFSheet excelSheet = excelJTable.getSheetAt(0);		
			Boolean[] vetor1 = new Boolean[excelSheet.getLastRowNum()];
			Boolean[] vetor2 = new Boolean[excelSheet.getLastRowNum()];
			DCI_Regra=0;//true true
			DII_Regra=0;//true false 
			ADCI_Regra=0;//false false
			ADII_Regra=0;

			if((r.getMetricaCima()==Metrica.LOC || r.getMetricaCima()==Metrica.CYCLO) && (r.getMetricaBaixo()==Metrica.LOC || r.getMetricaBaixo()==Metrica.CYCLO)) {

				for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor1.length; linha++,a++) {
					//long_Mehtod
					XSSFRow linhaExcel = excelSheet.getRow(linha);
					vetor1[a] = linhaExcel.getCell(8).getBooleanCellValue();
				}
			}else {
				for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor1.length; linha++,a++) {
					//feature envy
					XSSFRow linhaExcel = excelSheet.getRow(linha);
					vetor1[a] = linhaExcel.getCell(11).getBooleanCellValue();
				}
			}
			for(int i=0;i!=vetor1.length;i++) {
				if(vetor1[i]==true && vetorBoolean[i]==true ) {
					DCI_Regra++;
				}
				else if(vetorBoolean[i]==true && vetor1[i]==false) {
					DII_Regra++;
				}
				else if(vetor1[i]==false && vetorBoolean[i]==false) {
					ADCI_Regra++;
				}
				else if(vetorBoolean[i]==false && vetor1[i]==true) {
					ADII_Regra++;
				}

				//			System.out.println("DCI:"+DCI);
				//			System.out.println("DII:"+DII);
				//			System.out.println("ADCI"+ADCI);
				//			System.out.println("ADII"+ADII);


			}
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public int getDCI_longMehtod_plasma() {
		return DCI_longMehtod_plasma;
	}

	public void setDCI_longMehtod_plasma(int dCI_longMehtod_plasma) {
		DCI_longMehtod_plasma = dCI_longMehtod_plasma;
	}

	public int getDII_longMehtod_plasma() {
		return DII_longMehtod_plasma;
	}

	public void setDII_longMehtod_plasma(int dII_longMehtod_plasma) {
		DII_longMehtod_plasma = dII_longMehtod_plasma;
	}

	public int getADCI_longMehtod_plasma() {
		return ADCI_longMehtod_plasma;
	}

	public void setADCI_longMehtod_plasma(int aDCI_longMehtod_plasma) {
		ADCI_longMehtod_plasma = aDCI_longMehtod_plasma;
	}

	public int getADII_longMehtod_plasma() {
		return ADII_longMehtod_plasma;
	}

	public void setADII_longMehtod_plasma(int aDII_longMehtod_plasma) {
		ADII_longMehtod_plasma = aDII_longMehtod_plasma;
	}

	public int getDCI_longMehtod_PMD() {
		return DCI_longMehtod_PMD;
	}

	public void setDCI_longMehtod_PMD(int dCI_longMehtod_PMD) {
		DCI_longMehtod_PMD = dCI_longMehtod_PMD;
	}

	public int getDII_longMehtod_PMD() {
		return DII_longMehtod_PMD;
	}

	public void setDII_longMehtod_PMD(int dII_longMehtod_PMD) {
		DII_longMehtod_PMD = dII_longMehtod_PMD;
	}

	public int getADCI_longMehtod_PMD() {
		return ADCI_longMehtod_PMD;
	}

	public void setADCI_longMehtod_PMD(int aDCI_longMehtod_PMD) {
		ADCI_longMehtod_PMD = aDCI_longMehtod_PMD;
	}

	public int getADII_longMehtod_PMD() {
		return ADII_longMehtod_PMD;
	}

	public void setADII_longMehtod_PMD(int aDII_longMehtod_PMD) {
		ADII_longMehtod_PMD = aDII_longMehtod_PMD;
	}

	public int getDCI_Regra() {
		return DCI_Regra;
	}

	public void setDCI_Regra(int dCI_Regra) {
		DCI_Regra = dCI_Regra;
	}

	public int getDII_Regra() {
		return DII_Regra;
	}

	public void setDII_Regra(int dII_Regra) {
		DII_Regra = dII_Regra;
	}

	public int getADCI_Regra() {
		return ADCI_Regra;
	}

	public void setADCI_Regra(int aDCI_Regra) {
		ADCI_Regra = aDCI_Regra;
	}

	public int getADII_Regra() {
		return ADII_Regra;
	}

	public void setADII_Regra(int aDII_Regra) {
		ADII_Regra = aDII_Regra;
	}
}