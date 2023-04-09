package cnunes.DesafioSelenium.PageTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cnunes.DesafioSelenium.PageObjects.Desafio3PageObject;

import static org.testng.Assert.assertEquals;

public class Desafio3PageTask {
	
	WebDriver driver;
	
	public static Desafio3PageObject pageObject = new Desafio3PageObject();
    

    @BeforeTest
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", "../../selenium_drivers/chromedriver");
    	
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--incognito");
    	options.addArguments("start-maximized");
    	
    	driver = new ChromeDriver(options);
	}
    
    @BeforeMethod
    public void openBrowser() {
    	driver.get("http://the-internet.herokuapp.com");
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