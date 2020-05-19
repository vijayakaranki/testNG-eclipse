package testNGParameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Navaza\\Desktop\\excelFile.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet0=wb.getSheetAt(0);
		for(int rows=0;rows<=10;rows++) {
			Row row=sheet0.getRow(rows);
			//System.out.println(row);
			for(int cols=0;cols<=10;cols++) {
				Cell col=row.getCell(cols);
				System.out.print(col+"\t");
			}
			System.out.println();
		}
		
	}

}
