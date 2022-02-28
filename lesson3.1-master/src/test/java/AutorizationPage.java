import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.security.util.Password;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;



public class AutorizationPage extends Main {


    @FindBy(how = How.XPATH, using = "//*[@id='login-form-username']")
    private SelenideElement loginLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-password']")
    private SelenideElement PasswordLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-submit']")
    private SelenideElement buttonLogin;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-cancel']")
    private SelenideElement buttonCanIn;

    @FindBy(how = How.XPATH, using = "//*[@id='browse_link']")
    private SelenideElement buttonProject;

    @FindBy(how = How.XPATH, using = "//*[@id='admin_main_proj_link_lnk']")
    private SelenideElement buttonProject2;

    @FindBy(how = How.XPATH, using = "//a[@id='find_link']")
    private SelenideElement buttZadachi1;

    @FindBy(how = How.XPATH, using = "//*[@id='issues_new_search_link_lnk']")
    private SelenideElement buttZadachi2;

    @FindBy(how = How.XPATH, using = "//a[@id='create_link']")
    private SelenideElement buttCreat1;

    @FindBy(how = How.XPATH, using = "//input[@id='summary']")
    private SelenideElement buttCreat2;

    @FindBy(how = How.XPATH, using = "//input[@id='create-issue-submit']")
    private SelenideElement buttCreat3;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Бизнес-процесс')]")
    private SelenideElement buttCreat4;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Выполнено')]")
    private SelenideElement buttCreat5;



    public AutorizationPage clicButtonLogin() {
    loginLane.click();
    loginLane.sendKeys(login);
    return page(AutorizationPage.class);
    }
    public AutorizationPage clicButtonPassword() {
        $x("//*[@id='login-form-password']").click();
        $x("//*[@id='login-form-password']").sendKeys(password);
    return page(AutorizationPage.class);
    }
    public AutorizationPage clicButtonIn() {
        buttonLogin.click();
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicProject() {
        buttonProject.click();
        buttonProject2.click();
        return page(AutorizationPage.class);
   }
    public AutorizationPage clicZadachi1() {
        buttZadachi1.click();
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicZadachi2() {
        buttZadachi2.click();
        return page(AutorizationPage.class);
    }






    public AutorizationPage clicCreat1() {
        buttCreat1.click();
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicVvod1() {
        buttCreat2.sendKeys(vvod1);
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicCreat2() {
        buttCreat3.click();
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicCreat3() {
        buttCreat4.click();
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicCreat4() {
        buttCreat5.click();
        return page(AutorizationPage.class);
    }
  }

