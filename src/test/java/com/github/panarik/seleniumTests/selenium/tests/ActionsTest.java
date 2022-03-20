package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.tests.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsTest extends BaseTest {

    @Test
    public void goToStaff() {
        avito
                .getPage()
                .goToPersonalStaff();
    }

    @Test
    public void input() {
        avito
                .getPage() // Step 1: Open page 'avito.ru'.
                .search("test 123") // Step 2: Open page 'avito.ru'.
                .deleteAllFromSearchField(); // Step 3: delete all text from search field.
    }

    @Test
    public void actionContext() {
        controller.get("https://www.avito.ru");
        WebElement input = controller.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        Actions menu = new Actions(controller);
        menu
                .contextClick(input)
                .build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void actionMove() {
        controller.get("https://www.avito.ru");
        WebElement input = controller.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        Actions move = new Actions(controller);
        move.moveToElement(input);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void actionComplex() {
        controller.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        controller.manage().window().fullscreen();
        WebElement draggable = controller.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = controller.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(controller);
        action
                .moveToElement(draggable)
                .clickAndHold()
                .pause(Duration.ofSeconds(1))
                .moveToElement(droppable)
                .pause(Duration.ofSeconds(1))
                .release()
                .pause(Duration.ofSeconds(1))
                .keyDown(Keys.LEFT_CONTROL)
                .keyDown(Keys.LEFT_SHIFT)
                .keyUp(Keys.LEFT_CONTROL)
                .keyUp(Keys.LEFT_SHIFT)
                .build()
                .perform();
    }

}
