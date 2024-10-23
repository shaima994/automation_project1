import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCase {
	
	//shaima atieh
	
	WebDriver driver = new ChromeDriver();
	
	String MyWebsite = "https://automationteststore.com/";
	String[] FirstName= {"Shaima", "Rama", "Tala", "Ahmad" , "Ali"};
	String[] LastName = {"Mohammad", "Rami", "Khaled", "ayman","Omar"};
	
	
	Random rand = new Random();
	
	
	String Password = "ILoveMyMom123!@#";
	
	
	@BeforeTest
	public void MySetUp() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get(MyWebsite);
		
	}
	
	@Test(priority = 1)
	public void SignUp() {
		
		int RandomIndexForTheFirstName = rand.nextInt(FirstName.length);
		int RandomIndexForTheLastName = rand.nextInt(LastName.length);
		
		String UserFirstName = FirstName[RandomIndexForTheFirstName];
		String UserLastName = LastName[RandomIndexForTheLastName];
	
		
		
		
		driver.findElement(By.linkText("Login or register")).click();
		
		WebElement SignUpButton = driver.findElement(By.xpath("//button[@title='Continue']"));
		SignUpButton.click();
		
		WebElement FirstNameInput = driver.findElement(By.id("AccountFrm_firstname"));
		FirstNameInput.sendKeys(UserFirstName);
		
		WebElement LastNameInput = driver.findElement(By.id("AccountFrm_lastname"));
		LastNameInput.sendKeys(UserLastName);
		
		
		
	
		
		
		
		
		
		
		
		
	}
	

}
