package com.structural.proxy;

public class ProtectionProxy implements SensitiveFile{
    private final SensitiveFile realSensitiveFile;
    private final AuthenticationService authenticationService;
    private final String user;
    private final String password;

    public ProtectionProxy(SensitiveFile realSensitiveFile, String user, String password) {
        this.realSensitiveFile = realSensitiveFile;
        this.authenticationService = new AuthenticationService();
        this.user = user;
        this.password = password;
    }

    @Override
    public void request(String file) {
        // authenticate first
        if(authenticationService.authenticate(user, password))
            realSensitiveFile.request(file);
        else
            System.out.println("Bad Credentials");
    }


}
