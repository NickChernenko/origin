import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardRecentTab;
import pages.TopMenu;

public class DashBoardPageTests {

    private TopMenu topMenu = new TopMenu();
    private DashBoardRecentTab dashBoardRecentTab = new DashBoardRecentTab();

    @Test
    public void Verify_that_Recent_tab_is_open_by_default_when_Dashboard_page_opened() {
        topMenu.clickDashboardMenuItem();
        Assert.assertTrue(dashBoardRecentTab.isDisplayed());
    }

}