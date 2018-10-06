import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Akash on 10/6/2018.
 */
public class IRCTCStub {
    static GenWrapper genWrapper;


    public static void main(String[] args) throws Exception {
        genWrapper.startBrowser("chrome","https://www.irctc.co.in/eticketing/userSignUp.jsf");
        genWrapper.inputById("userRegistrationForm:userName","iamakashrajasingh");
        genWrapper.inputById("userRegistrationForm:password","myPassword");
        genWrapper.inputById("userRegistrationForm:confpasword","myPassword");
        genWrapper.selectById("userRegistrationForm:securityQ","1");
        genWrapper.inputById("userRegistrationForm:securityAnswer","Akash");
        genWrapper.selectById("userRegistrationForm:prelan","en");
        genWrapper.inputById("userRegistrationForm:firstName","Akash");
        genWrapper.inputById("userRegistrationForm:middleName","Raja Singh");
        genWrapper.inputById("userRegistrationForm:lastName","M");
        genWrapper.clickById("userRegistrationForm:gender:0");
        genWrapper.clickById("userRegistrationForm:maritalStatus:1");
        genWrapper.selectById("userRegistrationForm:dobDay","10");
        genWrapper.selectById("userRegistrationForm:dobMonth","09");
        genWrapper.selectById("userRegistrationForm:dateOfBirth","1997");
        genWrapper.selectById("userRegistrationForm:occupation","5");
        genWrapper.inputById("userRegistrationForm:uidno","000000000000");
        genWrapper.inputById("userRegistrationForm:idno","0000000000000");
        genWrapper.selectById("userRegistrationForm:countries","94");
        genWrapper.inputById("userRegistrationForm:email","iamakashrajasingh@gmail.com");
        genWrapper.scroll(0,1000);
        genWrapper.inputById("userRegistrationForm:mobile","8678939278");
        genWrapper.selectById("userRegistrationForm:nationalityId","94");
        genWrapper.inputById("userRegistrationForm:address","1995");
        genWrapper.inputById("userRegistrationForm:street","TNHB");
        genWrapper.inputById("userRegistrationForm:area","Ayapakkam");
        genWrapper.inputById("userRegistrationForm:pincode","600077");
        genWrapper.pause(1000);
        genWrapper.clickById("userRegistrationForm:statesName");
        genWrapper.pause(1000);
        genWrapper.selectById("userRegistrationForm:cityName","Tiruvallur");
        genWrapper.selectById("userRegistrationForm:postofficeName","Ayapakkam B.O");
        genWrapper.inputById("userRegistrationForm:landline","8678939278");
        genWrapper.scroll(0,500);
        genWrapper.clickById("userRegistrationForm:resAndOff:0");






    }
}
