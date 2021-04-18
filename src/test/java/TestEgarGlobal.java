import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEgarGlobal {

    public class PositiveTests {
        @Test
        void some1Test() {
            assertTrue(true);
        }

        @Test
        void some2Test() {
            assertTrue(true);
        }
    }

        /*void SpeakToUs () {
@Test
    void StartNow() {
        Configuration.timeout=30000;
        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",3).click();
        $("h1").shouldHave(text("Contact an Expert"));
    }

    @Test

        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",2).click();
        $("h1").shouldHave(text("Contact an Expert"));
    }

    /*@Test
    void LearnMoreAboutEGARGlobal () {
        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",1).click();
        $("h1").shouldHave(text("Enterprise Financial Services Software Meets"));
    }
    @Test
    void LearnMore() {
        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",0).click();
        $("h1").shouldHave(text(" Build Apps. Modify Systems."));
    }
    */

}
