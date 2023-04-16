//   Разработайте следующий автотест:
// - Откройте страницу Selenide в Github
// - Перейдите в раздел Wiki проекта
// - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
// - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GithubSelenideFindWikiPageTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void GithubSelenideFindWikiPage() {
        open("https://github.com/selenide/selenide");
        $("a#wiki-tab").click();
        $("div#wiki-body ul")
                .$$("li a")
                .findBy(text("Soft assertions")).click();
       $("div h4#user-content-3-using-junit5-extend-test-class");
       sleep(5000);



    }
}
