import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TestTwo {
	
	PlayPage playPage = PageFactory.initElements(TestRunner.driver, PlayPage.class);
	
	@Test
	public void Test2() throws InterruptedException {
		
		WebElement oak = TestRunner.driver.findElement(By.xpath("//*[@id=\"oakBody\"]/div/img"));
		
		while (!playPage.getRoute().equals("10/10") && !oak.isDisplayed()) {
			if (enemyAppears() == true) {
				playPage.getEnemy().click();
			}
		}
		((JavascriptExecutor)TestRunner.driver).executeScript("element.parentNode.removeChild(oak);");
		Thread.sleep(3000);
	}
	
	public boolean enemyAppears() {
		try {
			playPage.getEnemy().isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
