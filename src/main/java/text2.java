import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Administrator on 2018-4-27.
 */
public class text2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\mvn\\mvn\\chromedriver.exe");
        WebDriver chrome=new ChromeDriver();
        chrome.get("F:\\123\\Sublime Text 3\\save\\xiala.html");
        WebElement element=chrome.findElement(By.id("job"));
        //导包，实例化一个下拉框
        Select select=new Select(element);
        //通过text来找对应元素
        Thread.sleep(2000);
//        select.selectByVisibleText("前段工程师");
        Thread.sleep(2000);
        //通过value值
//        select.selectByValue("3");
        Thread.sleep(2000);
        //通过index获取(从0开始)
        select.selectByIndex(2);
        //deselsct针对的是多选框
        System.out.println(select.isMultiple());


        //获取多选选项的值
        System.out.println("获取选项的值为："+select.getFirstSelectedOption());

        System.out.println("获取指定选项的值为："+select.getOptions().get(4).getText());

        List<WebElement> options=select.getAllSelectedOptions();

        for(WebElement option:options){
            System.out.println("获取得到的所有选项为："+options);
        }
        System.out.println("集合中的所有选项的个数为："+options.size());

    }
}
