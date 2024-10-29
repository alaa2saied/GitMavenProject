package Tests;

import Pages.LoginPage;
import Pages.ProductPage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginTest extends BaseTest {




    @Test(dataProvider ="getData")
    public void enterCredentials(String userName , String password){

        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();

    }


    @DataProvider
    public String[][] getData() throws IOException {

            FileInputStream fileInputStream = new FileInputStream("src/TestData/Book1.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            int numberOfRow = sheet.getPhysicalNumberOfRows();
            int numberOfCol = sheet.getRow(0).getLastCellNum();
            String[][] returnArray = new String[numberOfRow-1][numberOfCol];
            for (int i =1;i<numberOfRow;i++){
                XSSFRow row = sheet.getRow(i);
                for (int j=0 ;j<numberOfCol;j++){
                returnArray[i-1][j] = String.valueOf(row.getCell(j));
                }
            }
            return returnArray;
        }


}
