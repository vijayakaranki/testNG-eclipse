package testNGParameterization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet0=wb.createSheet("first_Sheet");
		for(int row=0;row<=10;row++) {
			Row rows=sheet0.createRow(row);
			for(int cols=0;cols<=20;cols++) {
				Cell col=rows.createCell(cols);
				col.setCellValue((int)(Math.random()*100));
			}
		}
		
		File f=new File("C:\\Users\\Navaza\\Desktop\\excelFile.xlsx");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		
	}
}

