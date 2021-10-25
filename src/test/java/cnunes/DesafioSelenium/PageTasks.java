package cnunes.DesafioSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PageTasks {
	
	WebDriver driver;
	
	public static PageObject pageObject = new PageObject();
    

    @BeforeTest
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
    	
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--incognito");
    	options.addArguments("start-maximized");
    	
    	driver = new ChromeDriver(options);
	}
    
    @BeforeMethod
    public void openBrowser() {
    	driver.get("http://the-internet.herokuapp.com");
    }

    @Test(description="Desafio 1")
    public void desafioAddRemove() {
        driver.findElement(pageObject.addRemoveElementsLink).click();
        driver.findElement(pageObject.addElementbutton).click();
        
        String labelEncontrado = driver.findElement(pageObject.deleteButton).getText();
        String expectedLabel = "Delete";
        assertEquals(labelEncontrado, expectedLabel,
        		"O label do botão criado não é '" + expectedLabel + "', label atual: '" + labelEncontrado + "'.");
    }
    
    @Test(description="Desafio 2")
    public void desafioSelect() {
    	driver.findElement(pageObject.dropDownLink).click();
    	Select selectObject = new Select(driver.findElement(pageObject.optionsSelectInput));
    	selectObject.selectByValue("2");
    	
    	String isSelected = driver.findElement(pageObject.optionSelect("Option 2")).getAttribute("selected");
    	assertEquals(isSelected, "true",
    			"A opção selecionada não reflete o texto visível no select. Texto visível esperado: 'Option 2'.");
    }
    
    @Test(description="Desafio 3")
    public void desafioKeyPress() {
    	String textToInput = "Ratatouille";
    	
    	driver.findElement(pageObject.keyPressesLink).click();
    	driver.findElement(pageObject.keyPressInput).sendKeys(textToInput);
    	
    	String outputParagraph = driver.findElement(pageObject.lastKeyOutput).getText();
    	String lastKey = outputParagraph.substring(outputParagraph.lastIndexOf(' ') + 1);
    	String expectedLast = textToInput.substring(textToInput.length() - 1).toUpperCase();
    	
    	assertEquals(lastKey, expectedLast,
    			"O retorno da última tecla digitada não confere com o texto informado, "
    			+ "texto informado: " + textToInput + 
    			", última letra do texto informado: " + expectedLast + 
    			", útlima letra retornada: " + lastKey + ".");
    }
    
    @AfterClass
    public void afterClass() {
    	driver.quit();
    }
    
}
