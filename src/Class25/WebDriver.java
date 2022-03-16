package Class25;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(),
    maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println(" Maximize the Chrome Browser");
}

    @Override
    public void findElement() {
        System.out.println("Find the Elements using the Crome Browser");
    }
}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println(" Maximize the FireFox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println(" Maximize the FireFox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the Elements using the FireFox Browser");
    }
}