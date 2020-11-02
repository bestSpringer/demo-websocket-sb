package org.example.service.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProviderTest {

    @Autowired
    private Provider provider;

    @Test
    public void testSendHello() {
        provider.sendHello();
    }

    @Test
    public void testWork() {
        provider.sendWork();
    }

    @Test
    public void testFanout() {
        provider.sendFanout();
    }

    @Test
    public void testDirect() {
        provider.sendDirect();
    }

    @Test
    public void testTopic() {
        provider.sendTopic();
    }
}
