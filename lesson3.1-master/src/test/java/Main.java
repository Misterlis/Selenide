import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;


public class Main {
    String vvod1 = "Тестовый тест";
    String login = "roMarkov";
    String password = "123qaz!@#QAZ";

    @BeforeAll
    public static void setupSettings() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }
    @AfterEach
    public void closeWebDriver() {
        WebDriverRunner.closeWebDriver();
    }
    @Test
    public void Test1() {

        Selenide.open("https://edujira.ifellow.ru/login.jsp", AutorizationPage.class)
                .clicButtonLogin()
                .clicButtonPassword()
                .clicButtonIn();

        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa", MainPage.class)
                .isOpened();

        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa", AutorizationPage.class)
                .clicProject()
                .clicZadachi1()
                .clicZadachi2();

        String number = ($x("//div[@class='showing']").text());
        number = number.substring(number.lastIndexOf(" ")).trim();
        String count = ($x("//div[@class='pagination']").getAttribute("data-displayable-total"));
        Assertions.assertEquals(number, count);
    }
    @Test
    public void Test2() {

        Selenide.open("https://edujira.ifellow.ru/login.jsp", AutorizationPage.class)
                .clicButtonLogin()
                .clicButtonPassword()
                .clicButtonIn();

        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa", MainPage.class)
                .isOpened();

        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa", AutorizationPage.class)
                .clicCreat1()
                .clicVvod1()
                .clicCreat2()
                .clicZadachi1()
                .clicZadachi2()
                .clicCreat3()
                .clicCreat4();
        Assertions.assertEquals("rgba(20, 137, 44, 1)", $x("//span[@id='status-val']/span").getCssValue("background-color"));

        }




}
