package pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/V4/index.php")
public class LoginPage extends PageObject {
    private By TxtUser = By.name("uid");
    private By TxtPass = By.name("password");
    private By BtnLogin = By.name("btnLogin");
    private By TxtMensaje = By.xpath("//td[contains(text(),'Manger Id : mngr622585')]");

    public void setTxtUser(String usuario) {
        getDriver().findElement(TxtUser).sendKeys(usuario);
    }

    public void setTxtPass(String pass) {
        getDriver().findElement(TxtPass).sendKeys(pass);
    }

    public void clickBtnLogin() {
        getDriver().findElement(BtnLogin).click();
    }

    public String obtenerMensaje() {
        return getDriver().findElement(TxtMensaje).getText();
    }
}

