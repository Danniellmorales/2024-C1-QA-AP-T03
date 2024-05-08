package co.com.demo.page;

import co.com.demo.page.functions.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PassengerInformationPage extends CommonFunctions {
    private WebDriver driver;
    private WebDriverWait wait;

    public PassengerInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "passengerDetails-firstName-ADT_1")
    private WebElement firstName;

    @CacheLookup
    @FindBy(id = "passengerDetails-firstName-ADT_2")
    private WebElement secondfirstName;

    @CacheLookup
    @FindBy(id = "passengerDetails-lastName-ADT_1")
    private WebElement lastName;

    @CacheLookup
    @FindBy(id = "passengerDetails-lastName-ADT_2")
    private WebElement secondLastName;

    @CacheLookup
    @FindBy(id = "passengerInfo-dateOfBirth-ADT_1")
    private WebElement dateOfBirth;

    @CacheLookup
    @FindBy(id = "passengerInfo-dateOfBirth-ADT_2")
    private WebElement seconddateOfBirth;

    @CacheLookup
    @FindBy(id = "documentInfo-documentNumber-ADT_1")
    private WebElement identification;

    @CacheLookup
    @FindBy(id = "documentInfo-documentNumber-ADT_2")
    private WebElement secondIdentification;

    @CacheLookup
    @FindBy(id = "passengerInfo-emails-ADT_1")
    private WebElement email;

    @CacheLookup
    @FindBy(id = "passengerInfo-emails-ADT_2")
    private WebElement secondEmail;

    @CacheLookup
    @FindBy(id = "passengerInfo-phones0-number-ADT_1")
    private WebElement phoneNumber;

    @CacheLookup
    @FindBy(id = "passengerInfo-phones0-number-ADT_2")
    private WebElement secondPhoneNumber;

    @CacheLookup
    @FindBy(id = "repeatContactData-ADT_1")
    private WebElement reuseContactDataButton;

    @CacheLookup
    @FindBy(id = "passengerFormSubmitButtonADT_1")
    private WebElement saveDataButton;

    @CacheLookup
    @FindBy(xpath = "//button[@aria-label='Continuar al paso de pago.']")
    private WebElement continueToPaymentButton;

    public void enterName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).click();
        firstName.sendKeys(name);
    }

    public void enterLastName(String surname) {
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).click();
        lastName.sendKeys(surname);
    }

    public void enterDateOfBirth(String dateBirth){
        wait.until(ExpectedConditions.elementToBeClickable(dateOfBirth)).click();
        dateOfBirth.sendKeys(dateBirth);
    }

    public void enterIdentification(String id){
        scrollTo(identification);
        clickSelection(identification);
        identification.sendKeys(id);
    }

    public void enterEmail(String emailUser){
        wait.until(ExpectedConditions.elementToBeClickable(email)).click();
        email.sendKeys(emailUser);
    }

    public void enterPhoneNumber(String phoneUser){
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber)).click();
        phoneNumber.sendKeys(phoneUser);
    }


    public void enterPassengerInformation(){
        enterName("Martin");
        enterLastName("Perez");
        enterDateOfBirth("17-03-1997");
        enterIdentification("1214567983");
        enterEmail("dm34mgm@gmail.com");
        enterPhoneNumber("324332456");
    }

}
