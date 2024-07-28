package exercise1.proxy_Structural;

public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        // Simulate authentication. Replace with real authentication logic.
        return "admin".equals(username) && "password123".equals(password);
    }
}
