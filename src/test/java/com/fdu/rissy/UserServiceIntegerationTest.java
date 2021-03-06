package com.fdu.rissy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lins13 on 4/28/17.
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MocksApplication.class)
public class UserServiceIntegerationTest {

    @Autowired
    private UserService userService;

    @Autowired
    private NameService nameService;

    @Test
    public void test_spring() {
        Mockito.when(nameService.getUserName("SomeId")).thenReturn("Mock user name");
        String testName = userService.getUserName("SomeId");
        Assert.assertEquals("Mock user name", testName);
    }
}
