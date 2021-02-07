package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

class DemoQaTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void siteExists() {

       open("https://demoqa.com/");
       $("html").shouldHave(text("TOOLSQA.COM | ALL RIGHTS RESERVED"));

    }

    @Test
    void practiceFormTest() {

        open("https://demoqa.com/");
        $("html").shouldHave(text("TOOLSQA.COM | ALL RIGHTS RESERVED"));

        $(byText("Forms")).click();
        $("html").shouldHave(text("Please select an item from left to start practice"));

        $(byText("Forms")).click();
        $(byText("Practice Form")).click();

        $("#firstName").sendKeys("Victor");
        $("#lastName").sendKeys("Dmitrich");
        $("#userEmail").sendKeys("victor@dmitrich.ru");
        $("#userNumber").sendKeys("0000000911");
        $("#currentAddress").sendKeys("anywhere");
        $(byText("Other")).click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1985");
        $(".react-datepicker__day--017").click();
     



    }
}