package com.nopcommerce.demo.saucedemo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.nopcommerce.demo.pages.ElectronicsPage.getAlphaNumericString;

public class ElectronicsPageTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronicsPage.hoverOnElectronicsTab();
        electronicsPage.hoverOnElectronicsTabAndClickCellPhones();
        String expectedText = "Cell phones";
        String actualText = electronicsPage.verifyTextCellPhonesText();
        Assert.assertEquals(actualText, expectedText, "Such text not displayed");

    }
@Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronicsPage.hoverOnElectronicsTab();
        electronicsPage.hoverOnElectronicsTabAndClickCellPhones();
        String expectedText = "Cell phones";
        String actualText = electronicsPage.verifyTextCellPhonesText();
        Assert.assertEquals(actualText, expectedText, "Such text not displayed");
        electronicsPage.listView();
        electronicsPage.clickOnNokiaLumiaTab();
        String expectedMessage2 = "Nokia Lumia 1020";
        Assert.assertEquals(electronicsPage.verifyNokiaLumiaText(), expectedMessage2, "Message is not displayed");
        String expectedMessage3 = "$349.00";
        Assert.assertEquals(electronicsPage.verifyAmountText1$349(), expectedMessage3, "Message is not displayed");
        electronicsPage.changeQuantityTo2();
        electronicsPage.clickOnAddToCart();
        String expectedMessage4 = "The product has been added to your shopping cart";
        Assert.assertEquals(electronicsPage.verifyTheProductHasBeenAddedText(), expectedMessage4, "Message is not displayed");
        electronicsPage.closeButton();
        electronicsPage.clickOnShoppingCart();
        String expectedMessage5 = "Shopping cart";
        Assert.assertEquals(electronicsPage.verifyShoppingCartText(), expectedMessage5);
        String expectedMessage6 = "$698.00";
        Assert.assertEquals(electronicsPage.verifyBasketTotal$698(), expectedMessage6);
        electronicsPage.verifyCheckBox();
        electronicsPage.checkOut();
        String expectedMessage7 = "Welcome, Please Sign In!";
        Assert.assertEquals(electronicsPage.verifyWelcomePleaseSignInMessage(), expectedMessage7);
        electronicsPage.verifyRegisterTabText();
        String expectedMessage8 = "Register";
        Assert.assertEquals(electronicsPage.verifyRegisterText(), expectedMessage8);
        electronicsPage.clickOnRadioButtonLink();
        electronicsPage.enterFirstname("ABCD");
        electronicsPage.enterLastname("XYZF");
        electronicsPage.enterEmailInEmailField("prime" + getAlphaNumericString(4) + "@gmail.com");
        electronicsPage.enterPassword("Abcd123456");
        electronicsPage.enterConfirmPassword("Abcd123456");
        Thread.sleep(500);
        electronicsPage.clickOnRegisterTab();
        String expectedText0 = "Your registration completed";
        String actualText0 = electronicsPage.verifyRegistrationCompletedMessage();
        Assert.assertEquals(actualText0, expectedText0, "Message not displayed");
        electronicsPage.clickOnContinueTabWithRegisterLink();
        String expectedMessage10 = "Shopping cart";
        Assert.assertEquals(electronicsPage.verifyShoppingCartText1(), expectedMessage10);
        electronicsPage.clickOnCheckBox();
        electronicsPage.clickCheckOutTab();
        Thread.sleep(1000);
        electronicsPage.enterCountry("United Kingdom");
        electronicsPage.enterCity("London");
        electronicsPage.enterAddressInTab("12 ABCD Lane");
        electronicsPage.enterPostCodeInFiled("AB12 3CD");
        electronicsPage.enterPhoneNumberInField("0700400700");
        electronicsPage.continue3();
        electronicsPage.setRadioButton();
        electronicsPage.clickOnContinueButtonShippingMethod();
        electronicsPage.setRadiobutton2();
        electronicsPage.paymentMethodTab();
        electronicsPage.selectCreditCard("Visa");
        electronicsPage.enterCardHolderName("xyz");
        electronicsPage.enterCardNumber("3252 7814 7648 5333");
        electronicsPage.enterExpireMonth("01");
        electronicsPage.enterExpireYear("2030");
        electronicsPage.enterSecurityCode("111");
        electronicsPage.clickOnContinueToCheckOut();
        String expectedText1 = "Credit Card";
        String actualText1 = electronicsPage.verifyMessage1();
        Assert.assertEquals(actualText1, expectedText1, "Message not displayed");
        String expectedText2 = "2nd Day Air";
        String actualText2 = electronicsPage.verifyMessage2();
        Assert.assertEquals(actualText2, expectedText2, "Message not displayed");
        String expectedText3 = "$698.00";
        String actualText3 = electronicsPage.verifyMessage3();
        Assert.assertEquals(actualText3, expectedText3, "Message not displayed");
        electronicsPage.clickOnConfirm();
        String expectedText4 = "Thank you";
        String actualText4 = electronicsPage.verifyMessage4();
        Assert.assertEquals(actualText4, expectedText4, "Message not displayed");
        String expectedText5 = "Your order has been successfully processed!";
        String actualText5 = electronicsPage.verifyMessage5();
        Assert.assertEquals(actualText5, expectedText5, "Message not displayed");
        electronicsPage.clickOnContinue();
        electronicsPage.clickOnLogOut();
        String Url = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.nopcommerce.com/",Url);

    }

}
