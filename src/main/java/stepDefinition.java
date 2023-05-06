import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

    @Given("^Amazon sitesine git$")
    public void amazon_sitesine_git() throws Throwable {
        System.out.println("Siteye gidildi");
    }

    @Given("^login butonuna tikla$")
    public void login_butonuna_tikla() throws Throwable {

        System.out.println("Loggin yapildi");

    }

    @Given("^Isim gir$")
    public void isim_gir() throws Throwable {
        System.out.println("Isim girildi ");
    }

    @Given("^Sifre gir$")
    public void sifre_gir() throws Throwable {
        System.out.println("Sifre girildi ");
    }

    @When("^submit butonuna tiklandiginda$")
    public void submit_butonuna_tiklandiginda() throws Throwable {
        System.out.println("Submit butonuna tiklandiginda ");
    }

    @Then("^success mesajini verify et$")
    public void success_mesajini_verify_et() throws Throwable {
        System.out.println("Basarili giris! ");
    }

}
