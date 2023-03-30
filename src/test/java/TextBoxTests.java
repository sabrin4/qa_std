import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        //$ - элемент
        $("#userName").setValue("Serega");
        $("#userEmail").setValue("testQA@63rus.com");
        $("#currentAddress").setValue("myAddrress");
        $("#permanentAddress").setValue("asd");
        $("#submit").click();

        $("#output").shouldHave(
                text("Serega"),
                text("testQA@63rus.com"),
                text("myAddrress"),
                text("asd")
        );

    }



}
