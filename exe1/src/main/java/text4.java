import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018-4-27.
 */
public class text4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\mvn\\mvn\\chromedriver.exe");
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.tmall.com");
        //点击登录
        WebElement plase=chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/p/a[1]"));
        plase.click();
        chrome.switchTo().frame("J_loginIframe");
        chrome.findElement(By.linkText("密码登录")).click();

    }
}
