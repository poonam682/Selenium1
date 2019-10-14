import com.stepdefination.webdriverclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

com.stepdefination.webdriverclass webdriverclass = new webdriverclass();

@Before
    public void open_Browser() throws IOException {
    webdriverclass.openbrowser();
}

@After
    public void close_Browser(){

    webdriverclass.closebrowser();
}

}
