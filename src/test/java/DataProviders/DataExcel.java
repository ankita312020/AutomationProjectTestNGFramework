package DataProviders;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import utility.baseOne;

public class DataExcel extends baseOne{
	@DataProvider (name="UserCreation")
	public static Object[][] registerData() throws InvalidFormatException, IOException   {
		System.out.println("registerData method");
	    sheet = wb.getSheetAt(0);
	    int rowCount = sheet.getPhysicalNumberOfRows();
	    int columnCount= sheet.getRow(0).getPhysicalNumberOfCells();
	    System.out.println(rowCount + "========="+ columnCount);
	    String input[][]=new String[rowCount-1][columnCount];
	    for(int i = 1; i < rowCount; i++) {
	        row = sheet.getRow(i);
	            for(int j = 0; j < columnCount; j++) {
	                cell = row.getCell(j);
	                if(cell != null) {
	                	input[i-1][j] = cell.getStringCellValue();
	                }
	            }
	    }
		System.out.println("getting out from Data Provider registerData");
		return input;
	}
}
