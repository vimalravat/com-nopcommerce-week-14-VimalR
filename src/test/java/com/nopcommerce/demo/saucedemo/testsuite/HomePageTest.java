package com.nopcommerce.demo.saucedemo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
HomePage homePage= new HomePage();



    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Computers");
        homePage.selectMenu("Electronics");
        homePage.selectMenu("Apparel");
        homePage.selectMenu("Digital downloads");
        homePage.selectMenu("Books");
        homePage.selectMenu("Jewelry");
        homePage.selectMenu("Gift Cards");


    }
}
