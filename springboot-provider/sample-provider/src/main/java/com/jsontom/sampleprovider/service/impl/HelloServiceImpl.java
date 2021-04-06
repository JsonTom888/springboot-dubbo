package com.jsontom.sampleprovider.service.impl;

import com.jsontom.sampleapi.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/6 20:52
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello,%s", serviceName, name);
    }
}
