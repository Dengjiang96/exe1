import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

/**
 * Created by Administrator on 2018-4-26.
 */
public class text1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\mvn\\mvn\\chromedriver.exe");
        WebDriver chrome=new ChromeDriver();
/*        chrome.get("http://mail.163.com/");
        chrome.manage().window().maximize();
        String url=chrome.getCurrentUrl();
        System.out.println("url===>"+url);
        String title=chrome.getTitle();
        System.out.println("title===>"+title);*/

        chrome.get("http://www.taobao.com");
        WebElement ele1=chrome.findElement(By.id("q"));
        Actions action=new Actions(chrome);
        Thread.sleep(2000);
        ele1.sendKeys("连衣裙");
        Thread.sleep(2000);
        ele1.submit();
        WebElement ele2=chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div[21]/div/div/div[1]/div[1]/div[1]/div/div[1]/a/img"));
        ele2.click();
       String diyi=chrome.getWindowHandle();
        System.out.println(diyi);
        Set<String> windowsHandles=chrome.getWindowHandles();
        for(String handle:windowsHandles){
            chrome.switchTo().window(handle);
        }

//        WebElement ele3=chrome.findElement(By.xpath("//*[@id=\"J_DetailMeta\"]/div[1]/div[1]/div/div[2]"));
//        System.out.println(ele3.getText());
        WebElement ele4=chrome.findElement(By.xpath("//*[@id=\"J_TabBar\"]"));
        ele4.click();
        String dier=chrome.getWindowHandle();
        System.out.println(dier);
        Thread.sleep(2000);
       Actions actions=new Actions(chrome);
        WebElement ele5=chrome.findElement(By.xpath("//*[@id=\"ald-skuRight\"]/div/div[2]/div/ul/li[1]/div/a/img"));
        actions.click(ele5).perform();

       /* WebElement ele4=chrome.findElement(By.xpath("/*//*[@id=\"ald-skuRight\"]/div/div[2]/div/ul/li[1]/div/a"));
        ele4.click();
        Set<String> windowsHandles1=chrome.getWindowHandles();
        for(String handle2:windowsHandles1){
            chrome.switchTo().window(handle2);
        }*/




     /*   chrome.get("https://www.jd.com");
        WebElement element=chrome.findElement(By.id("key"));
        element.sendKeys("华为配件", Keys.ENTER);
        Thread.sleep(2000);
        WebElement element1=chrome.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/div"));
        element1.click();*/











    }
}
