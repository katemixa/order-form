package order_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderFormPage {
    WebDriver driver;
    private final By labelSurnameLocator = By.xpath("//label[contains(text(), 'Фамилия')]");
    private final By labelNameLocator = By.xpath("//label[contains(text(), 'Имя')]");
    private final By labelGenderLocator = By.xpath("//label[contains(text(), 'Пол')]");
    private final By buttonLocator = By.xpath("//input[@type='submit']");

    private final By inputSurnameLocator = By.name("surname");
    private final By inputNameLocator = By.name("name");
    private final By genderMaleLocator = By.xpath("//input[@value='m']");
    private final By genderFemaleLocator = By.xpath("//input[@value='f']");

    public OrderFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInputSurname(String surname) {
        driver.findElement(inputSurnameLocator).sendKeys(surname);
    }

    public String getSurname() {
        return driver.findElement(inputSurnameLocator).getText();
    }

    public void fillInputName(String name) {
        driver.findElement(inputNameLocator).sendKeys(name);
    }

    public String getName() {
        return driver.findElement(inputNameLocator).getText();
    }

    public void selectMaleGender() {
        driver.findElement(genderMaleLocator).click();
    }

    public void clickButtonSubmit() {
        driver.findElement(buttonLocator).click();
    }

    public boolean isLabelSurnameDisplayed(String label) {
        return driver.findElement(labelSurnameLocator).getText().contains(label);
    }

    public boolean isLabelNameDisplayed(String label) {
        return driver.findElement(labelNameLocator).getText().contains(label);
    }

    public boolean isLabelGenderDisplayed(String label) {
        return driver.findElement(labelGenderLocator).getText().contains(label);
    }

    public boolean isLabelButtonDisplayed(String label) {
        return driver.findElement(buttonLocator).getAttribute("value").contains(label);
    }
}
