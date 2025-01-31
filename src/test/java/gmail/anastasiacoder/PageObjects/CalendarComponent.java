package gmail.anastasiacoder.PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {

    private final SelenideElement dateInput = $("#dateOfBirthInput"),
        monthCalendar = $(".react-datepicker__month-select"),
        yearCalendar =  $(".react-datepicker__year-select");

    private final String dayInCalendar = ".react-datepicker__day";

    public void setDate(String day, String month, String year) {
        dateInput.click();
        monthCalendar.selectOption(month);
        yearCalendar.selectOption(year);
        $$(dayInCalendar).find(text(day)).click();
    }
}