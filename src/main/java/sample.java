import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void BeforeClass() {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

}
	public void Afterclass() {
	System.out.println("Afterclass");
}
	public void BeforeMethod() {
	System.out.println("BeforeMethod");
}
	public void AfterMethod() {
	System.out.println("AfterMethod");

}
	public void Login() {
System.out.println("Login");
}
	public void payment() {
System.out.println("payment");


}

}
