package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPOM {
    public AccountPOM(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".eltiug27 > path:nth-child(1)")
    public WebElement icon;

    @FindBy(css = ".b20td4e0 > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")
    public WebElement display;

    @FindBy(css = "div.aahdfvyu > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")
    public WebElement on;

    public void setIcon()
    {
        icon.click();
    }
    public void setDisplay()
    {
        display.click();
    }
    public void setOn()
    {
        on.click();
    }
}
