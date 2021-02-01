package com.digite.kata.workflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testWithJuniorWorker(){
        Manager manager = new Manager();
        manager.setWorker(new JuniorWorker());
        String work = manager.manage();
        Assertions.assertEquals("JuniorWorker Works", manager.manage());
    }

    @Test
    public void testWithSuperWorker(){
        Manager manager = new Manager();
        manager.setWorker(new SuperWorker());
        String work = manager.manage();
        Assertions.assertEquals("SuperWorker Works", manager.manage());
    }

    @Test
    public void testWithRobotWorker(){
        Manager manager = new Manager();
        manager.setWorker(new SuperWorker());
        String work = manager.manage();
        Assertions.assertEquals("SuperWorker Works", manager.manage());
    }
}
