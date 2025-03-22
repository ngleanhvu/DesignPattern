package org.ngleanhvu.creational.factory_method.test;

public abstract class AuthService {
    public abstract AuthProvider createAuthProvider();

    public void login() {
        AuthProvider authProvider = createAuthProvider();
        authProvider.authenticate();
    }
}
