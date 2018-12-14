import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlayPage {
	
	@FindBy (id = "currentRoute")
	private WebElement route;
	
	@FindBy (id = "enemy")
	private WebElement enemy;

	
	public String getRoute() {
		return route.getAttribute("value");
	}
	
	public WebElement getEnemy() {
		return enemy;
	}
}
