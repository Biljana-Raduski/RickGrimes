import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest extends Postavke {

    By signInLink = By.xpath("//a[text()=\"Sign in\"]");
    By registerYourAcoountLink = By.xpath("//a[text()=\"Register your account\"]");
    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By dateOfBirthField = By.id("dob");
    By addressField = By.id("address");
    By postcodeField = By.id("postcode");
    By cityField = By.id("city");
    By stateField = By.id("state");
    By countryField = By.id("country");
    By phoneNumberField = By.id("phone");
    By emailField = By.xpath("//input[@id='email']");
    By passwordField = By.xpath("//input[@id='password']");
    By registerButton = By.xpath("//button[text()=\"Register\"]");
    By loginEmailField = By.id("email");
    By loginPasswordField = By.id("password");
    By loginButton = By.xpath("//input[@type=\"submit\"]");
    By usermenu = By.id("user-menu");


    @Test
    public void registrationTest() {
        clickOnElement(signInLink);
        clickOnElement(registerYourAcoountLink);
        typeIn(firstNameField, "Rick");
        typeIn(lastNameField, "Grimes");
        typeIn(dateOfBirthField, "05/15/1975");
        typeIn(addressField, "Oak Street");
        typeIn(postcodeField, "123456");
        typeIn(cityField, "Atlanta");
        typeIn(stateField, "Georgia");
        clickOnElement(countryField);
        Select countryDropdown = new Select(driver.findElement(countryField));
        countryDropdown.selectByVisibleText("United States of America (the)");
        typeIn(phoneNumberField, "456879");
        typeIn(emailField, "rick.grimes75@gmail.com");
        typeIn(passwordField, "Rickg1975");
        clickOnElement(registerButton);

        WebElement newtab = driver.findElement(By.id("email"));
        newtab.click();
        clickOnElement(signInLink);
        typeIn(loginEmailField, "rick.grimes75@gmail.com");
        typeIn(loginPasswordField, "Rickg1975");
        clickOnElement(loginButton);

        softAssert.assertTrue(isElementVisible(usermenu),"Failed");



    }


    }
