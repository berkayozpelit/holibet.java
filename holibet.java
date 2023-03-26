$ ls
Procfile pom.xml src

$ echo "java.runtime.version=1.8" > system.properties

$ git add system.properties && git commit -m "Java 8"

$ git push heroku main
...
-----> Java app detected
-----> Installing OpenJDK 1.8... done
-----> Installing Maven 3.3.3... done
...
    java.runtime.version=1.8
maven.version=3.3.9
    $ heroku config:set MAVEN_CUSTOM_GOALS="clean package"
$ heroku config:set MAVEN_CUSTOM_OPTS="--update-snapshots -DskipTests=true"
$ heroku config:set MAVEN_JAVA_OPTS="-Xss2g"
    # Create a new Heroku app that uses your buildpack
heroku create --buildpack <your-github-url>

# Configure an existing Heroku app to use your buildpack
heroku buildpacks:set <your-github-url>

# You can also use a git branch!
heroku buildpacks:set <your-github-url>#your-branch
for DIR in ".m2" ".maven" ; do
  cp -r $CACHE_DIR/$DIR $BUILD_DIR/$DIR
done
$ heroku run bash
$ ls -al
$ circleci local execute --job hatchet-heroku-18 \
    --env HEROKU_API_USER=$(heroku whoami) \
    --env HEROKU_API_KEY=$(heroku auth:token)
public class Main {
    public static class actionClass {
        public static void main(String[] args) throws InterruptedException, IOException {
            System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            int i;
            String site = "https://www.holiganbet822.com/tr/sports/i/spor/y%C3%BCksek-oran/101/d%C3%BCnya/240/lokasyon";
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://web.whatsapp.com/");
            Thread.sleep(20000);
            driver.get("https://chat.whatsapp.com/LZiGLBMGzTR5hACXCEESoU");
            Thread.sleep(1000);
            WebElement btnse = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("x")));
            btnse.click();
            Thread.sleep(1000);
            WebElement btnseq = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("x")));
            btnseq.click();
            String mainWindow = driver.getWindowHandle();
            Thread.sleep(3000);
            try {
            String URL = site;
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.open('" + URL + "')");
            Set<String> allWindows = driver.getWindowHandles();
            for (String currentWindow : allWindows) {
                driver.switchTo().window(currentWindow);
                if (!currentWindow.equals(mainWindow)) {
                    break;
                }
            }
            String refsayisi1q1 = "qs";
            String refsayisi1q1s = null;
                String holi = "null";
                try
            {
            driver.get(site);
            holi = driver.getWindowHandle();
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("x")).getText();
                WebElement elements = driver.findElement(By.xpath("x"));
                Actions builders = new Actions(driver);
                builders.moveToElement(elements).perform();
                String refsayisi1qs = elements.getText();
                System.out.println(refsayisi1qs);
                WebElement element1s = driver.findElement(By.xpath("x"));
                Actions builder1s = new Actions(driver);
                builder1s.moveToElement(element1s).perform();
                refsayisi1q1s = element1s.getText();
            }
            catch (Exception e )
            {
            }
            while (true) {
                driver.manage().window().maximize();
                try {
                    driver.get(site);
                    driver.switchTo().frame(0);
                    driver.findElement(By.xpath("x")).getText();
                        WebElement element = driver.findElement(By.xpath("x"));
                        Actions builder = new Actions(driver);
                        builder.moveToElement(element).perform();
                        String refsayisi1q = element.getText();
                        System.out.println(refsayisi1q);
                        WebElement element1 = driver.findElement(By.xpath("x"));
                        Actions builder1 = new Actions(driver);
                        builder1.moveToElement(element1).perform();
                        refsayisi1q1 = element1.getText();
                    if (Objects.equals(refsayisi1q1, refsayisi1q1s))
                    {
                        System.out.println("Aynı");
                    }
                    else {
                        driver.switchTo().window(mainWindow);
                        Thread.sleep(1000);
                        WebElement btn111113q = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("x")));
                        btn111113q.click();
                        System.out.println("3");
                        Thread.sleep(1000);
                        WebElement btn1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("x")));
                        btn1.sendKeys( refsayisi1q1);
                        Thread.sleep(1000);
                        WebElement btn111113 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("x")));
                        btn111113.click();
                        Thread.sleep(1000);
                        driver.switchTo().window(holi);
                        driver.get(site);
                        holi = driver.getWindowHandle();
                        driver.switchTo().frame(0);
                        driver.findElement(By.xpath("/x")).getText();
                            WebElement elements = driver.findElement(By.xpath("x"));
                            Actions builders = new Actions(driver);
                            builders.moveToElement(elements).perform();
                            String refsayisi1qs = elements.getText();
                            System.out.println(refsayisi1qs);
                            WebElement element1s = driver.findElement(By.xpath("x"));
                            Actions builder1s = new Actions(driver);
                            builder1s.moveToElement(element1s).perform();
                            refsayisi1q1s = element1s.getText();
                    }
                }
                catch (Exception e )
                {
                }
            }
        }
                catch (Exception e )
        {
        }
        }
    }
}
