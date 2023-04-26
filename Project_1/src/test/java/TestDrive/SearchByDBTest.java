package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.HomePage;
import PageDrive.SearchByDBPage;

public class SearchByDBTest extends BaseClass {

	@Test
	public void SelectByDeptBrand() {

		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));

		SearchByDBPage Item = new SearchByDBPage(driver);
		Item.Card();
		Item.Checkout();
		Item.payment("rajr63803@gmail.com", "7010496037");
	}
}
