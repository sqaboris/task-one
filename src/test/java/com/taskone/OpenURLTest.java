package com.taskone;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;


public class OpenURLTest {

    @Test
    public void openHomePageTest() {
        open("http://software-testing.ru/");
        assertEquals("Software-Testing.Ru", title());
    }
}