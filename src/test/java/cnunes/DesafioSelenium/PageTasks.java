package cnunes.DesafioSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
	}
    
    @BeforeMethod
    public void openBrowser() {
    	driver.get("http://the-internet.herokuapp.com");
    }

    @Test(description="Desafio 1")
    public void desafioAddRemove() {
        driver.findElement(pageObject.addRemoveElementsLink).click();
        driver.findElement(pageObject.addElementbutton).click();
        
        assertEquals(driver.findElement(pageObject.deleteButton).getText(), "Delete");
    }
    
    @Test(description="Desafio 2")
    public void desafioSelect() {
    	driver.findElement(pageObject.dropDownLink).click();
    	Select selectObject = new Select(driver.findElement(pageObject.optionsSelectInput));
    	selectObject.selectByValue("2");
    	// assert/verify property 'selected'
    	System.out.println("option 2 selected: " + driver.findElement(pageObject.optionSelect("Option 2")).getAttribute("selected"));
    	assertEquals(driver.findElement(pageObject.optionSelect("Option 2")).getAttribute("selected"), "true");
    }
    
    @Test(description="Desafio 3")
    public void desafioKeyPress() {
    	String textToInput = "Ratatouille";
    	
    	driver.findElement(pageObject.keyPressesLink).click();
    	driver.findElement(pageObject.keyPressInput).sendKeys(textToInput);
    	
    	String outputParagraph = driver.findElement(pageObject.lastKeyOutput).getText();
    	assertEquals(outputParagraph.substring(outputParagraph.lastIndexOf(' ') + 1), textToInput.substring(textToInput.length() - 1).toUpperCase());
    }
    
    @AfterClass
    public void afterClass() {
    	driver.quit();
    }
    
}
