public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num = 123456; // Replace with your desired number

        for (; num != 0; num /= 10, ++count) {
            // No body needed
        }

        System.out.println("Number of digits: " + count);
    }
}