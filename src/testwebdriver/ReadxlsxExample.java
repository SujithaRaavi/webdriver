package testwebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadxlsxExample {
	
	public void readxlsxfile() throws IOException{
		FileInputStream fis1 = null;
		XSSFWorkbook workbook = null;
				
		String filepath ="E:\\sample1.xls";
		try{
			fis1 =new FileInputStream(filepath);
			workbook = new XSSFWorkbook(fis1);
			
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
			
			
		}catch (IOException e){
			
			e.printStackTrace();
		}
		
		
		XSSFSheet sheet = (XSSFSheet) workbook.getSheet("Sheet1");
		XSSFRow row;
		XSSFCell cell;
		
		//Iterating all the rows in the sheet
				java.util.Iterator<Row> rows = sheet.rowIterator();

				while (rows.hasNext()) {
					row = (XSSFRow) rows.next();
					
					//Iterating all the cells of the current row
					java.util.Iterator<Cell> cells = row.cellIterator();

					while (cells.hasNext()) {
						cell = (XSSFCell) cells.next();

						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							System.out.print(cell.getStringCellValue() + " ");
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							System.out.print(cell.getNumericCellValue() + " ");
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							System.out.print(cell.getBooleanCellValue() + " ");

						} else { // //Here if require, we can also add below methods to
									// read the cell content
									// XSSFCell.CELL_TYPE_BLANK
									// XSSFCell.CELL_TYPE_FORMULA
									// XSSFCell.CELL_TYPE_ERROR
						}
					}
					System.out.println();
					try {
						
						fis1.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		
		
	}

	public static void main(String[] args) throws IOException {
		
		ReadxlsxExample xlsx =new ReadxlsxExample();
		xlsx.readxlsxfile();
		}

}
