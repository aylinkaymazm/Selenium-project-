import org.openqa.selenium.JavascriptExecutor;

public class TestSteps extends BaseMethods {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void anasayfa() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://www.gittigidiyor.com/";

        if (mainPageUrl.equals(mainPageUrlC)) {
            logger.info("Anasayfadasınız");
        } else {
            logger.info("Giriş yapamadınız.");
        }

    }

    public void giris() throws InterruptedException {
        clickToElement(WebElementsConstants.btn_login_icon);
        Thread.sleep(3000);
        clickToElement(WebElementsConstants.btn_login);
        findElement(WebElementsConstants.input_userName).sendKeys("aylinkaymazm@gmail.com");
        findElement(WebElementsConstants.input_password).sendKeys("123456789a");
        clickToElement(WebElementsConstants.btn_loginEnter);
        String loginTest = findElement(WebElementsConstants.text_userName).getText();

        if (loginTest.equals("aylinkaymaz843412")) {
            logger.info("Giriş yaptınız.");
        } else {
            logger.info("Giriş işlemi başarısız oldu.");
        }

    }

    public void ara(){
        findElement(WebElementsConstants.input_search).sendKeys("Bilgisayar");
        clickToElement(WebElementsConstants.btn_search);
    }

    public void ikinciSayfa() {
        jse.executeScript("window.scrollBy(0,9000)");
        //clickToElement(WebElementsConstants.btn_secondPage);

        String secondPageUrl = "https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2";
        String secondPageC = getUrl();

        if(secondPageC.equals(secondPageUrl)){
           logger.info("2. sayfadasınız");
        }else{
           logger.info("Sayfa geçişi başarısız oldu.");
        }

    }


    public void sepeteEkle() throws InterruptedException {
        String price = findElement(WebElementsConstants.text_text_productPrice1).getText();
        clickToElement(WebElementsConstants.btn_productDetail);
        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.btn_addToBasket);
        Thread.sleep(2000);
        goToUrl("https://www.gittigidiyor.com/sepetim");
        String priceC = findElement(WebElementsConstants.text_price2).getText();

        if (price.equals(priceC)) {
            System.out.println("Ürün fiyatları eşit."+ price);
        } else {
            System.out.println("Ürün fiyatlarınız eşit değildir.");
        }

    }


    public void ürünEkle() throws InterruptedException {
        clickToElement(WebElementsConstants.btn_add);
        Thread.sleep(2000);
        String amount = findElement(WebElementsConstants.text_totalAmount).getText();
        String amountC= "Ürün Toplamı (2 Adet)";


        if(amount.equals(amountC)){
            System.out.println("Sepetinizdeki " + amount);
        }else{
            System.out.println("Sepetinizdeki ürün adedi farklıdır");
        }

    }


    public void ürünSil() throws InterruptedException {
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.btn_delete);
        Thread.sleep(2000);
    }


    public void sepetKontrol() throws InterruptedException {
        String basket = "Sepetinizde ürün bulunmamaktadır.";
        String basketC = findElement(WebElementsConstants.text_basketControl).getText();
        Thread.sleep(2000);

        if (basket.equals(basketC)) {
            System.out.println("Sepetinizde ürün bulunmamaktadır.");
        } else {
            System.out.println("Sepetiniz boş değildir.");
        }

    }


    public void exit(){
       driver.quit();

    }


}
