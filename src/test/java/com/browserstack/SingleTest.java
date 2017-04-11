package com.browserstack;


import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.*;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class SingleTest extends BrowserStackTest {

	@Test
	public void test() throws Exception {

		open("http://www.google.com");
		$(By.name("q")).setValue("HelloWorld!!").pressEnter();
		sleep(2000);
		assertEquals(title(), "HelloWorld!! - Google zoeken");
	}
}