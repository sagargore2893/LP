package com.silicus.LampsPlus.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.silicus.LampsPlus.CommonMethods.BaseTest;
import com.silicus.LampsPlus.Pagelibrary.HomePage;

public class HomepageTest extends BaseTest {
	HomePage homepage;
	

	@BeforeTest
	public void SetUp() throws InterruptedException, IOException {
		setDriver();
	}

	@Test(priority = 0)
	public void To_test_homepage_loads_correctly() {
		Assert.assertEquals("Home Lighting - Fixtures, Lamps & More Online | Lamps Plus", driver.getTitle());
		driver.close();
	}

	@Test(priority = 1)
	public void To_Verify_all_links_or_image() {
		try {
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println("Total anchor links:" + allLinks.size());
			for (int i = 0; i <= allLinks.size(); i++) {
				System.out.println(allLinks.get(i).getText().trim());
				allLinks.get(i).isEnabled();
				// System.out.println(driver.getCurrentUrl());
				// driver.navigate().to("https://www.lampsplus.com");
			}
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		driver.close();
	}

}
