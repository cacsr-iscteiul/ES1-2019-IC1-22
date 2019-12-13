package ProjetoES;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

//	public Operacoes (int DCI_longMehtod_plasma, int DII_longMehtod_plasma, int ADCI_longMehtod_plasma, int ADII_longMehtod_plasma) {
//		this.ADCI_longMehtod_plasma = DCI_longMehtod_plasma;
//		this.ADII_longMehtod_plasma = DII_longMehtod_plasma;
//		this.ADCI_longMehtod_plasma = ADCI_longMehtod_plasma;
//		this.ADII_longMehtod_plasma = ADII_longMehtod_plasma;
//		
//	}
	
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
					//System.out.println(DCI_longMehtod_plasma);
				}
				else if(vetor2[i]==true && vetor1[i]==false) {
					DII_longMehtod_plasma++;
					//System.out.println(DII_longMehtod_plasma);
				}
				else if(vetor1[i]==false &&
						vetor2[i]==false) {
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

	
	/**Devolve o valor do DCI. 
	*@return O valor da coluna correspondente à coluna plasma 
	*	TRUE e o valor correspondente ao is_long_Method TRUE.
	*/

	public int getDCI_longMehtod_plasma() {
		return DCI_longMehtod_plasma;
	}
	
	/**Altera o valor do DCI do dCI_longMethod_plasma.
	*param dCI_longMethod_plasma O valor do DCI.
	*/

	public void setDCI_longMehtod_plasma(int dCI_longMehtod_plasma) {
		DCI_longMehtod_plasma = dCI_longMehtod_plasma;
	}

	/**Devolve o valor do DII.
	*@return O valor da coluna correspondente à coluna plasma 
	*	TRUE e o valor correspondente ao is_long_Method FALSE.
	*/

	public int getDII_longMehtod_plasma() {
		return DII_longMehtod_plasma;
	}

	/**Altera o valor do DII do dII_longMehtod_plasma.
	*param dII_longMehtod_plasma O valor do DII.
	*/

	public void setDII_longMehtod_plasma(int dII_longMehtod_plasma) {
		DII_longMehtod_plasma = dII_longMehtod_plasma;
	}

	/**Devolve o valor do ADCI.
	*@return O valor da coluna correspondente à coluna plasma 
	*	 FALSE e o valor correspondente ao is_long_Method FALSE.
	*/

	public int getADCI_longMehtod_plasma() {
		return ADCI_longMehtod_plasma;
	}

	/**Altera o valor do ADCI do aDCI_longMehtod_plasma.
	*param aDCI_longMehtod_plasma O valor do ADCI.
	*/

	public void setADCI_longMehtod_plasma(int aDCI_longMehtod_plasma) {
		ADCI_longMehtod_plasma = aDCI_longMehtod_plasma;
	}

	/**Devolve o valor do ADII.
	*@return O valor da coluna correspondente à coluna plasma 
	*	 FALSE e o valor correspondente ao is_long_Method TRUE.
	*/

	public int getADII_longMehtod_plasma() {
		return ADII_longMehtod_plasma;
	}

	/**Altera o valor do ADII do aDII_longMehtod_plasma.
	*param aDII_longMehtod_plasma O valor do ADII.
	*/

	public void setADII_longMehtod_plasma(int aDII_longMehtod_plasma) {
		ADII_longMehtod_plasma = aDII_longMehtod_plasma;
	}

	/**Devolve o valor do DCI.
	*@return O valor da coluna correspondente à coluna PMI 
	*	 TRUE e o valor correspondente ao is_long_Method TRUE.
	*/

	public int getDCI_longMehtod_PMD() {
		return DCI_longMehtod_PMD;
	}

	/**Altera o valor do DCI do dCI_longMehtod_PMD.
	*param dCI_longMehtod_PMD O valor do DCI.
	*/

	public void setDCI_longMehtod_PMD(int dCI_longMehtod_PMD) {
		DCI_longMehtod_PMD = dCI_longMehtod_PMD;
	}

	/**Devolve o valor do DII.
	*@return O valor da coluna correspondente à coluna PMI 
	*	 TRUE e o valor correspondente ao is_long_Method FALSE.
	*/

	public int getDII_longMehtod_PMD() {
		return DII_longMehtod_PMD;
	}

	/**Altera o valor do DII do dII_longMehtod_PMD.
	*param dII_longMehtod_PMD O valor do DII.
	*/

	public void setDII_longMehtod_PMD(int dII_longMehtod_PMD) {
		DII_longMehtod_PMD = dII_longMehtod_PMD;
	}

	/**Devolve o valor do ADCI.
	*@return O valor da coluna correspondente à coluna PMI 
	*	 FALSE e o valor correspondente ao is_long_Method FALSE.
	*/

	public int getADCI_longMehtod_PMD() {
		return ADCI_longMehtod_PMD;
	}

	/**Altera o valor do ADCI do aDCI_longMehtod_PMD.
	*param aDCI_longMehtod_PMD O valor do ADCI.
	*/

	public void setADCI_longMehtod_PMD(int aDCI_longMehtod_PMD) {
		ADCI_longMehtod_PMD = aDCI_longMehtod_PMD;
	}

	/**Devolve o valor do ADII.
	*@return O valor da coluna correspondente à coluna PMI. 
	*	 FALSE e o valor correspondente ao is_long_Method TRUE.
	*/

	public int getADII_longMehtod_PMD() {
		return ADII_longMehtod_PMD;
	}

	/**Altera o valor do ADII do aDII_longMehtod_PMD.
	*param aDII_longMehtod_PMD O valor do ADII.
	*/

	public void setADII_longMehtod_PMD(int aDII_longMehtod_PMD) {
		ADII_longMehtod_PMD = aDII_longMehtod_PMD;
	}

	/**Devolve o DCI com a regra definida.
	*return O valor do DCI.
	*/

	public int getDCI_Regra() {
		return DCI_Regra;
	}

	/**Altera o DCI com a regra definida.
	*param dCI_Regra O valor do DCI.
	*/

	public void setDCI_Regra(int dCI_Regra) {
		DCI_Regra = dCI_Regra;
	}

	/**Devolve o DII com a regra definida.
	*return O valor do DII.
	*/

	public int getDII_Regra() {
		return DII_Regra;
	}

	/**Altera o DII com a regra definida.
	*param dII_Regra O valor do DII.
	*/

	public void setDII_Regra(int dII_Regra) {
		DII_Regra = dII_Regra;
	}

	/**Devolve o ADCI com a regra definida.
	*return O valor do ADCI.
	*/
	
	public int getADCI_Regra() {
		return ADCI_Regra;
	}

	/**Altera o ADCI com a regra definida.
	*param aDCI_Regra O valor do ADCI.
	*/

	public void setADCI_Regra(int aDCI_Regra) {
		ADCI_Regra = aDCI_Regra;
	}
	
	/**Devolve o ADII com a regra definida.
	*return O valor do ADII.
	*/

	public int getADII_Regra() {
		return ADII_Regra;
	}

	/**Altera o ADII com a regra definida.
	*param aDII_Regra O valor do ADII.
	*/

	public void setADII_Regra(int aDII_Regra) {
		ADII_Regra = aDII_Regra;
	}
}

