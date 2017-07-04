package testwebdriver;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelfileExample {
	
	public void readExcel() throws BiffException, IOException{
		
		String filepath ="E:\\sample.xls";
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb =Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int totalnoofrows =sh.getRows();
		int totalnoofcols =sh.getColumns();
		
		for (int row=0;row<totalnoofrows;row++){
			
			for (int cols=0;cols<totalnoofcols;cols++)
				
				System.out.println(sh.getCell(cols,row).getContents() +"\t");
		}
		System.out.println();
	}
	

	public static void main(String[] args) throws BiffException, IOException {
		
		ReadExcelfileExample rd= new ReadExcelfileExample();
		rd.readExcel();
		
		}

}
