package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOM {
    public loginPOM(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="input#email")
    public WebElement email;

    @FindBy(css="input#pass")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement loginButton;

    public void setEmail()
    {
        email.sendKeys("crish1981@gmail.com");
    }
    public void setPassword()
    {
        password.sendKeys("krishnad");
    }
    public void clickLogin()
    {
        loginButton.click();
    }
}
