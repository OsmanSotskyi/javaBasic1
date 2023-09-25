package GroupExercise2;

public interface WebDriver {
    void open();
    void close();
    String getTitle(String title);

}
interface RemoteWebDriver{
    void navigate();

}
interface TakeScreenShot{
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver,WebDriver{
    @Override
    public void open() {
        System.out.println("opening ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("closing ChromeDriver");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }

    @Override
    public void navigate() {

    }
}
class EdgeDriver implements RemoteWebDriver,WebDriver{
    @Override
    public void open() {
        System.out.println("opening EdgeDriver");
    }

    @Override
    public void close() {
        System.out.println("closing EdgeDriver");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }

    @Override
    public void navigate() {

    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new EdgeDriver()};
        for (WebDriver a:arr){
            a.close();
            a.open();
            a.getTitle("www.google.com");
        }
    }
}
