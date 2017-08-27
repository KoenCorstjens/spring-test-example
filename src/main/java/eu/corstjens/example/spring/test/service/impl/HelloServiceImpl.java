package eu.corstjens.example.spring.test.service.impl;

import eu.corstjens.example.spring.test.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {

        return "Hello World";
    }
}
