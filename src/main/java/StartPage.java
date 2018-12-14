import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage {
	
	@FindBy (id = "Charmander")
	private WebElement pokemon;
	
	@FindBy (id = "startAdventure")
	private WebElement start;
	
	public void start() {
		pokemon.click();
		start.click();
	}

}
