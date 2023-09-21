package class20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();

        SafariDriver safariDriver = new SafariDriver();
        safariDriver.manage().window().maximize();
        Thread.sleep(2000);
        safariDriver.navigate().to("https://google.com");
        System.out.println(safariDriver.getTitle());
        Thread.sleep(2000);
        safariDriver.navigate().to("https://facebook.com");
        System.out.println(safariDriver.getTitle());
        Thread.sleep(2000);
        safariDriver.navigate().to("https://amazon.com");
        System.out.println(safariDriver.getTitle());
        Thread.sleep(2000);
        safariDriver.navigate().back();
        safariDriver.close();
    }
}
