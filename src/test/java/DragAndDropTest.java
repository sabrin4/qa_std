import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

//2. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
// - Откройте https://the-internet.herokuapp.com/drag_and_drop
// - Перенесите прямоугольник А на место В
// - Проверьте, что прямоугольники действительно поменялись
// - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
public class DragAndDropTest {

    @Test
    void DragAndDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").shouldHave(Condition.exactText("A"));
        $("#column-b").shouldHave(Condition.exactText("B"));
        $("#column-b").dragAndDropTo("#column-a");
        $("#column-a").shouldHave(Condition.exactText("B"));

//        actions()
//                .moveToElement($("#column-a"))
//                .clickAndHold().moveToElement($("#column-b"))
//                .release()
//                .perform();
    }

}
