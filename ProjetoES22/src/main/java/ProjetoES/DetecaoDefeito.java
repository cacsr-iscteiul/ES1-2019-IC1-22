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
	private Double[] vetorExcel2;
	Boolean[] vetorBooleanCima;
	Boolean[] vetorBooleanBaixo;
	Boolean[] vetorBooleanJunto;
	int[] vetorFinal;
	int contador=0;
	//boolean[] e regra
	public void  detetarDefeito(Regra regra, File excel) {
		try { 
			FileInputStream excelFIS = new FileInputStream(excel);
			BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);
			XSSFWorkbook excelJTable = new XSSFWorkbook(excelBIS);
			XSSFSheet excelSheet = excelJTable.getSheetAt(0);

			vetorExcel = new Double[excelSheet.getLastRowNum()];
			vetorExcel2 = new Double[excelSheet.getLastRowNum()];
			vetorBooleanCima = new Boolean[excelSheet.getLastRowNum()];
			vetorBooleanBaixo = new Boolean[excelSheet.getLastRowNum()];
			vetorBooleanJunto = new Boolean[excelSheet.getLastRowNum()];


			for(int linha=1,a=0; linha <= excelSheet.getLastRowNum() && a!=vetorExcel.length; linha++,a++) {
				XSSFRow linhaExcel = excelSheet.getRow(linha);


				//LOC

				if( regra.getMetricaCima() == Metrica.LOC) {
					vetorExcel[a] = linhaExcel.getCell(4).getNumericCellValue();
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("LOC DE CIMA:" +vetorExcel[a]+ " " +vetorBooleanCima[a]);

					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("LOC DE CIMA:" +vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("LOC DE CIMA:" +vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
				}


				//CYCLO
				if( regra.getMetricaCima() == Metrica.CYCLO ) {
					vetorExcel[a] = linhaExcel.getCell(5).getNumericCellValue();
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("CYCLO DE CIMA"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("CYCLO DE CIMA"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("CYCLO DE CIMA"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
				}


				//ATFD
				if( regra.getMetricaCima() == Metrica.ATFD ) {
					vetorExcel[a] = linhaExcel.getCell(6).getNumericCellValue();
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("ATFD DE CIMA:"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("ATFD DE CIMA:"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("ATFD DE CIMA:"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
				}


				//LAA
				if( regra.getMetricaCima() == Metrica.LAA ) {
					vetorExcel[a] = linhaExcel.getCell(7).getNumericCellValue();
					if(regra.getComparadorCima() == Comparador.MAIOR){
						if(vetorExcel[a] > regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("LAA DE CIMA:"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.MENOR){
						if(vetorExcel[a] < regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("LAA DE CIMA:"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
					if(regra.getComparadorCima() == Comparador.IGUAL){
						if(vetorExcel[a] == regra.getValorCima()) {
							vetorBooleanCima[a] = true;
						}else {
							vetorBooleanCima[a] = false;
						}
						//System.out.println("LAA DE CIMA:"+vetorExcel[a]+ " " +vetorBooleanCima[a]);
					}
				}

				//BAIXO
				//LOC baixo

				if( regra.getMetricaBaixo() == Metrica.LOC) {
					vetorExcel2[a] = linhaExcel.getCell(4).getNumericCellValue();
					if(regra.getComparadorBaixo() == Comparador.MAIOR){
						if(vetorExcel2[a] > regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("LOC DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);

					}
					if(regra.getComparadorBaixo() == Comparador.MENOR){
						if(vetorExcel2[a] < regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
					//	System.out.println("LOC DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.IGUAL){
						if(vetorExcel2[a] == regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("LOC DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
				}


				//CYCLO baixo
				if( regra.getMetricaBaixo() == Metrica.CYCLO ) {
					vetorExcel2[a] = linhaExcel.getCell(5).getNumericCellValue();
					if(regra.getComparadorBaixo() == Comparador.MAIOR){
						if(vetorExcel2[a] > regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("CYCLO DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.MENOR){
						if(vetorExcel2[a] < regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("CYCLO DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.IGUAL){
						if(vetorExcel2[a] == regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("CYCLO DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
				}


				//ATFD baixo
				if( regra.getMetricaBaixo() == Metrica.ATFD ) {
					vetorExcel2[a] = linhaExcel.getCell(6).getNumericCellValue();
					if(regra.getComparadorBaixo() == Comparador.MAIOR){
						if(vetorExcel2[a] > regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("ATFD DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.MENOR){
						if(vetorExcel2[a] < regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("ATFD DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.IGUAL){
						if(vetorExcel2[a] == regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("ATFD DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
				}


				//LAA baixo
				if( regra.getMetricaBaixo() == Metrica.LAA ) {
					vetorExcel2[a] = linhaExcel.getCell(7).getNumericCellValue();
					if(regra.getComparadorBaixo() == Comparador.MAIOR){
						if(vetorExcel2[a] > regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("LAA DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.MENOR){
						if(vetorExcel2[a] < regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("LAA DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
					if(regra.getComparadorBaixo() == Comparador.IGUAL){
						if(vetorExcel2[a] == regra.getValorBaixo()) {
							vetorBooleanBaixo[a] = true;
						}else {
							vetorBooleanBaixo[a] = false;
						}
						//System.out.println("LAA DE BAIXO:"+vetorExcel2[a]+ " " +vetorBooleanBaixo[a]);
					}
				}

			}			
			for(int i=0;i!=vetorBooleanBaixo.length;i++) {
				if(regra.getAndOr()==AndOr.AND) {
					if(vetorBooleanCima[i]==true && vetorBooleanBaixo[i]==true) {
						vetorBooleanJunto[i]=true;
						contador++;
					}else {
						vetorBooleanJunto[i]=false;
					}
				}else {
					if(vetorBooleanCima[i]==true || vetorBooleanBaixo[i]==true) {
						vetorBooleanJunto[i]=true;
						contador++;
					}else{
						vetorBooleanJunto[i]=false;
					}
				}
			//	System.out.println(":"+vetorBooleanJunto[i]);
			}

			vetorFinal = new int[contador];
			
			
			for(int i=0,j=0;i!=vetorBooleanJunto.length && j!=vetorFinal.length;i++) {
					if(vetorBooleanJunto[i]==true) {
						vetorFinal[j]=i+1;
						//System.out.println(vetorFinal[j]);
						j++;
					}
				}
		//	}

		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public Boolean[] getVetorBooleanJunto() {
		return vetorBooleanJunto;
	}
	public int[] getVetorFinal() {
		return vetorFinal;
	}

}

