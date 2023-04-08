import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class shouldFindSelenideRepositoryAtTopTest {

    @Test
    void shouldFindSelenideRepositoryAtTop() {
        open("https://github.com");
        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }


}


