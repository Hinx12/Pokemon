import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class TestOne {
	
	@Test
	public void test1() {
		
		TestRunner.driver.manage().window().maximize();
		TestRunner.driver.get("http://ishadijcks.github.io/");
		StartPage startPage = PageFactory.initElements(TestRunner.driver, StartPage.class);
		startPage.start();
	}
}
