package ExcelUtility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ReadExcel {

    //public  static final
    private Row row;
    private Cell cell;
    private Sheet excelWSheet;
    private Workbook excelWBook;
    private FileInputStream fis;
    private FileOutputStream fos;


    private String filepath = System.getProperty("user.dir") + "\\src\\main\\resources\\";


    public ReadExcel(String fileName, String sheetName) throws IOException {


        filepath.concat(fileName);
        File file = new File(filepath.concat(fileName));
        fis = new FileInputStream(file);
        excelWBook = new XSSFWorkbook(fis);
        excelWSheet = excelWBook.getSheet(sheetName);
        fis.close();
        excelWBook.close();

    }


    public void loadFile(String fileName, String sheetName) throws IOException {
        filepath.concat(fileName);
        File file = new File(filepath.concat(fileName));
        fis = new FileInputStream(file);
        excelWBook = new XSSFWorkbook(fis);
        excelWSheet = excelWBook.getSheet(sheetName);
        fis.close();
    }

    public String getFileName(String fileName) {

        File file = new File(filepath.concat(fileName));
        Path path = Paths.get(String.valueOf(file));
        Path fileName1 = path.getFileName();
        System.out.println("File Name is " + fileName1.toString());

        return fileName1.toString();
    }


    private Map<String, Map<String, Object>> getDataToRead() throws IOException {



        Map<String, Map<String, Object>> superMap = new HashMap<>();
        Map<String, Object> myMap = new HashMap<>();

        //Get key (Heading)
        for (int i = 1; i < excelWSheet.getLastRowNum()+1; i++) {
        
            row = excelWSheet.getRow(i);
            String keyCell = row.getCell(0).getStringCellValue(); //get first row (Heading) every time from rhw sheet


            //Get values
            int collNum = row.getLastCellNum(); //Get column number
            for (int j = 1; j < collNum; j++) {
                String value = row.getCell(j).getStringCellValue(); //Get values
                myMap.put(keyCell, value);
                break;
            }
            superMap.put("ReadData", myMap);
        }
        return superMap;
    }

    public String readValues(String key) throws IOException {

        Map<String, Object> myVal = getDataToRead().get("ReadData");
        Object val = myVal.get(key);
        return (String) val;

    }
}
