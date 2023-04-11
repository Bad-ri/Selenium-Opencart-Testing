package TestCases;

import Base.edgeBrowser;
import Functions.ActionClass;
import Functions.JavaScriptClass;
import Pages.CategoryPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cart extends edgeBrowser {
    @Test
    public void ValidAddToCart() throws InterruptedException {
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();
        JavaScriptClass js = new JavaScriptClass();
        ActionClass action = new ActionClass();
        home.OpenHomePage();
        home.OpenCategory();
        category.ChooseProduct();
        js.ScrollByPixels(500);
        category.ChooseSize();
        action.scrollUp();
        category.ClickAddToCart();
        category.SwitchTab();
        category.CheckCart();
    }

}
