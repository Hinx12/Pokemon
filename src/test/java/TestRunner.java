import org.junit.runner.JUnitCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestRunner {

	public static WebDriver driver;
	
	public void start() {
		JUnitCore.runClasses(TestOne.class, TestTwo.class);
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users//Admin//Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		TestRunner test = new TestRunner();
		test.start();
	}
}
