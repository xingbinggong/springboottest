package com.xingbg.springboottest;

import com.xingbg.springboottest.pojo.PersionProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private PersionProperties persionProperties;

    @Test
    void contextLoads() {
        System.out.println(persionProperties);
    }

}
