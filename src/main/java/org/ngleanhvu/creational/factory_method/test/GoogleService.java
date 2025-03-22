package org.ngleanhvu.creational.factory_method.test;

public class GoogleService extends AuthService {
    @Override
    public AuthProvider createAuthProvider() {
        return new GoogleProvider();
    }
}
