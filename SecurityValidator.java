public class SecurityValidator {
    public boolean isValid(UserAccount user) {
        String password = user.getPassword();
        
        if (password == null || password.length() < 8) {
            return false;
        }
        
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
        }
        
        return hasDigit && hasUpperCase;
    }
}
