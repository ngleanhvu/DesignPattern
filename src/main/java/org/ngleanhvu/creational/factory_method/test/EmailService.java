package org.ngleanhvu.creational.factory_method.test;

public class EmailService extends AuthService {
    @Override
    public AuthProvider createAuthProvider() {
        return new EmailProvider();
    }
}
