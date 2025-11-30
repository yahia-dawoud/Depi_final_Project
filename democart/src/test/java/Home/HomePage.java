package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    //information
    By TermsConditionsLocator = By.linkText("Terms & Conditions");
    By DeliveryInformationLocator = By.linkText("Delivery Information");
    By AboutUsLocator = By.linkText("About Us");
    By PrivacyPolicyLocator = By.linkText("Privacy Policy");
    //Customer service
    By ContactUsLocator = By.linkText("Contact Us");
    By ReturnsLocator = By.linkText("Returns");
    By SiteMapLocator = By.linkText("Site Map");
    //Extra
    By BrandsLocator = By.linkText("Brands");
    By GiftCertificationsLocator = By.linkText("Gift Certificates");
    By AffiliateLocator = By.linkText("Affiliate");
    By Specials = By.linkText("Specials");
    //Accounts very important
    By MyAccountLocator = By.linkText("My Account");
    By OrderHistoryLocator = By.linkText("Order History");
    By WishListLocator = By.linkText("Wish List");
    By NewsletterLocator = By.linkText("Newsletter");
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }



}
