package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

//import static javax.swing.text.html.MinimalHTMLWriter.css;

public class contactUs_Page extends AbstractClass{

    WebDriver driver ;

    public contactUs_Page(){


        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//a[@title='Contact Us']")

    private WebElement contactUsButton;


    public  void clickContactUsButton(){

        clickFunction(contactUsButton);
    }

    @FindBy(name="id_contact")
    private WebElement subjectHeadingDropDown ;

    public void selectFromDropdown(){

        selectElementFromDropdown(subjectHeadingDropDown,"Webmaster");

    }

    private void selectElementFromDropdown(WebElement subjectHeadingDropDown, String webmaster) {
    }

    @FindBy(id="email")
    private WebElement emailTextArea;

    public void typeEmail(){

        sendKeysFunction(emailTextArea,"sksjaf@gmail.com");
    }

    @FindBy(name="id_order")
    private WebElement order ;

    public void typeOrderReference(){

        sendKeysFunction(order,"sgf1254");

    }

    @FindBy(css="p.alert-success")

   private WebElement successMessage ;

    public void assertMyMessage(){

        Assertion(successMessage, "great");


    }




    }

