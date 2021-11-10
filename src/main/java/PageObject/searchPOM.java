package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPOM {
    public searchPOM(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[type='search']")
    public WebElement searchField;

    @FindBy(css="li[id='hc_sts:1555499781336986']")
    public WebElement specificName;
    @FindBy(css = ".dkezsu63 > span:nth-child(1)")
    public WebElement titleName;

    public void setSearchField()
    {
        searchField.sendKeys("ISTQB Guru");
        specificName.click();
    }
    public void checkTitleName(String expectedName)
    {
        Assert.assertTrue(titleName.getText().contains(expectedName));
    }

}
