package org.example.service.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerTest {

    @Autowired
    private Customer customer;

//    @Test
//    public void testRece() {
//        customer.receivel();
//    }
}
