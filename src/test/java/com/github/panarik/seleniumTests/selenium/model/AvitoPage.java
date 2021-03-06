package com.github.panarik.seleniumTests.selenium.model;

import com.github.panarik.seleniumTests.selenium.model.base.BasePage;
import com.github.panarik.seleniumTests.selenium.model.base.WebItem;

public class AvitoPage extends BasePage {

    public String URL = "https://www.avito.ru";
    private final WebItem CATEGORY_ROOT = new WebItem("Category menu item", "//select[@id='category']");
    private final WebItem CATEGORY_TRANSPORT = new WebItem("Transport category", "//select[@id='category']//option[text()='Транспорт']");
    private final WebItem PERSONAL_STAFF = new WebItem("Personal staff category", "//a[text()='Личные вещи']");
    private final WebItem SEARCH = new WebItem("Search field", "//input[@data-marker='search-form/suggest']");

    /**
     * choose category: 'Transport'.
     */
    public void goToTransport() {
        click(CATEGORY_ROOT);
        click(CATEGORY_TRANSPORT);
    }

    /**
     * open page 'avito.ru'.
     * @return can use next method from {@link AvitoPage}.
     */
    public AvitoPage getPage() {
        super.getPage("https://www.avito.ru");
        return this;
    }

    /**
     *
     * @return can use next method from {@link AvitoPage}.
     */
    public AvitoPage goToPersonalStaff() {
        click(PERSONAL_STAFF);
        return this;
    }

    /**
     *
     * @param line
     * @return can use next method from {@link AvitoPage}.
     */
    public AvitoPage search(String line) {
        super.search(SEARCH, line);
        return this;
    }

    /**
     *
     * @return can use next method from {@link AvitoPage}.
     */
    public AvitoPage deleteAllFromSearchField() {
        deleteAll(SEARCH);
        return this;
    }

    /**
     *
     * @return can use next method from {@link AvitoPage}.
     */
    public AvitoPage contextClickSearch() {
        contextClick(SEARCH);
        return this;
    }

    /**
     * Move cursor to the search field.
     *
     * @return can use next method from {@link AvitoPage}.
     */
    public AvitoPage moveToSearch() {
        hoverItem(SEARCH);
        return this;
    }
}
