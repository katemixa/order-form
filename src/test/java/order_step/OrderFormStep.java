package order_step;

import order_page.OrderFormPage;
import org.openqa.selenium.WebDriver;

public class OrderFormStep extends OrderFormPage {
    private final String inputSurnameLabel = "Фамилия";
    private final String inputNameLabel = "Имя";
    private final String inputGenderLabel = "Пол";
    private final String buttonLabel = "Заказать";
    public OrderFormStep(WebDriver driver) {
        super(driver);
    }

    public boolean isElementLabelSurnameDisplayed() {
        return isLabelSurnameDisplayed(inputSurnameLabel);
    }

    public boolean isElementLabelNameDisplayed() {
        return isLabelNameDisplayed(inputNameLabel);
    }

    public boolean isElementLabelGenderDisplayed() {
        return isLabelGenderDisplayed(inputGenderLabel);
    }

    public boolean isElementLabelButtonDisplayed() {
        return isLabelButtonDisplayed(buttonLabel);
    }
}
