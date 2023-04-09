package cnunes.DesafioSelenium.PageTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cnunes.DesafioSelenium.PageObjects.Desafio2PageObject;

import static org.testng.Assert.assertEquals;

public class Desafio2PageTask {
	
	WebDriver driver;
	
	public static Desafio2PageObject pageObject = new Desafio2PageObject();
    

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

    @Test(description="Desafio 2")
    public void desafioSelect() {
    	driver.findElement(pageObject.dropDownLink).click();
    	Select selectObject = new Select(driver.findElement(pageObject.optionsSelectInput));
    	selectObject.selectByValue("2");
    	
    	String isSelected = driver.findElement(pageObject.optionSelect("Option 2")).getAttribute("selected");
    	assertEquals(isSelected, "true",
    			"A opção selecionada não reflete o texto visível no select. Texto visível esperado: 'Option 2'.");
    }
    
    @AfterClass
    public void afterClass() {
    	driver.quit();
    }
}