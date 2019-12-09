package ProjetoES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	int linha = 0;
	int coluna=0;
	static List<Operacoes> operacoes;

	

	public Excel() {
		this.operacoes = new ArrayList<Operacoes>();
	}
	
	
	//public List<Operacoes> readexcel() throws IOException {
	public void readexcel() throws IOException {
		FileInputStream file = new FileInputStream(new File("Long-Method.xlsx"));
		  
        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        //Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) 
        {
            Row row = rowIterator.next();
            Operacoes operacao = new Operacoes();
            //For each row, iterate through all the columns
            Iterator<Cell> cellIterator = row.cellIterator();
             
            while (cellIterator.hasNext()) 
            {
                Cell cell = cellIterator.next();
                
                //Check the cell type and format accordingly
                switch (cell.getCellType()) 
                {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                    	System.out.print(cell.getBooleanCellValue() + "\t");
                    	break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    
                }
            }
            System.out.println(workbook.getNumberOfSheets());
        
			
			//switch(cell.getColumnIndex()) {
			//METODOS com case
			//}
			
			
	//		operacoes.add(operacao);
        }
			workbook.close();
			file.close();
					

	//	return this.operacoes;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		Excel excel = new Excel();
		
		try {
			excel.readexcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}