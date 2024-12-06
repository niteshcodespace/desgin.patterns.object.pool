package design.patterns.object.pool.without;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {

		test1();
		test2();
	}

	private static void test1() {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testleaf.com");
	}

	private static void test2() {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://google.com");
	}

}
