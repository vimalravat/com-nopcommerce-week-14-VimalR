package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerMenuTab = By.xpath("//a[contains(text(),'Computers ')]");
    By desktopMenuTab = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    By sortByPositionTab = By.xpath("//select[@id='products-orderby']");
    By productOrderBy = By.id("products-orderby");
    By addToCartBuildYourOwnComputer = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By buildYourOwnComputerMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By intelPentiumDualCoreE2200 = By.id("product_attribute_1");
    By productAttribute2 = By.id("product_attribute_2");
    By hDDRadio400GB = By.id("product_attribute_3_7");
    By vistaPremium= By.id("product_attribute_4_9");
    By microsoftOfficeCheckBox= By.id("product_attribute_5_12");
    By orderTotalLink= By.xpath("//span[contains(text(),'$1,475.00')]");
    By addToCardLink= By.xpath(" //button[@id='add-to-cart-button-1']");
    By productAddedToBasketSuccessMessage= By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By crossButton= By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By goToCartButton= By.xpath("//span[contains(text(),'Shopping cart')]");
    By shoppingCartMessage= By.xpath("//h1[contains(text(),'Shopping cart')]");
    By agreeWithTheTermsOfService= By.xpath("//input[@id='termsofservice']");
    By checkoutTab= By.xpath("//button[@id='checkout']");
    By welcomePleaseSignIn= By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutAsGuestTab= By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firstNameField= By.id("BillingNewAddress_FirstName");
    By lastNameField= By.id("BillingNewAddress_LastName");
    By emailField= By.id("BillingNewAddress_Email");
    By countyTab= By.id("BillingNewAddress_CountryId");
    By provinceTab= By.id("BillingNewAddress_StateProvinceId");
    By cityTab=By.id("BillingNewAddress_City");
    By addressTab= By.id("BillingNewAddress_Address1");
    By postcodeTab= By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTab= By.id("BillingNewAddress_PhoneNumber");

    public void clickOnComputerTab() {
        clickOnElement(computerMenuTab);
    }

    public void clickOnDesktopMenuTab() {
        clickOnElement(desktopMenuTab);
    }

    public void setSortByPositionTabZToA() {
        clickOnElement(sortByPositionTab);
        selectByVisibleTextFromDropDown(productOrderBy, "Name: Z to A");
    }

    public void setSortByPositionTabAToZ() {
        clickOnElement(sortByPositionTab);
        selectByVisibleTextFromDropDown(productOrderBy, "Name: A to Z");
    }

    public void setAddToCartBuildYourOwnComputer() {
        clickOnElement(addToCartBuildYourOwnComputer);
    }
    public String verifyBuildYourOwnComputerMessage() {
        return getTextFromElement(buildYourOwnComputerMessage);
    }

    public void selectIntelPentiumDualCoreE2200() {
        selectByVisibleTextFromDropDown(intelPentiumDualCoreE2200, "2.2 GHz Intel Pentium Dual-Core E2200");
    }
    public void selectRAM() {
        selectByVisibleTextFromDropDown(productAttribute2, "8GB [+$60.00]");
    }

    public void selectHDD() {
        clickOnElement(hDDRadio400GB);
    }
    public void selectVisaPremium() {
        clickOnElement(vistaPremium);
    }
    public void selectMicrosoftOffice() {
        clickOnElement(microsoftOfficeCheckBox);
    }
    public String verifyOrderTotal(){
        return getTextFromElement(orderTotalLink);
    }
    public void setAddToCardLink() {
        clickOnElement(addToCardLink);
    }
    public String verifyProductAddedToBasketSuccessMessage(){
        return getTextFromElement(productAddedToBasketSuccessMessage);
    }
    public void clickOnCrossButton() {
        clickOnElement(crossButton);
    }
    public void clickOnGoToCartButton() {
        mouseHoverToElementAndClick(goToCartButton);
        clickOnElement(goToCartButton);
    }
    public String verifyShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void changeQuantity(){
        clickOnElement(By.xpath("//input[@class='qty-input']"));
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
        clickOnElement(By.xpath("//button[@id='updatecart']"));
    }
    public void clickAgreeWithTheTermsOfService() {
        clickOnElement(agreeWithTheTermsOfService);
    }
    public void clickOnCheckoutTab() {
        clickOnElement(checkoutTab );
    }
    public String verifyWelcomePleaseSignOnMessage(){
        return getTextFromElement(welcomePleaseSignIn);
    }
    public void clickOnCheckoutAsGuestTab() {
        clickOnElement(checkoutAsGuestTab );
    }
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterEmail(String emailID){
        sendTextToElement(emailField, emailID);
    }
    public void clickAndSelectCountryOfResidence() {
        selectByVisibleTextFromDropDown(countyTab, "United Kingdom");
    }
    public void clickAndSelectCountryOfProvince() {
        selectByVisibleTextFromDropDown(provinceTab, "Other");
    }
    public void enterCity(String selectCity){
        sendTextToElement(cityTab, selectCity);
    }
    public void enterStreetAddress(String selectStreetAddress){
        sendTextToElement(addressTab, selectStreetAddress);
    }
    public void enterPostcode(String selectPostcode){
        sendTextToElement(postcodeTab, selectPostcode);
    }
    public void enterPhoneNumber(String selectPhoneNumber){
        sendTextToElement(phoneNumberTab, selectPhoneNumber);
    }
    By clickContinue = By.xpath("//button[@type='button' and @onclick='Billing.save()']");
    public void clickOnContinue(){
        clickOnElement(clickContinue);
    }
    By clickRadioButton = By.id("shippingoption_1");

    public void clickOOnRadioButton(){
        clickOnElement(clickRadioButton);

    }
    //  2.25 Click on “CONTINUE”
    By clickOnContinuee = By.xpath("//button[@type='button' and @onclick='ShippingMethod.save()']");

    public void clickOnContinuee(){
        clickOnElement(clickOnContinuee);
    }
    //  2.26 click Radio Button
    By radioButton = By.id("paymentmethod_1");
    public void clickOnButton(){
        clickOnElement(radioButton);
    }
    By selectCreditCard = By.xpath("//button[@type='button' and @onclick='PaymentMethod.save()']");

    public void selectCC(){
        clickOnElement(selectCreditCard);
    }
    //  2.27 Select “Master card” From Select credit card dropdown
    By selectMasterCard = By.id("CreditCardType");
    public void clickCardType(){
        clickOnElement(selectMasterCard);
    }
    By selectMC = By.id("CreditCardType");

    public void selectMasterC(String text) {
        selectByVisibleTextFromDropDown(selectMC, text);
    }
    //  2.28 Fill all the details
    By cardHolderName = By.id("CardholderName");

    public void selectCardHolderName(String text){
        sendTextToElement(cardHolderName,text);
    }
    By cardNumber = By.id("CardNumber");

    public void enterCardNumber(String text){
        sendTextToElement(cardNumber,text);
    }
    By expireMonth = By.id("ExpireMonth");

    public void  clickOnExpireMonth() {
        clickOnElement(expireMonth);
    }
    By selectExpireMonth = By.id("ExpireMonth");
    public void selecttExpireMonth(String text){
        selectByVisibleTextFromDropDown(selectExpireMonth,text);
    }
    By expireYear = By.id("ExpireYear");

    public void  clickOnExpireYear() {
        clickOnElement(expireYear);
    }
    By selectExpireYear = By.id("ExpireYear");
    public void selecttExpireYear(String text){
        selectByVisibleTextFromDropDown(selectExpireYear,text);
    }
    By cardCode = By.xpath("//input[@id='CardCode']");

    public void enterCardCode(String text){
        sendTextToElement(cardCode,text);
    }
    //  2.29 Click on “CONTINUE”
    By clickOOOnContinue = By.xpath("//button[contains(@class,'payment-info-next-step-button')]");

    public void clickOnContinueee(){
        clickOnElement(clickOOOnContinue);
    }
    //  2.30 Verify “Payment Method” is “Credit Card”
    By verifyMessage5 = By.xpath("//span[contains(text(),'Payment Method:')]");

    public String verifyMessageOne() {
        return getTextFromElement(verifyMessage5);
    }
    By verifyMessage6 = By.xpath("//span[contains(text(),'Credit Card')]");

    public String verifyMessageTwo() {
        return getTextFromElement(verifyMessage6);
    }
    //  2.31 Verify “Shipping Method” is “Next Day Air”
    By verifyMessage7 = By.xpath("//span[contains(text(),'Shipping Method:')]");

    public String verifyMessageThree() {
        return getTextFromElement(verifyMessage7);
    }
    By verifyMessage8 = By.xpath("//ul//li//span[contains(text(),'Next Day Air')]");

    public String verifyMessageFour() {
        return getTextFromElement(verifyMessage8);
    }
    //	2.32 Verify Total is “$2,950.00”
    By verifyMessage9 = By.xpath("//span//strong[contains(text(),'$2,950.00')]");

    public String verifyMessageFive() {
        return getTextFromElement(verifyMessage9);
    }
    //	2.33 Click on “CONFIRM”
    By clickonConfirm = By.xpath("//button[@type='button' and @onclick='ConfirmOrder.save()']");

    public void clickOnConfirm(){
        clickOnElement(clickonConfirm);
    }
    //	2.34 Verify the Text “Thank You”
    By verifyMessage10 = By.xpath("//h1[contains(text(),'Thank you')]");

    public String verifyMessageSix() {
        return getTextFromElement(verifyMessage10);
    }
    //	2.35 Verify the message “Your order has been successfully processed!”
    By verifyMessage11 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String verifyMessageSeven() {
        return getTextFromElement(verifyMessage11);
    }
    //	2.36 Click on “CONTINUE”

    By clickOnCon = By.xpath("//button[@type='button' and @onclick='setLocation(\"/\")']");

    public void clickOnConttinue(){
        clickOnElement(clickOnCon);

    }
    //  2.37 Verify the text “Welcome to our store”
    By verifyMessage12 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String verifyMessageEight() {
        return getTextFromElement(verifyMessage12);
    }




}