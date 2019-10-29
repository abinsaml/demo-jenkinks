package com.jenkins.example.demojenkinks;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoJenkinksApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(DemoJenkinksApplicationTests.class);
    @Test
     contextLoads() {
        logger.info("Testcase executing..........++++++++++++");
        logger.info("Testcase executing second time..........++++++++++++");

        assert true;
    }



}
