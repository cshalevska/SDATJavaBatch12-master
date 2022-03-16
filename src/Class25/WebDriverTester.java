package Class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] drivers = {new ChromeDriver(), new FireFox()};
        for (WebDriver driver : drivers) {
            driver.openBrowser();
            driver.closeBrowser();
            driver.maximizeWindow();
            driver.findElement();

        }
    }
}