package design.patterns.object.pool;

import java.util.LinkedList;
import java.util.Queue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleObjectPool {

	private Queue<WebDriver> driverQueue;

	public SimpleObjectPool() {
		driverQueue = new LinkedList<WebDriver>();
	}

	private WebDriver createDriver() {
		return new ChromeDriver();

	}

	// method --> create getDriver() to get driver for test from Queue

	public WebDriver getDriver() {
		if (!driverQueue.isEmpty()) {
			WebDriver driver = driverQueue.poll();
			System.out.println(driver.hashCode());
			return driver;
		} else {
			System.out.println("Creating new driver");
			return createDriver();
		}

	}
	// method - releaseDriver

	public void releaseDriver(WebDriver driver) {
		// put condition when I shoud not push
		if (driver != null) {
			driverQueue.offer(driver);
			System.out.println(driver.hashCode());
		}
	}

	// anything else
	public void closeAllDriver() {
		while (!driverQueue.isEmpty()) {
			driverQueue.poll().quit();
		}
	}
}
