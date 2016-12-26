package Java1;

//import java.sql.Driver;
//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.*;
//import Test3.Actions;
//import Test3.WebElement;

public class Java1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/sameer/Downloads/usr/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
         
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("sweater");
		search.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.findElement(By.linkText("Baby")).click();
		
		WebElement cart = driver.findElement(By.id("nav-cart-count"));
		cart.click();
		driver.close();		
		//WebElement temp = driver.findElement(By.xpath("//a[@class='a-link-normal s-access-detail-page  a-text-normal']"));
			//WebElement temp = driver.findElement(By.linkText("Leebonee Acrylic Men's Full Sleeve Sweater"));
		//temp.click();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS.15000);
		//driver.findElement(By.className("vh79eN")).click();
		//driver.findElement(By.cssSelector("a[href*='/s/ref=sr_nr_n_0?fst=as%3Aoff&rh=n%3A1571271031%2Ck%3Asweater%2Cn%3A%211571272031%2Cn%3A1968024031&bbn=1571272031&keywords=sweater&ie=UTF8&qid=1482099621&rnid=1571272031']")).click();
		//href="/s/ref=sr_nr_n_0?fst=as%3Aoff&rh=n%3A1571271031%2Ck%3Asweater%2Cn%3A%211571272031%2Cn%3A1968024031&bbn=1571272031&keywords=sweater&ie=UTF8&qid=1482099621&rnid=1571272031"
		/*driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		 WebElement ele=driver.findElement(By.tagName("Alan Jones Solid Zipper Hooded Sweatshirt"));
		    Actions act=new Actions(driver);
		    //Thread.sleep(5000);
		    act.moveToElement(ele).perform();*/
		//driver.findElement(By.xpath("//a[text()='Alan Jones Solid Zipper Hooded Sweatshirt']")).click();
		//List<WebElement> list = driver.findElements(By.linkText(" Alan Jones Solid Zipper Hooded Sweatshirt"));
		//list.get(1).click();
		//WebElement select = driver.findElement(By.linkText("Alan Jones Solid Zipper Hooded Sweatshirt"));
		//select.sendKeys(Keys.ENTER);
//Driver.findElement(By.className("vh79eN")).click();

		
		//		   driver.findElement(By.xpath("//*[@data-reactid='48]")).click();
		//	System.out.println(driver.getTitle());
		 //WebElement email= driver.findElement(By.id("email"));
	       // Actions builder = new Actions(driver);
	        //Actions seriesOfActions = builder.moveToElement(email).click().sendKeys(email, "sameeruddeen_7@yahoo.com");
	       // seriesOfActions.perform();
			

	}

}
