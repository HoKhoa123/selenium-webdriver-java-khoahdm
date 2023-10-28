package BAITAP;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase05 {
    @Test
    public void tc05() {
        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\118.0.5993.118");
//
//        // Create a new instance of the ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//         1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();

        // Step 1: Go to the website
        driver.get("http://live.techpanda.org/");

        // Step 2: Click on "MOBILE" menu
        WebElement mobileMenu = driver.findElement(By.linkText("MOBILE"));
        mobileMenu.click();

        // Step 3: Click on ACCOUNT
        WebElement accountMenu = driver.findElement(By.cssSelector(".account-cart-wrapper .label"));
        accountMenu.click();

        //Step 4: Click on Register
        WebElement registerMenu = driver.findElement(By.cssSelector("a[title='Register']"));
        registerMenu.click();

        //Step 5: Input fields
        WebElement firstName = driver.findElement(By.cssSelector("#firstname"));
        firstName.click();
        firstName.sendKeys("Khoa");

        WebElement middleName = driver.findElement(By.cssSelector("#middlename"));
        middleName.click();
        middleName.sendKeys("Doan Minh");

        WebElement lastName = driver.findElement(By.cssSelector("#lastname"));
        lastName.click();
        lastName.sendKeys("Ho");

        WebElement emailAddress = driver.findElement(By.cssSelector("#email_address"));
        emailAddress.click();
        emailAddress.sendKeys("khoa9@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.click();
        password.sendKeys("khoa0123");

        WebElement confirmPassword = driver.findElement(By.cssSelector("#confirmation"));
        confirmPassword.click();
        confirmPassword.sendKeys("khoa0123");

        //Step 6: Click on REGISTER
        WebElement Register = driver.findElement(By.cssSelector("button[title='Register']"));
        Register.click();

        //Step 7: Click on TV
        WebElement tvMenu = driver.findElement(By.linkText("TV"));
        tvMenu.click();

        try {
            Thread.sleep(2000); // Độ trễ 10 giây (10.000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Step 8: Click on Add To Wishlist
        WebElement wishList = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
        wishList.click();

        try {
            Thread.sleep(2000); // Độ trễ 10 giây (10.000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Step 9: Click on Share WishList
        WebElement shareWishList = driver.findElement(By.cssSelector("button[title='Share Wishlist']"));
        shareWishList.click();

        try {
            Thread.sleep(2000); // Độ trễ 10 giây (10.000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Step 10: Input shared Email
        WebElement sharedEmail = driver.findElement(By.cssSelector("#email_address"));
        sharedEmail.click();
        sharedEmail.sendKeys("khoa@gmail.com");

        try {
            Thread.sleep(2000); // Độ trễ 10 giây (10.000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Step 11: Input message
        WebElement sharedMessage = driver.findElement(By.cssSelector("#message"));
        sharedMessage.click();
        sharedMessage.sendKeys("Good luck!!!");

        try {
            Thread.sleep(2000); // Độ trễ 10 giây (10.000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Step 12: Share WishList
        WebElement share = driver.findElement(By.cssSelector("button[title='Share Wishlist']"));
        share.click();

        //Step 13: Check
        WebElement successMessageElement = driver.findElement(By.cssSelector("li[class='success-msg'] ul li span"));
        String successMessage = successMessageElement.getText();
        String expectedMessage = "Your Wishlist has been shared.";

        if (successMessage.equals(expectedMessage)) {
            System.out.println("Wishlist shared successfully.");
        } else {
            System.out.println("Failed to share wishlist.");
        }

        try {
            Thread.sleep(2000); // Độ trễ 10 giây (10.000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Quit
        driver.quit();
    }
}
