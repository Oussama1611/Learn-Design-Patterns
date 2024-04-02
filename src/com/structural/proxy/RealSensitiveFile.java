package com.structural.proxy;

public class RealSensitiveFile implements SensitiveFile {

    @Override
    public void request(String file) {
        System.out.println("File" + file + " opened");
    }
}
