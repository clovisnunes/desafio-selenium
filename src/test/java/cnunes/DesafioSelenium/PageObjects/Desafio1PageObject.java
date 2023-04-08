package cnunes.DesafioSelenium.PageObjects;

import org.openqa.selenium.By;

public class Desafio1PageObject {
	
	// Desafio 1

    public By addRemoveElementsLink = By.xpath("//div/ul/li/a[contains(text(), 'Add/Remove Elements')]");
    public By addElementbutton = By.xpath("//div/button[contains(text(), 'Add Element')]");
    public By deleteButton = By.xpath("//div/button[contains(text(), 'Delete')]");

}
