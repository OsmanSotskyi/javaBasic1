package review10Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class polymorphismInRealLife {
    public static void main(String[] args) {
        // HOW IT LOOKS WITHOUT POLYMORPHISM

        ChromeDriver c = new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        FirefoxDriver f = new FirefoxDriver();
        f.manage().window().maximize();
        f.get("https://www.amazon.com");
        f.getTitle();

        EdgeDriver e =new EdgeDriver();
        e.manage().window().maximize();
        e.get("https://www.amazon.com");
        e.getTitle();

        // HOW IT LOOKS WITH POLYMORPHISM

        WebDriver [] webDrivers = {new ChromeDriver(), new FirefoxDriver(), new EdgeDriver()};
        for (int i = 0; i < webDrivers.length; i++) {
            WebDriver w = webDrivers[i];
            w.manage().window().maximize();
            w.get("https://www.amazon.com");
            System.out.println(w.getTitle());
            w.quit();
        }
    }
}
