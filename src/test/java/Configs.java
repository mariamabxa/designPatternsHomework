import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Configuration.*;

public class Configs {
    @BeforeTest
    public void setUp(){
        startMaximized = true;
        timeout=10000;
        holdBrowserOpen=false;
    }
}
