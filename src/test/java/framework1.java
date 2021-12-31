import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class framework1 {
	
	
public static void main(String[] args) throws IOException {
//	File file=new File("C:\\Users\\Ragul\\eclipse-workspace\\FrameWorkExcel\\excel\\Book1.xlsx");
//	FileInputStream stream = new FileInputStream(file);
//	Workbook workbook = new XSSFWorkbook(stream);
//	Sheet sheet = workbook.getSheet("sheet1");
//	Row row = sheet.getRow(0);
//	Cell cell = row.getCell(0);
//	String stringCellValue = cell.getStringCellValue();
//	
	Date date = new Date(0);
	System.out.println(date);
	
	SimpleDateFormat format = new SimpleDateFormat();
	String format2 = format.format(date);
	System.out.println(format2);
	
	
	
	
	
	
	
}
}
