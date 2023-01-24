public class ValidateUtils {

    public static String validateStringCarParameter(String value) {
        if (value.isBlank() || value.isEmpty() || value == null) {
            return "default";
        } else {
            return value;
        }
    }

    public static double validateDoubleCarParameter(double value) {
        if (value <= 0) {
            return 1.5;
        } else {
            return value;
        }
    }
}
