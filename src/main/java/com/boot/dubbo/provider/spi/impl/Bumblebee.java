package com.boot.dubbo.provider.spi.impl;

import com.boot.dubbo.provider.spi.Robot;

public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}