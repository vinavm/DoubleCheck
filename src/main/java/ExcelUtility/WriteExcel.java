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

public class WriteExcel {

    private Row row;
    private Cell cell;
    private Sheet excelWSheet;
    private Workbook excelWBook;
    private FileInputStream fis;
    private FileOutputStream fos;

    private String filepath=System.getProperty("user.dir")+"\\src\\main\\resources\\";
    private String fileName= "WriteData.xlsx";
    private String headerAccountManager="Account Manager Email";
    private String headerSiEmailAddress="SI EmailAddress";
    private String headerCompany="Company Name";
    private String headerSITempPass="Temp Password";
    private String headerSWProductName= "Software Product Name";
    private String headerHWProductName="Hardware Product Name";
    private String headerSWProductCode="Software Product Code";
    private String headerHWProductCode="Hardware Product Code";
    private String headerEnvironmentName="Environment Name";

    public String getHeaderEnvironmentName() {
        return headerEnvironmentName;
    }

    public String getHeaderSWProductName() {
        return headerSWProductName;
    }

    public String getHeaderHWProductName() {
        return headerHWProductName;
    }

    public String getHeaderSWProductCode() {
        return headerSWProductCode;
    }

    public String getHeaderHWProductCode() {
        return headerHWProductCode;
    }

    public String getHeaderAccountManager() {
        return headerAccountManager;
    }

    public String getHeaderSiEmailAddress() {
        return headerSiEmailAddress;
    }

    public String getHeaderCompany() {
        return headerCompany;
    }

    public String getHeaderSITempPass() {
        return headerSITempPass;
    }

    public WriteExcel() throws IOException {

    }

    public String getFileName() {
        return fileName;
    }


    public void writeData(String header, String value, int sheetNo) throws IOException {

        // Create Workbook instance holding reference to .xlsx file

        File file = new File(filepath.concat(fileName));
        fis= new FileInputStream(file);
        excelWBook=new XSSFWorkbook(fis);
        excelWSheet=excelWBook.getSheetAt(sheetNo);
        //excelWSheet=excelWBook.getSheet("Static Data");
        fis.close();


        int num = excelWSheet.getLastRowNum();
        Row row=excelWSheet.createRow(++num);
        row.createCell(0).setCellValue(header);
        row.createCell(1).setCellValue(value);
        if(num%8==0) {
            excelWSheet.createRow(++num);
        }
        try {
            // this Writes the workbook gfgcontribute
            fos = new FileOutputStream(new File(filepath.concat(fileName)));
            excelWBook.write(fos);
            fos.close();
            System.out.println(value+" has been successfully written in "+fileName);


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    public  String  getLastRowVal() throws IOException {
        String val = null;
        try{
            fis = new FileInputStream(new File(filepath.concat(fileName)));
            excelWBook = new XSSFWorkbook(fis);
            excelWSheet=excelWBook.getSheetAt(0);
            int rowcount = excelWSheet.getLastRowNum();
            System.out.println(rowcount);
            //System.out.println(excelWSheet.getRow(rowcount).getCell(1).getStringCellValue());
            val=excelWSheet.getRow(rowcount).getCell(1).getStringCellValue();
        }catch (Exception e){
            System.out.println("Sheet is Empty");
        }
        return val;
    }

    public  String  getSIEmail() throws IOException {
        String val = null;
        try{
            fis = new FileInputStream(new File(filepath.concat(fileName)));
            excelWBook = new XSSFWorkbook(fis);
            excelWSheet=excelWBook.getSheetAt(0);
            int rowcount = excelWSheet.getLastRowNum();
            System.out.println(rowcount);
            //System.out.println(excelWSheet.getRow(rowcount).getCell(1).getStringCellValue());
            val=excelWSheet.getRow(rowcount-1).getCell(1).getStringCellValue();
        }catch (Exception e){
            System.out.println("Sheet is Empty");
        }
        return val;
    }

    public  String  searchSIToApprove() throws IOException {
        String val = null;
        try{
            fis = new FileInputStream(new File(filepath.concat(fileName)));
            excelWBook = new XSSFWorkbook(fis);
            excelWSheet=excelWBook.getSheetAt(0);
            int rowcount = excelWSheet.getLastRowNum();
            System.out.println(rowcount);
            //System.out.println(excelWSheet.getRow(rowcount).getCell(1).getStringCellValue());
            val=excelWSheet.getRow(rowcount-2).getCell(1).getStringCellValue();
        }catch (Exception e){
            System.out.println("Sheet is Empty");
        }
        return val;
    }

    public  String  getTempPass() throws IOException {
        String val = null;
        try{
            fis = new FileInputStream(new File(filepath.concat(fileName)));
            excelWBook = new XSSFWorkbook(fis);
            excelWSheet=excelWBook.getSheetAt(0);
            int rowcount = excelWSheet.getLastRowNum();
            System.out.println(rowcount);
            //System.out.println(excelWSheet.getRow(rowcount).getCell(1).getStringCellValue());
            val=excelWSheet.getRow(rowcount).getCell(1).getStringCellValue();
        }catch (Exception e){
            System.out.println("Sheet is Empty");
        }
        return val;
    }

    public static void main(String[] args) throws IOException {

        WriteExcel writeExcel= new WriteExcel();
        System.out.println( writeExcel.getSIEmail());
        System.out.println(writeExcel.getTempPass());

    }

}
