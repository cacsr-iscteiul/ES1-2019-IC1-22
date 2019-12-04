package ProjetoES;

import java.awt.Font;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 * Hello world!
 *
 */
public class App {
    

	
	public static void main(String[] args) {
    	
  File excel = new File("Long-Method");
  Workbook worb = new XSSFWorkbook(excel);
  XSSFSheet sheet = worb.getSheetAt(0);
  
  Iterator<Row> rowi = sheet.iterator();
  
  while(row.hasNext()) {
	  Row row = rowi.next()
			  Iterator<Cell> celli = row.cellIterator()
			  
			  while(celli.hasNext()) {
				  Cell cell = celli.next();
				  System.out.println(cell.toString() + ";");
						  
			  }
	  System.out.println();
  }
		
		worb.close();
		excel.close();
		
	}
}
