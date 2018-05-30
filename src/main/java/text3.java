import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by Administrator on 2018-4-27.
 */
public class text3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\mvn\\mvn\\chromedriver.exe");
        WebDriver chrome=new ChromeDriver();
        //找到网页
        chrome.get("https://www.imooc.com/");
        //找到对应元素
        WebElement html=chrome.findElement(By.linkText("前端开发"));
        //点击操作
        html.click();
        //跳转到了新的窗口
        //获取所有的窗口
        Set<String> windowsHandles=chrome.getWindowHandles();
        for(String handle:windowsHandles){

//            System.out.println("获取到的每一个窗口："+handle);
            if(handle.equals(chrome.getWindowHandle())){
                continue;
            }
            //让驱动去找对应的窗口
            chrome.switchTo().window(handle);
        }

        //查找框架的对应元素，并点击
        WebElement kuangjia=chrome.findElement(By.linkText("框架"));
        //点击
        kuangjia.click();


    }
}
