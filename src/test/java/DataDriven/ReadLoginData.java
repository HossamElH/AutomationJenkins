package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadLoginData {
    public Object [][]sheet() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\habdelnaby\\Desktop\\New folder\\DD.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int numOfRows = sheet.getPhysicalNumberOfRows();
        int numOfCol = sheet.getRow(0).getLastCellNum();
        String [][]data = new String[numOfRows-1][numOfCol];
        for(int i=1 ; i < numOfRows ; i++)
        {
            for(int j = 0 ; j < numOfCol; j++)
            {		XSSFRow r = sheet.getRow(i);
                data[i-1][j] = r.getCell(j).getStringCellValue();
            }
        }
        return data;

    }

}
