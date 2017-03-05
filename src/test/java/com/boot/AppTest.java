package com.boot;


import com.boot.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testApp() {

        HomeController homeController = new HomeController();
        String result =  homeController.home();
        assertEquals(result,"Das boot, reporting for duty!");
    }
}
