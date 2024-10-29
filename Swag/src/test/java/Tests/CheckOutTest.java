package Tests;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckOutTest extends BaseTest{

    SoftAssert softAssert = new SoftAssert();

    @Test(dataProvider = "getData")
    public void checkValidCredentials(String firstName, String lastName, String zipCode){
        test = report.createTest("report");
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        productPage.clickOnCartButton();
        cartPage.clickOnCheckOutButton();
        checkOutPage.setFirstName(firstName);
        checkOutPage.setLastName(lastName);
        checkOutPage.setZipCode(zipCode);
        checkOutPage.clickOnContinueButton();
        softAssert.assertTrue(checkOutPage.getTextCheckOut().getText().toLowerCase().contains("check"));
        test.pass("redirection to check out over view successfully");
        checkOutPage.clickOnFinishButton();
        productPage.clickOnThreeHyphenMenu();
        checkOutPage.clickOnLogOut();
        softAssert.assertAll();
    }


    @DataProvider
    public String[][] getData() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/TestData/Book2.xlsx");
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
