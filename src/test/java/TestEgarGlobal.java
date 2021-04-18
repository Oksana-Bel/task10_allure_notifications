import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestEgarGlobal {

    @Test
    void StartNow() {
        //Configuration.timeout=6000;
        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",3).click();
        $("h1").shouldHave(text("Contact an Expert"));
    }

    @Test
    void SpeakToUs () {
        open("https://www.egarglobal.com");
        // $(byText("Learn More")).click();
        $("h1").shouldHave(text("The NoCode platform for next-generation applications"));
        $(".webBtn",2).click();
        $("h1").shouldHave(text("Contact an Expert"));
    }

    @Test
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

}
