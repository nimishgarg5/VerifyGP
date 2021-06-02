package com.helper;

import org.openqa.selenium.WebDriver;

public class Initiallizer {
    private static WebdriverIitiallizer initialize;
    public Initiallizer(){


        initialize = WebdriverIitiallizer.getInstance();
    }

    public WebdriverIitiallizer get()
    {
        return initialize;
    }
}
