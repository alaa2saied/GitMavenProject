package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            /* for reading data from excel file */
//        FileInputStream file = new FileInputStream("TestData/task3.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet = workbook.getSheet("Sheet1");
//        int totalRow = sheet.getLastRowNum();
//        int totalCell = sheet.getRow(1).getLastCellNum();
//        System.out.println(totalRow);
//        System.out.println(totalCell);
//        for(int r=0; r<=10 ; r++){
//            XSSFRow currentRow = sheet.getRow(r);
//            for (int c=0 ; c<totalCell ; c++){
//                XSSFCell cell = currentRow.getCell(c);
//                System.out.print(cell.toString()+"\t");
//            }
//            System.out.println();
//        }
//        workbook.close();
//        file.close();
        /* for writing test data driven */
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet =  workbook.createSheet("Data");
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Java");
        row1.createCell(1).setCellValue(19);
        row1.createCell(2).setCellValue("Automation");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Python");
        row2.createCell(1).setCellValue(3);
        row2.createCell(2).setCellValue("Automation");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("C#");
        row3.createCell(1).setCellValue(5);
        row3.createCell(2).setCellValue("Automation");
        FileOutputStream file = new FileOutputStream(new File("TestData/TestDataDriven.xlsx"));
        workbook.write(file);
        workbook.close();


    }
}