package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage= new HomePage();
        resultPage= new ResultPage();
    }


    @Test(dataProvider = "Job Search",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException
    {
        Thread.sleep(1000);

        homePage.jobSearch(jobTitle,location, distance, salaryMin,salaryMax,salaryType,jobType,result);
        Assert.assertEquals(resultPage.getErrorMessage(),result);

    }

}
