package com.github.panarik.seleniumTests.selenium.controller.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.github.panarik.seleniumTests.selenium.controller.Controller.getWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * This class created only for waiter examples.
 */
public class WaitExamples {

    private WebElement element; //ToDo: Need for specify.
    private List<WebElement> elements; //ToDo: Need for specify.
    private static final By locator = By.xpath("some xPath");

    private void waitersExample() {

        WebDriverWait wait = getWait();

        // Attribute
        wait.until(attributeContains(element, "id", "contains some"));
        wait.until(attributeToBe(element, "id", "be some"));
        wait.until(attributeToBeNotEmpty(element, "id"));

        // Behaviour
        wait.until(elementToBeSelected(element));
        wait.until(elementToBeClickable(element));

        // Invisibility
        wait.until(invisibilityOf(element));
        wait.until(invisibilityOfAllElements(elements));
        wait.until(invisibilityOfElementLocated(locator));
        wait.until(invisibilityOfElementWithText(locator, "some text"));

        // Visibility
        wait.until(visibilityOf(element));
        wait.until(visibilityOfAllElements(elements));
        wait.until(visibilityOfElementLocated(locator));

        // Not
        wait.until(not(titleIs("some title")));

        // Quantity
        wait.until(numberOfElementsToBe(locator, 5));
        wait.until(numberOfElementsToBeLessThan(locator, 10));
        wait.until(numberOfElementsToBeMoreThan(locator, 3));

        // Appear
        wait.until(presenceOfElementLocated(locator)); //element appear on DOM
        wait.until(presenceOfAllElementsLocatedBy(locator)); //element appear on web page

        // Disappear
        wait.until(stalenessOf(element));

        // Have text
        wait.until(textToBe(locator, "some text")); //exact text
        wait.until(textToBePresentInElement(element, "some text")); //contains text
        wait.until(textToBePresentInElementValue(element, "some text")); // text in attributes

        // page titles
        wait.until(titleIs("some text")); //exact text
        wait.until(titleContains("some text")); //contains text

        // URL
        wait.until(urlToBe("URL")); //exact URL
        wait.until(urlContains("someText")); // URL contains text
        wait.until(urlMatches("s.e r.x")); //use regex
    }

}
