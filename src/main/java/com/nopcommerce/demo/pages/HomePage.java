package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class HomePage extends Utility {

        By allTopMenuList = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

        public void selectMenu(String menu) {
            List<WebElement> topMenuList = driver.findElements(allTopMenuList);

            try {
                Iterator var3 = topMenuList.iterator();

                while(var3.hasNext()) {
                    WebElement element = (WebElement)var3.next();
                    if (element.getText().equalsIgnoreCase(menu)) {
                        element.click();
                    }
                }
            } catch (StaleElementReferenceException var5) {
                topMenuList = driver.findElements(allTopMenuList);
            }}}