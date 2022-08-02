import org.junit.Assert;
import org.junit.Test;

public class OrderFormTest extends Settings {
    String surname = "Ivanov";
    String name = "Peter";

    @Test
    public void isLabelSurnameEqualsSurname(){
        Assert.assertTrue(step.isElementLabelSurnameDisplayed());
    }

    @Test
    public void isLabelNameEqualsName(){
        Assert.assertTrue(step.isElementLabelNameDisplayed());
    }

    @Test
    public void isLabelGenderEqualsGender(){
        Assert.assertTrue(step.isElementLabelGenderDisplayed());
    }

    @Test
    public void isLabelButtonEqualsButton(){
        Assert.assertTrue(step.isElementLabelButtonDisplayed());
    }

    @Test
    public void surnameTest(){
        page.fillInputSurname(surname);
        Assert.assertEquals(surname, page.getSurname());
    }

    @Test
    public void nameTest(){
        page.fillInputName(name);
        Assert.assertEquals(name, page.getName());
    }
}
