package com.nopcommerce.demo.saucedemo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage=new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktopMenuTab();
        computerPage.setSortByPositionTabZToA();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktopMenuTab();
        computerPage.setSortByPositionTabAToZ();
        Thread.sleep(1000);
        computerPage.setAddToCartBuildYourOwnComputer();
        String expectedText = "Build your own computer";
        String actualText = computerPage.verifyBuildYourOwnComputerMessage();
        Assert.assertEquals(actualText, expectedText, "No such message found");
        computerPage.selectIntelPentiumDualCoreE2200();
        computerPage.selectRAM();
        computerPage.selectHDD();
        computerPage.selectVisaPremium();
        computerPage.selectMicrosoftOffice();
        String expectedText1 = "$1,475.00";
        String actualText1 = computerPage.verifyOrderTotal();
        Assert.assertEquals(actualText1, expectedText1, "No such message found");
        computerPage.setAddToCardLink();
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = computerPage.verifyProductAddedToBasketSuccessMessage();
        Assert.assertEquals(actualText2, expectedText2, "No such message found");
        computerPage.clickOnCrossButton();
        computerPage.clickOnGoToCartButton();
        String expectedText3 = "Shopping cart";
        String actualText3 = computerPage.verifyShoppingCartMessage();
        Assert.assertEquals(actualText3, expectedText3, "No such message found");
        computerPage.changeQuantity();
        computerPage.clickAgreeWithTheTermsOfService();
        computerPage.clickOnCheckoutTab();
        String expectedText4 = "Welcome, Please Sign In!";
        String actualText4 = computerPage.verifyWelcomePleaseSignOnMessage();
        Assert.assertEquals(actualText4, expectedText4, "No such message found");
        computerPage.clickOnCheckoutAsGuestTab();
        computerPage.enterFirstName("ABC");
        computerPage.enterLastName("XYZ");
        computerPage.enterEmail("Abc1234@gmail.com");
        computerPage.clickAndSelectCountryOfResidence();
        computerPage.clickAndSelectCountryOfProvince();
        computerPage.enterCity("London");
        computerPage.enterStreetAddress("420 Prem nagar");
        computerPage.enterPostcode("OO11 2BH");
        computerPage.enterPhoneNumber("01234567890");
        computerPage.clickOnContinue();
        computerPage.clickOOnRadioButton();
        computerPage.clickOnContinuee();
        computerPage.clickOnButton();
        computerPage.selectCC();
        computerPage.clickCardType();
        computerPage.selectMasterC("Master card");
        computerPage.selectCardHolderName("MR A B Boss");
        computerPage.enterCardNumber("5299 4567 8901 2345");
        computerPage.clickOnExpireMonth();
        computerPage.selecttExpireMonth("04");
        computerPage.clickOnExpireYear();
        computerPage.selecttExpireYear("2026");
        computerPage.enterCardCode("859");
        computerPage.clickOnContinueee();
        String expectedText6 = "Credit Card";
        String actualText6 = computerPage.verifyMessageTwo();
        Assert.assertEquals(actualText6, expectedText6, "Message not displayed");
        String expectedText7= "Shipping Method:";
        String actualText7 = computerPage.verifyMessageThree();
        Assert.assertEquals(actualText7, expectedText7, "Message not displayed");
        String expectedText8 = "Next Day Air";
        String actualText8 = computerPage.verifyMessageFour();
        Assert.assertEquals(actualText8, expectedText8, "Message not displayed");
        String expectedText9 = "$2,950.00";
        String actualText9 = computerPage.verifyMessageFive();
        Assert.assertEquals(actualText9, expectedText9, "Message not displayed");
        computerPage.clickOnConfirm();
        String expectedText10 = "Thank you";
        String actualText10 = computerPage.verifyMessageSix();
        Assert.assertEquals(actualText10, expectedText10, "Message not displayed");
        String expectedText11 = "Your order has been successfully processed!";
        String actualText11 = computerPage.verifyMessageSeven();
        Assert.assertEquals(actualText11, expectedText11, "Message not displayed");
        computerPage.clickOnConttinue();
        String expectedText12 = "Welcome to our store";
        String actualText12 = computerPage.verifyMessageEight();
        Assert.assertEquals(actualText12, expectedText12, "Message not displayed");














    }
}
