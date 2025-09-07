package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.navigation;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigation() {
        navigation navigation = new navigation(driver);

        navigation.navigateTo("home");
        navigation.navigateTo("library");
        navigation.navigateTo("enviroanalysis");
        navigation.navigateTo("floracheck");
        navigation.navigateTo("chatbot");
        navigation.navigateTo("aboutus");
        navigation.navigateTo("contactus");
    }
}

