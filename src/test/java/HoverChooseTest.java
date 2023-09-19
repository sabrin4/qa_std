//1. На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
// Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class HoverChooseTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void HoverChoose() {
        open("https://github.com");

        $$("button.HeaderMenu-link")
                .findBy(Condition.text("Solutions"))
                .hover();
        $$("a.HeaderMenu-dropdown-link")
                .findBy(Condition.text("Enterprise"))
                .click();
        $("h1")
                .shouldHave(Condition.text("Build like the best"))
                .shouldBe(Condition.visible);
        sleep(5000);
    }
}