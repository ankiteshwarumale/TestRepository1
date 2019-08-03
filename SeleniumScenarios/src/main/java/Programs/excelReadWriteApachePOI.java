//https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-4.1.0-20190412.zip
//First link of this website for Apache POI

package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReadWriteApachePOI {

	public static void main(String[] args) throws Exception {
		File src = new File("src\\main\\java\\Excel\\UserCredentialsExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		String stringCellValue = sheetAt.getRow(0).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);
		
		String stringCellValue2 = sheetAt.getRow(0).getCell(1).getStringCellValue();
		System.out.println(stringCellValue2);
		
		int firstRowNum = sheetAt.getFirstRowNum();
		
		int lastRowNum = sheetAt.getLastRowNum();
		
		short firstCellNum = sheetAt.getRow(firstRowNum).getFirstCellNum();
		
		short lastCellNum = sheetAt.getRow(firstRowNum).getLastCellNum();
		//GET Column heading no
		int passwordColNo = 0;
		for(int i=firstCellNum; i<lastCellNum; i++) {
			if(sheetAt.getRow(firstRowNum).getCell(i).getStringCellValue().equals("Password")) {
				passwordColNo = i;
				break;
			}
		}
		
		int userNameColNo = 0;
		for(int i=firstCellNum; i<lastCellNum; i++) {
			if(sheetAt.getRow(firstRowNum).getCell(i).getStringCellValue().equals("UserName")) {
				userNameColNo = i;
				break;
			}
		}
		
		for(int i=firstRowNum+1; i<=lastRowNum; i++) {
			
				if(sheetAt.getRow(i).getCell(userNameColNo).getStringCellValue().equals("UserName10")) {
					System.out.println(sheetAt.getRow(i).getCell(userNameColNo).getStringCellValue());
					System.out.println(sheetAt.getRow(i).getCell(passwordColNo).getStringCellValue());
					break;
				}
			
			
		}
		/*
		XSSFCell cell = sheetAt.getRow(1).getCell(1);
		CellType cellType = cell.getCellType();
		if(cell.getCellType()==Cell.CELL_TYPE_STRING) {
			
		}*/
	}

}
