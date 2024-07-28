package exercise1.proxy_Structural;

public class AuthorizationService {
    public boolean authorize(String permission) {
        // Simulate authorization. Replace with real authorization logic.
        return "read".equals(permission) || "write".equals(permission);
    }
}
