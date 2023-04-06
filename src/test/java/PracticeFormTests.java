import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {
    static File photo = new File("C:\\DARK.jpg");

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void fillPracticeFormTest() {
        open("/automation-practice-form");
        //firstName, lastName
        $("#firstName").setValue("Serega");
        $("#lastName").setValue("Testerov");
        $("#userEmail").setValue("serega@testmail.com");
        //male
        $x("//label[@for='gender-radio-1']").click();
        //userPhoneNumber
        $("#userNumber").setValue("9181104115");
        //date of birth
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__month-select").click();

        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("2001");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--012").click();
        //Subjects broken ?
        //$("#subjectsInput").setValue("123");
        //hobbies
        $x("//label[@for='hobbies-checkbox-1']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        //upload pic
        $("#uploadPicture").uploadFile(photo);
        //address
        $("#currentAddress").setValue("Samara");
        //state and city
        $("[id=state]").click();
        $("#react-select-3-option-1").click();
        $("[id=city]").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();


    }
}
