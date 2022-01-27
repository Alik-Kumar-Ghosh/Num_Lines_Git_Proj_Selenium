import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import static java.lang.Thread.sleep;


public class Num_Code {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter GitHub Project Link : ");
        String web= sc.next();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(web);
        try{
            System.out.println("processing link");;
            //System.out.println("done till here 1");
            // WebElement in = driver.findElement(By.className("hrTbp "));
            WebElement ck1 = driver.findElement(By.id("insights-tab"));
            ck1.click();
            sleep(700);
            WebElement ck2 = driver.findElement(By.linkText("Contributors"));
            ck2.click();
            sleep(3000);
            WebElement e = driver.findElement(By.xpath("//div[@id='contributors']/ol/li/span/h3/span[2]/span/div/span"));
            String nums=e.getText();
            nums=nums.replace("+","");
            System.out.println("Total no. of lines of codes : " +  nums );
            driver.close();
            //String text = el.getAttribute("color-fg-success");
            //System.out.println("done till last "+el);
            // WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            //  System.out.println(firstResult.getAttribute("textContent"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
