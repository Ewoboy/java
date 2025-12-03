package pr18;

public class Task5 {
    public static void main(String[] args) {
        String key = null;

        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Key processed: " + key);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        key = "validKey";
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Key processed: " + key);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
