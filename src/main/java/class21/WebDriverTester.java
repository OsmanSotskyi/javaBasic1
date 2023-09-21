package class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] arr = {new ChromeDriver(),new FireFoxDriver()};
        for (WebDriver wb: arr) {
            wb.openBrowser();
            wb.loadURL("Amazon.com");
            wb.performTesting();
            wb.close();
        }
    }
}
