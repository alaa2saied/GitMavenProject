package Tests;

import Pages.HomePage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class HomeTest extends BaseTest{

    HomePage page;
    FileOutputStream fileOutputStream;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row1;

    @Test
    public void addProductToCart() throws IOException {

        page = new HomePage(driver);
        fileOutputStream = new FileOutputStream(new File("Data/dataOfProduct.xlsx"));
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Data");
        row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("ProductName");
        row1.createCell(1).setCellValue("Price");

        page.writeInSearchBox("notebook");
        List<WebElement> product = page.productList() ;
        List<WebElement> price = page.priceList() ;

        for (int i=0 ; i<5 ; i++){
            XSSFRow currentRow = sheet.createRow(i+1);
            for (int j=0 ; j<1 ; j++){
                currentRow.createCell(j).setCellValue(product.get(i).getText());
                currentRow.createCell(j+1).setCellValue(price.get(i).getText());
            }
        }

        workbook.write(fileOutputStream);

    }



}
