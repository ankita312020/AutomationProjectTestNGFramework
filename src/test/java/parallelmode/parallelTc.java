package parallelmode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.baseOne;

public class parallelTc extends baseOne{
	 @Test
     public void fff() {	 
         //Initializing the firefox driver (Gecko)
	    driver = new ChromeDriver();	  
	    driver.get("https://www.google.com"); 

	 
      }

     @Test
	public void fdf()
	{ 
	  //Initialize the chrome driver
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/"); }
	  
	  
	  @Test
		public void fdff()
		{ 
		  //Initialize the chrome driver
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/"); 
		  

}}
