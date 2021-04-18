import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestEgarGlobal {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void homePage() {
        Configuration.timeout=6000;
        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",3).click();
        $("h1").shouldHave(text("Contact an Expert"));
    }

}
