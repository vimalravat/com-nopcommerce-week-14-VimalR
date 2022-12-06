package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    By cellPhonesTab = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]");
    By cellPhonesText = By.xpath("//h1[contains(text(),'Cell phones')]");

    public void hoverOnElectronicsTab() {
        mouseHoverToElement(electronicsTab);
    }

    public void hoverOnElectronicsTabAndClickCellPhones() {
        mouseHoverToElementAndClick(cellPhonesTab);
    }

    public String verifyTextCellPhonesText() {
        return getTextFromElement(cellPhonesText);
    }

    By listView = By.xpath("//h1[contains(text(),'Cell phones')]");

    public void listView() {
        clickOnElement(listView);
    }

    By nameNokiaLumiaTab = By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]");

    public void clickOnNokiaLumiaTab() {
        clickOnElement(nameNokiaLumiaTab);
    }

    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String verifyNokiaLumiaText() {
        return getTextFromElement(nokiaLumiaText);
    }

    By textAmountOf$349 = By.xpath("//span[@id='price-value-20']");

    public String verifyAmountText1$349() {
        return getTextFromElement(textAmountOf$349);
    }

    By productQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");

    public void changeQuantityTo2() {

        clearAndEnterQuantity(productQuantity, "2");

    }


    By addToCartLink = By.xpath("//button[@id='add-to-cart-button-20']");

    public void clickOnAddToCart() {
        clickOnElement(addToCartLink);
    }

    By theProductHasBeenAddedText = By.xpath("//div[@id='bar-notification']/div/p");

    public String verifyTheProductHasBeenAddedText() {
        return getTextFromElement(theProductHasBeenAddedText);
    }

    By closeButton = By.xpath("//span[@class='close']");

    public void closeButton() {
        clickOnElement(closeButton);
    }

    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnIt = By.xpath("//button[contains(text(),'Go to cart')]");

    public void clickOnShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
        clickOnElement(clickOnIt);
    }


    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    By basketTotal$698 = By.xpath("//span[@class='product-subtotal']");//--//tbody/tr[4]/td[2]/span[1]/strong[1]

    public String verifyBasketTotal$698() {
        return getTextFromElement(basketTotal$698);
    }

    By checkBox = By.id("termsofservice");

    public void verifyCheckBox() {
        clickOnElement(checkBox);
    }

    By checkOut = By.xpath("//button[@id='checkout']");

    public void checkOut() {
        clickOnElement(checkOut);
    }

    By welcomePleaseSignInMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String verifyWelcomePleaseSignInMessage() {
        return getTextFromElement(welcomePleaseSignInMessage);
    }

    By registerTabText = By.xpath("//button[contains(text(),'Register')]");

    public void verifyRegisterTabText() {
        clickOnElement(registerTabText);
    }

    By registerText = By.xpath("//h1[contains(text(),'Register')]");

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    By radioButtonLink = By.xpath("//input[@id='gender-female']");

    public void clickOnRadioButtonLink() {
        clickOnElement(radioButtonLink);
    }

    By firstName = By.id("FirstName");

    public void enterFirstname(String text) {
        sendTextToElement(firstName, text);
    }

    By LastName = By.id("LastName");

    public void enterLastname(String text) {
        sendTextToElement(LastName, text);
    }

    By emailField = By.id("Email");

    public void enterEmailInEmailField(String text) {
        sendTextToElement(emailField, text);
    }

    By passwordLink = By.id("Password");

    public void enterPassword(String text) {
        sendTextToElement(passwordLink, text);
    }

    By confirmPasswordLink = By.id("ConfirmPassword");

    public void enterConfirmPassword(String text) {
        sendTextToElement(confirmPasswordLink, text);
    }

    By registerTab = By.id("register-button");

    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }

    By registrationCompletedMessage = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String verifyRegistrationCompletedMessage() {
        return getTextFromElement(registrationCompletedMessage);
    }

    By continueWithRegisterLink = By.xpath("//a[@class='button-1 register-continue-button']");

    public void clickOnContinueTabWithRegisterLink() {
        clickOnElement(continueWithRegisterLink);
    }

    By shoppingCartText1 = By.xpath("//h1[text()='Shopping cart']");

    public String verifyShoppingCartText1() {
        return getTextFromElement(shoppingCartText1);
    }

    By checkBoxTermsOfService = By.id("termsofservice");

    public void clickOnCheckBox() {
        clickOnElement(checkBoxTermsOfService);    }
    By checkoutTab= By.id("checkout");
    public void clickCheckOutTab() {
        clickOnElement(checkoutTab);    }

    By countryFiled = By.id("BillingNewAddress_CountryId");
    public void enterCountry(String text) {
        selectByVisibleTextFromDropDown(countryFiled, text);
    }

    By cityField = By.id("BillingNewAddress_City");

    public void enterCity(String text) {
        sendTextToElement(cityField, text);
    }

    By addressTab = By.id("BillingNewAddress_Address1");

    public void enterAddressInTab(String text) {
        sendTextToElement(addressTab, text);
        ;
    }

    By postCodeField = By.id("BillingNewAddress_ZipPostalCode");

    public void enterPostCodeInFiled(String text) {
        sendTextToElement(postCodeField, text);

    }

    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumberInField(String text) {
        sendTextToElement(phoneNumberField, text);

    }

    By continueButton3 = By.xpath("//button[text() = 'Continue']");

    public void continue3() {
        clickOnElement(continueButton3);
    }


    By radiobutton1Tab = By.id("shippingoption_2");

    public void setRadioButton() {
        clickOnElement(radiobutton1Tab);
    }

    By continueButtonShippingMethod = By.xpath("//div[@id='shipping-method-buttons-container']/button");

    public void clickOnContinueButtonShippingMethod() {
        clickOnElement(continueButtonShippingMethod);
    }

    By radiobutton2 = By.xpath("//input[@id='paymentmethod_1']");

    public void setRadiobutton2() {
        clickOnElement(radiobutton2);
    }

    By paymentMethod = By.xpath("//div[@id='checkout-step-payment-method']/div/button");

    public void paymentMethodTab() {
        clickOnElement(paymentMethod);
    }

    By selectVisaPaymentCard = By.xpath("//select[@id='CreditCardType']");

    public void selectCreditCard(String text) {
        selectByVisibleTextFromDropDown(selectVisaPaymentCard, text);
    }

    By cardHolderName = By.id("CardholderName");

    public void enterCardHolderName(String text) {
        sendTextToElement(cardHolderName, text);
    }

    By cardNumber = By.id("CardNumber");

    public void enterCardNumber(String text) {
        sendTextToElement(cardNumber, text);
    }

    By selectExpireMonth = By.id("ExpireMonth");

    public void enterExpireMonth(String text) {
        selectByVisibleTextFromDropDown(selectExpireMonth, text);
    }

    By selectExpireYear = By.id("ExpireYear");

    public void enterExpireYear(String text) {
        selectByVisibleTextFromDropDown(selectExpireYear, text);
    }

    By securityCode = By.id("CardCode");

    public void enterSecurityCode(String text) {
        sendTextToElement(securityCode, text);
    }

    By continueCheckOut = By.xpath("//button[@onclick='PaymentInfo.save()']");

    public void clickOnContinueToCheckOut() {
        clickOnElement(continueCheckOut);
    }

    By verifyMessage1 = By.xpath("//li[@class='payment-method']/span[2]");

    public String verifyMessage1() {
        return getTextFromElement(verifyMessage1);
    }

    By verifyMessage2 = By.xpath("//li[@class='shipping-method']/span[2]");

    public String verifyMessage2() {
        return getTextFromElement(verifyMessage2);
    }

    By verifyMessage3 = By.xpath("//td[@class='subtotal']/span");

    public String verifyMessage3() {
        return getTextFromElement(verifyMessage3);
    }

    By clickConfirm = By.xpath("//button[contains(text(),'Confirm')]");

    public void clickOnConfirm() {
        clickOnElement(clickConfirm);
    }

    By verifyMessage4 = By.xpath("//h1[contains(text(),'Thank you')]");

    public String verifyMessage4() {
        return getTextFromElement(verifyMessage4);
    }

    By verifyMessage5 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String verifyMessage5() {
        return getTextFromElement(verifyMessage5);
    }

    By clickContinuee = By.xpath("//button[contains(text(),'Continue')]");

    public void clickOnContinue() {
        clickOnElement(clickContinuee);
    }

    By verifyMessage6 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String verifyMessage6() {
        return getTextFromElement(verifyMessage6);
    }

    By clickOnLogout = By.xpath("//a[contains(text(),'Log out')]");

    public void clickOnLogOut() {
        clickOnElement(clickOnLogout);
    }
    public static String getAlphaNumericString(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

}
