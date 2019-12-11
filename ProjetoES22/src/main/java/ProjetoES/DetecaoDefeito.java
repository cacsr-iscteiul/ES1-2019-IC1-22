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

public class DetecaoDefeito {
	private Double[] vetorExcel;
	Boolean[] vetorBoolean;
	//boolean[] e regra
	public void  detetarDefeito(Regra regra, File excel) {
		try { 
			FileInputStream excelFIS = new FileInputStream(excel);
			BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
			XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
			XSSFSheet excelSheet = excelJTable.getSheetAt(0);
			
		 vetorExcel = new Double[excelSheet.getLastRowNum()];
		vetorBoolean = new Boolean[excelSheet.getLastRowNum()];
			
			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetorExcel.length; linha++,a++) {
				XSSFRow linhaExcel = excelSheet.getRow(linha);
				vetorExcel[a] = linhaExcel.getCell(4).getNumericCellValue();
				
				//LOC
			 
				if( regra.getMetricaCima() == Metrica.LOC) {
				if(regra.getComparadorCima() == Comparador.MAIOR){
					if(vetorExcel[a] > regra.getValorCima()) {
						vetorBoolean[a] = true;
					}else {
						vetorBoolean[a] = false;
					}
					System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					
				}
				if(regra.getComparadorCima() == Comparador.MENOR){
					if(vetorExcel[a] < regra.getValorCima()) {
						vetorBoolean[a] = true;
					}else {
						vetorBoolean[a] = false;
					}
					System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
				}
				if(regra.getComparadorCima() == Comparador.IGUAL){
					if(vetorExcel[a] == regra.getValorCima()) {
						vetorBoolean[a] = true;
					}else {
						vetorBoolean[a] = false;
					}
					System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
				}
				}
				
				
				//CYCLO
				if( regra.getMetricaCima() == Metrica.CYCLO ) {
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					}
				
				
				//ATFD
				if( regra.getMetricaCima() == Metrica.ATFD ) {
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					}
				
				
				//LAA
				if( regra.getMetricaCima() == Metrica.LAA ) {
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBoolean[a] = true;
						}else {
							vetorBoolean[a] = false;
						}
						System.out.println(vetorExcel[a]+ " " +vetorBoolean[a]);
					}
					}
			}			
			

		//	if(regra.getMetricaCima()==Metrica.LOC) {
				//ler columa 9
			
			//}
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
}

