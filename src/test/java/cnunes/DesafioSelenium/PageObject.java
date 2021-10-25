package cnunes.DesafioSelenium;

import org.openqa.selenium.By;

public class PageObject {

    // Desafio 1

    By addRemoveElementsLink = By.xpath("//div/ul/li/a[contains(text(), 'Add/Remove Elements')]");
    By addElementbutton = By.xpath("//div/button[contains(text(), 'Add Element')]");
    By deleteButton = By.xpath("//div/button[contains(text(), 'Delete')]");

    // Desafio 2

    By dropDownLink = By.xpath("//div/ul/li/a[contains(text(), 'Dropdown')]");
    By optionsSelectInput = By.xpath("//h3[contains(text(), 'Dropdown List')]/../select");
    
    public By optionSelect(String visibleText) {
    	return By.xpath("//h3[contains(text(), 'Dropdown List')]/../select/option[text() ='" + visibleText + "']");
    }

    // Desafio 3

    By keyPressesLink = By.xpath("//div/ul/li/a[contains(text(), 'Key Presses')]");
    By keyPressInput = By.xpath("//div/form/input");
    By lastKeyOutput = By.xpath("//div/p[contains(text(), 'You entered:')]");
    
}