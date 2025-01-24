package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	private static WebDriver driver;

	public static WebDriver getDriver() {

		return td.get();
	}

	public static void intialize(String BrowserName ) {
		if (BrowserName.contains("Chrome")) {
			driver = new ChromeDriver();

		} else if (BrowserName.contains("FireFox")) {
			driver = new FirefoxDriver();
		}

		td.set(driver);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().get("https://ui.cogmento.com");
	}

}
