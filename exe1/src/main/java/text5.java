import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Administrator on 2018-4-27.
 */
public class text5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","F:\\mvn\\mvn\\geckodriver.exe");
        WebDriver chrome=new FirefoxDriver();
        chrome.get("http://mail.163.com/");
        chrome.manage().window().maximize();
        String url=chrome.getCurrentUrl();
        System.out.println("url===>"+url);
        String title=chrome.getTitle();
        System.out.println("title===>"+title);
//        WebElement ele=chrome.findElement();
    }
}
