package cnunes.DesafioSelenium.PageObjects;

import org.openqa.selenium.By;

public class Desafio2PageObject {
	
	// Desafio 2

    public By dropDownLink = By.xpath("//div/ul/li/a[contains(text(), 'Dropdown')]");
    public By optionsSelectInput = By.xpath("//h3[contains(text(), 'Dropdown List')]/../select");
    
    public By optionSelect(String visibleText) {
    	return By.xpath("//h3[contains(text(), 'Dropdown List')]/../select/option[text() ='" + visibleText + "']");
    }

}
