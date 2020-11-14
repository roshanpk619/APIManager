package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.smc.APIFramwork.setUp.AutoConst;

public class ExcelUtility implements AutoConst {

	public static String getStringCellValue(String path, String sheet, int row, int cell) throws FileNotFoundException {
		String cellValue = "";
		FileInputStream fis = new FileInputStream(testDataFilePath);
		try {
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);

			cellValue = c.getStringCellValue();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cellValue;
	}

}
