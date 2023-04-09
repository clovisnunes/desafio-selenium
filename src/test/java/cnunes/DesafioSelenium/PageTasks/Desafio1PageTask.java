package cnunes.DesafioSelenium.PageTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cnunes.DesafioSelenium.PageObjects.Desafio1PageObject;

import static org.testng.Assert.assertEquals;

public class Desafio1PageTask {
	
	WebDriver driver;
	
	public static Desafio1PageObject pageObject = new Desafio1PageObject();
    

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

    @Test(description="Desafio 1")
    public void desafioAddRemove() {
        driver.findElement(pageObject.addRemoveElementsLink).click();
        driver.findElement(pageObject.addElementbutton).click();
        
        String labelEncontrado = driver.findElement(pageObject.deleteButton).getText();
        String expectedLabel = "Delete";
        assertEquals(labelEncontrado, expectedLabel,
        		"O label do botão criado não é '" + expectedLabel + "', label atual: '" + labelEncontrado + "'.");
    }
    
    @AfterClass
    public void afterClass() {
    	driver.quit();
    }
}