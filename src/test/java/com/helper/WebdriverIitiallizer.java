package com.helper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        public class WebdriverIitiallizer {
            private static WebDriver driver;
            private static WebdriverIitiallizer instance;

            private WebdriverIitiallizer()
            {
                if(driver == null)
                driver=initializeWebdriver();
            }

            WebDriver initializeWebdriver()
            {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver= new ChromeDriver();
                return driver;
            }

            public WebDriver getDriver() {
                return driver;
            }

            public void setDriver(WebDriver driver) {
                this.driver = driver;
            }

            public static WebdriverIitiallizer getInstance(){
                if( null == instance)
                {
                    return new WebdriverIitiallizer();
                }
                else
                {
                    return instance;
                }

            }
        }


