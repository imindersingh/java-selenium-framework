package com.imindersingh.pages;

import com.imindersingh.driver.Driver;
import org.openqa.selenium.By;

public class Banner {

    private final By banner = By.id("Containercomp-jdpppire");
    private final By closeButton = By.className("_1RsPI");
    private final By emailInput = By.name("email");
    private final By submitButton = By.cssSelector("#comp-kvk9iyo3 button");

    public HomePage clickCloseButton() {
        Driver.webDriver.findElement(closeButton).click();
        return new HomePage();
    }
}
