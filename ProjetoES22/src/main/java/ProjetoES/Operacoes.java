package ProjetoES;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Operacoes {


	public static void comparador_longMehtod_plasma(File excel) {
		try { 
			FileInputStream excelFIS = new FileInputStream(excel);
			BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
			XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
			XSSFSheet excelSheet = excelJTable.getSheetAt(0);		
			Boolean[] vetor1 = new Boolean[excelSheet.getLastRowNum()];
			Boolean[] vetor2 = new Boolean[excelSheet.getLastRowNum()];
			Boolean[] vetor3 = new Boolean[excelSheet.getLastRowNum()];
			int DCI=0;//true true
			int DII=0;//true false
			int ADCI=0;//false false
			int ADII=0;//false true       plasma,long
			
			
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
			
			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetor3.length; linha++,a++) {
				//PMD
				XSSFRow linhaExcel = excelSheet.getRow(linha);
				vetor3[a] = linhaExcel.getCell(10).getBooleanCellValue();
			}		

			for(int i=0;i!=vetor1.length;i++) {
				if(vetor1[i]==true && (vetor2[i]==true || vetor3[i]==true)) {
					DCI++;
				}
				else if(vetor1[i]==true && (vetor2[i]==false || vetor3[i]==false)) {
					DII++;
				}
				else if(vetor1[i]==false && (vetor2[i]==false || vetor3[i]==false)) {
					ADCI++;
				}
				else if(vetor1[i]==false && (vetor2[i]==true || vetor3[i]==true)) {
					ADII++;
				}




			}
			System.out.println("DCI:"+DCI);
			System.out.println("DII:"+DII);
			System.out.println("ADCI"+ADCI);
			System.out.println("ADII"+ADII);
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
