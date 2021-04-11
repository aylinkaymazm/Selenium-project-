import org.openqa.selenium.By;

public class WebElementsConstants {
    public static By btn_login_icon = By.xpath("//div[@data-cy='header-user-menu']");
    public static By btn_login = By.cssSelector("[data-cy='header-login-button']");
    public static By input_userName = By.cssSelector("input[name='kullanici']");
    public static By input_password = By.cssSelector("input[name='sifre']");
    public static By btn_loginEnter = By.id("gg-login-enter");
    public static By text_userName = By.cssSelector("div[class='gekhq4-4 egoSnI']>span");
    public static By input_search = By.xpath("//input[@type='text']");
    public static By btn_search = By.cssSelector(".qjixn8-0.sc-1bydi5r-0.hKfdXF");
    public static By btn_secondPage = By.cssSelector("ul[class='clearfix'] [href='/arama/?k=Bilgisayar&sf=2']");
    public static By text_text_productPrice1= By.cssSelector("p[class='fiyat price-txt robotobold price']");
    public static By btn_productDetail = By.cssSelector("[class='catalog-view clearfix products-container']>:nth-child(1)");
    public static By btn_addToBasket = By.cssSelector("[id='purchaseSoldInfoActionButtons'] [id='add-to-basket']");
    public static By text_price2 = By.cssSelector("div[class='total-price']");
    public static By btn_add = By.cssSelector("option[value='2']");
    public static By text_totalAmount = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-child(1)");
    public static By btn_delete = By.cssSelector("a[title='Sil']");
    public static By text_basketControl = By.cssSelector("div[class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']>:nth-child(1)");

}
