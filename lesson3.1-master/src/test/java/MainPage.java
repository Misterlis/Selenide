import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;


public class MainPage {
    @FindBy (how = How.XPATH, using = "//h1[text()='System Dashboard']")
    private SelenideElement header;

    public MainPage isOpened() {
        header.shouldBe(Condition.visible);
        return page(MainPage.class);


    }
}
