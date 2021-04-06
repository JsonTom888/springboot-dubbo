package com.jsontom.springbootconsumer;

import com.jsontom.sampleapi.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringbootConsumerApplication {

//    @Referen(url = "dubbo://192.168.122.1:20880/com.jsontom.sampleapi.service.IHelloService")
    @Reference
    private IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(){
        return args -> System.out.println(helloService.sayHello("jsontom"));
    }

}






