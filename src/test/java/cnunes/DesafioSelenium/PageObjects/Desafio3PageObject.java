package cnunes.DesafioSelenium.PageObjects;

import org.openqa.selenium.By;

public class Desafio3PageObject {
	
	// Desafio 3

    public By keyPressesLink = By.xpath("//div/ul/li/a[contains(text(), 'Key Presses')]");
    public By keyPressInput = By.xpath("//div/form/input");
    public By lastKeyOutput = By.xpath("//div/p[contains(text(), 'You entered:')]");

}
