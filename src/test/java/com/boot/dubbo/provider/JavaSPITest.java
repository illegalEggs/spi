package com.boot.dubbo.provider;

import com.boot.dubbo.provider.spi.Robot;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class JavaSPITest {

    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        for (Robot rt:serviceLoader ) {
            rt.sayHello();
        }
    }
}