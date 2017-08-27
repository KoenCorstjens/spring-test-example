package eu.corstjens.example.spring.test;


import eu.corstjens.example.spring.test.config.ConfigurationExample;
import eu.corstjens.example.spring.test.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigurationExample.class)
public class ExampleTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void test() {
        System.out.println(helloService.sayHello());
    }

}
