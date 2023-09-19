import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorSelenideTest {
    @Test
    void BestContributorSelenide() {
        //открываем страницу, находим нужный элемент
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar")
                .$(byText("Contributors"))
                .closest(".BorderGrid-cell")
                .$$("ul li").first().hover();
        // находим имя во всплывающем окне
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}

