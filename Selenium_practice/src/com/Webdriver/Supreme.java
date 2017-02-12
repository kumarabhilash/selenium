package com.Webdriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Supreme {

    public static void main(String[] args) throws Exception{
        long start = System.nanoTime();
        WebDriver driver = new FirefoxDriver();
/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        driver.get("http://www.supremenewyork.com/shop/hats/selassie-beanie/grey");
        WebElement add = driver.findElement(By.name("commit"));
        add.click();

        driver.get("https://www.supremenewyork.com/checkout");

        AccountInfo a = new AccountInfo();
        a = a.getAccount();

        WebElement name = driver.findElement(By.id("order_billing_name"));
        name.sendKeys(a.getName());

        WebElement email = driver.findElement(By.id("order_email"));
        email.sendKeys(a.getEmail());

        WebElement phone = driver.findElement(By.id("order_tel"));
        phone.sendKeys(a.getPhone());

        WebElement address1 = driver.findElement(By.id("order_billing_address"));
        address1.sendKeys(a.getAddress1());

        WebElement address2 = driver.findElement(By.id("order_billing_address_2"));
        address2.sendKeys(a.getAddress2());

        WebElement city = driver.findElement(By.id("order_billing_city"));
        city.sendKeys(a.getCity());

        WebElement zip = driver.findElement(By.id("order_billing_zip"));
        zip.sendKeys(a.getZip());

        Select state = new Select(driver.findElement(By.id("order_billing_state")));
        state.selectByVisibleText(a.getState());

        Select type = new Select(driver.findElement(By.id("credit_card_type")));
        type.selectByVisibleText(a.getType());

        WebElement credit = driver.findElement(By.id("credit_card_number"));
        credit.sendKeys(a.getCredit());

        Select creditmonth = new Select(driver.findElement(By.id("credit_card_month")));
        creditmonth.selectByVisibleText(a.getExpMonth());

        Select credityear = new Select(driver.findElement(By.id("credit_card_year")));
        credityear.selectByVisibleText(a.getExpYear());

        WebElement cvv = driver.findElement(By.id("credit_card_verification_value"));
        cvv.sendKeys(a.getCVV());

        List<WebElement> check = driver.findElements(By.className("iCheck-helper"));
        for(WebElement w : check){
            w.click();
        }

        WebElement process = driver.findElement(By.name("commit"));
        process.click();

*/    
    }
}