package com.boot.dubbo.provider;


import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.boot.dubbo.provider.spi.Robot;
import org.junit.jupiter.api.Test;

public class DubboSPITest {

    @Test
   public void sayHello(){

        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
//        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
//        optimusPrime.sayHello();
    }
}
