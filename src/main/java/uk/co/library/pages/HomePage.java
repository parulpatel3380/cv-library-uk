package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    /*
 Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
   Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
   enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
   clickOnFindJobsButton().
  */
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleCv;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationCv;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButn;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement cookie;

    public void enterJobTitle(String jobTitle) {
        CustomListeners.test.log(Status.PASS,"enter Job title "+jobTitleCv);
        sendTextToElement(jobTitleCv, jobTitle);
    }

    public void enterLocation(String location) {
        CustomListeners.test.log(Status.PASS,"enter location "+locationCv);
        sendTextToElement(locationCv, location);
    }

    public void selectDistance(String distance) {
        CustomListeners.test.log(Status.PASS,"select distance "+distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void clickOnMoreSearchOptionLink(){
        CustomListeners.test.log(Status.PASS,"clickOnMoreSearchOption "+moreSearchOptionsLink);
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMaxSalary(String maxSalary)
    {
        CustomListeners.test.log(Status.PASS,"enterMaxSalary "+salaryMax);
        sendTextToElement(salaryMax,maxSalary);
    }
    public void enterMinSalary(String minSalary)
    {
        CustomListeners.test.log(Status.PASS,"enterMin salary "+salaryMin);
        sendTextToElement(salaryMin,minSalary);
    }
    public void selectSalaryType(String sType){
        CustomListeners.test.log(Status.PASS,"select salaryType "+salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        CustomListeners.test.log(Status.PASS,"SelectJobType "+jobTypeDropDown);
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void  clickOnFindJobsButton(){
        CustomListeners.test.log(Status.PASS,"CLick "+findJobButn);
        clickOnElement(findJobButn);
    }
    ResultPage resultPage= new ResultPage();


    public void jobSearch(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result){
        clickOnMoreSearchOptionLink();
        enterJobTitle(jobTitle);
        enterLocation(location);
        selectDistance(distance);
        enterMinSalary(salaryMin);
        enterMaxSalary(salaryMax);
        selectSalaryType(salaryType);
        selectJobType(jobType);
        clickOnFindJobsButton();
        //resultPage.getResultMessage();

    }
    public void clickOnAcceptCookies()
    {
        cookie.click();
    }
}
