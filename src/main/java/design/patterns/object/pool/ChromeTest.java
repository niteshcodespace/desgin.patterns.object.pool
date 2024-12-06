package design.patterns.object.pool;

import org.openqa.selenium.WebDriver;


public class ChromeTest {
	static SimpleObjectPool drivers ;

	public static void main(String[] args) {
		drivers = new SimpleObjectPool();
		test1();
		test2();
	}

	private static void test1() {
		//SimpleObjectPool drivers = new SimpleObjectPool();
		WebDriver driver = drivers.getDriver();
		driver.get("https://google.com");
		drivers.releaseDriver(driver);
	}

	private static void test2() {
	//	SimpleObjectPool drivers = new SimpleObjectPool();
		WebDriver driver = drivers.getDriver();
		driver.get("https://testleaf.com");
		drivers.releaseDriver(driver);

	}

}