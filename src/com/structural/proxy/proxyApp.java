package com.structural.proxy;

public class proxyApp {
    public static void main(String[] args) {
        RealSensitiveFile file = new RealSensitiveFile();
        ProtectionProxy proxy = new ProtectionProxy(file, "user", "admin");

        proxy.request("classified.txt");

        ProtectionProxy proxy2 = new ProtectionProxy(file, "admin", "password");

        proxy2.request("classified.txt");
    }
}
