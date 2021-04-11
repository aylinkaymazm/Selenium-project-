import org.junit.Test;

public class TestCases extends TestSteps {

    @Test
    public void adToBasketTest() throws InterruptedException {
        anasayfa();
        giris();
        ara();
        ikinciSayfa();
        sepeteEkle();
        ürünEkle();
        ürünSil();
        sepetKontrol();
        exit();
    }
}
