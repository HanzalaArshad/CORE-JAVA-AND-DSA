public class Pattern1{
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("*"); // Use print instead of println to print asterisks on the same line
            }
            System.out.println(); // Move this line outside the inner loop to start a new line after printing each row
        }
    }
}

