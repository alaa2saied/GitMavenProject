package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    //Locator
    private final By searchBox = By.cssSelector("input[class=\"css-ukkbbr e1n2h7jb1\"]");
    private final By searchButton = By.cssSelector("button[class=\"css-11qi1o ezfki8j0\"]");
    private final By postButton = By.cssSelector("div[class=\"css-16dyq3s e1v1l3u10\"] div:nth-child(10)");
    private final By postWeekButton = By.cssSelector("div[class=\"css-16dyq3s e1v1l3u10\"] div:nth-child(10) div:nth-child(3)");
    private final By allJobSearched = By.xpath("//div[@class=\"css-9i2afk\"]/div[2]/div/div/div[1]/h2");
    private final By firstJob = By.xpath("//div[@class=\"css-9i2afk\"]/div[2]/div[1]/div/div[1]/h2/a");
    private final By applyButton = By.cssSelector("button[class=\"css-1m0yk35 ezfki8j0\"]");
    private final By firstNameLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[1]/div[1]/div[2]/input");
    private final By lastNameLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[1]/div[2]/div[2]/input");
    private final By emailLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[2]/div[2]/input");
    private final By passwordLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[3]/div[2]/div/div/input");
    private final By signUpButton = By.cssSelector("button[class=\"css-6lejne ezfki8j0\"]");
    private final By entryLevelLocator = By.xpath("//div[@name=\"careerLevel\"]/div[2]/strong");
    private final By fullTimeLocator = By.xpath("//form[@id=\"career-interests-form\"]/div[2]/div/button[1]/span");
    private final By remoteLocator = By.xpath("//form[@id=\"career-interests-form\"]/div[3]/div/button[2]/span");
    private final By electricalEngineerLocator = By.xpath("//form[@id=\"career-interests-form\"]/div[4]/div[2]/div/div[3]");
    private final By expectedSalaryLocator = By.xpath("//form[@id=\"career-interests-form\"]/div[5]/div[1]/div[1]/div/input");
    private final By saveAndContinueLocator = By.xpath("//form[@id=\"career-interests-form\"]/div[7]/button");
    private final By dayLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[1]/div[3]/div/div[1]/div/div/div[1]/div[2]/div/input");
    private final By daySelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[5]");
    private final By monthLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[1]/div[3]/div/div[2]/div/div/div[1]/div[2]/div/input");
    private final By monthSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[1]");
    private final By yearLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[1]/div[3]/div/div[3]/div/div/div[1]/div[2]/div/input");
    private final By yearSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[16]");
    private final By femaleLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[1]/div[4]/div[2]/label[2]/div");
    private final By nationalityLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[1]/div[5]/div/div[2]/div/div[1]/div[2]/div/input");
    private final By nationalitySelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[42]");
    private final By cityLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/input");
    private final By citySelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[6]");
    private final By areaLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/input");
    private final By areaSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[1]");
    private final By phoneLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[3]/div/div/div[2]/input");
    private final By saveButtonLocator = By.xpath("//form[@id=\"basic-info-form\"]/div[4]/button");
    private final By yearsExperienceLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[1]/div/div/div/div/div[1]/div[2]/div/input");
    private final By yearsExperienceSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[1]");
    private final By bachelorDegreeStudyLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[2]/div[1]/div[1]/strong");
    private final By fieldLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/input");
    private final By universityLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div/input");
    private final By gradeYearLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/div/div[1]/div[2]/div/input");
    private final By gradeYearSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[11]");
    private final By gradeLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[2]/div[2]/div[2]/div[5]/div/div/div/div[1]/div[2]/div/input");
    private final By gradeSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[3]");
    private final By skillsLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[4]/div/div/div/div[1]/div[1]/div[2]/div/input");
    private final By skills2Locator = By.xpath("//form[@id=\"work-experience-form\"]/div[4]/div/div/div/div[1]/div/div/div/input");
    private final By skillsSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[1]");
    private final By languageLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[3]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div/input");
    private final By languageSelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[2]");
    private final By proficiencyLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[3]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/input");
    private final By proficiencySelect = By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[3]");
    private final By addLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[3]/div[2]/div/button");
    private final By getStartedLocator = By.xpath("//form[@id=\"work-experience-form\"]/div[6]/button");



    //Methode
    public void writeSearchBox(String text){
        writeFeature(searchBox,text);
    }
    public void clickOnSearchButton(){
        clickFeature(searchButton);
    }
    public void clickOnPostButton(){
        clickFeature(postButton);
    }
    public WebElement assertFeature()
    {
        return forAssert(postButton);
    }
    public void clickOnPostWeek(){
        clickFeature(postWeekButton);
    }
    public List printAllJob(){
        return forPrintFeature(allJobSearched);
    }
    public void clickOnFirstJob(){
        clickFeature(firstJob);
    }
    public void clickOnApplyButton(){
        clickFeature(applyButton);
    }
    public void enterFirstName(String firstName){
        writeFeature(firstNameLocator,firstName);
    }
    public void enterLastName(String lastName){
        writeFeature(lastNameLocator,lastName);
    }
    public void enterEmail(String email){
        writeFeature(emailLocator,email);
    }
    public void enterPassword(String password){
        writeFeature(passwordLocator,password);
    }
    public void clickOnSignUpButton(){
        clickFeature(signUpButton);
    }
    public void clickOnEntryLevel(){
        clickFeature(entryLevelLocator);
    }
    public void clickOnFullTime(){
        clickFeature(fullTimeLocator);
    }
    public void clickOnRemote(){
        clickFeature(remoteLocator);
    }
    public void clickOnElectricalEngineer(){
        clickFeature(electricalEngineerLocator);
    }
    public void enterExpectedSalary(String salary){
        writeFeature(expectedSalaryLocator,salary);
    }
    public void clickOnSaveAndContinue(){
        clickFeature(saveAndContinueLocator);
    }
    public void chooseDate(){
        clickFeature(dayLocator);
        clickFeature(daySelect);
        clickFeature(monthLocator);
        clickFeature(monthSelect);
        clickFeature(yearLocator);
        clickFeature(yearSelect);
    }
    public void chooseFemale(){
        clickFeature(femaleLocator);
    }
    public void selectLocation(){
        clickFeature(nationalityLocator);
        clickFeature(nationalitySelect);
        clickFeature(cityLocator);
        clickFeature(citySelect);
    }


    public void enterPhoneNumber(String phone){
        clickFeature(areaLocator);
        clickFeature(areaSelect);
        writeFeature(phoneLocator,phone);

    }
    public void clickOnSaveButton(){
        clickFeature(saveButtonLocator);
    }
    public void setYearsExperience(){
        clickFeature(yearsExperienceLocator);
        clickFeature(yearsExperienceSelect);
        clickFeature(bachelorDegreeStudyLocator);
    }
    public void enterStudyInformation(String fieldName, String universityName){
        writeFeature(fieldLocator,fieldName);
        writeFeature(universityLocator,universityName);
        clickFeature(gradeYearLocator);
        clickFeature(gradeYearSelect);
        clickFeature(gradeLocator);
        clickFeature(gradeSelect);
    }
    public void editLanguage(){
        clickFeature(languageLocator);
        clickFeature(languageSelect);
        clickFeature(proficiencyLocator);
        clickFeature(proficiencySelect);
        clickFeature(addLocator);
    }
    public void enterSkills(String skill1){
        writeFeature(skillsLocator,skill1);
        clickFeature(skillsSelect);

    }
    public void enterSkills2(String skills){
        writeFeature(skills2Locator,skills);
        clickFeature(skillsSelect);
    }
    public void clickOnGetStarted(){
        clickFeature(getStartedLocator);
    }
}
