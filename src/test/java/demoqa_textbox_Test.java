import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class demoqa_textbox_Test {

    @BeforeAll
    static void setup() {
        // Настройка Firefox
        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "firefox";
        Configuration.browserSize = "1366x768";
        Configuration.pageLoadStrategy = "eager";
        Configuration.headless = false;
    }

    @Test
    void firstTest() {
        open("https://demoqa.com/text-box");  // Полный URL вместо относительного
        $("#userName").setValue("Richard");
        $("#userEmail").setValue("whereisurballs@rambler.com");
        $("#currentAddress").setValue("Ur mommaz arse");
        $("#permanentAddress").setValue("The same");
        $("#submit").click();
    }
}