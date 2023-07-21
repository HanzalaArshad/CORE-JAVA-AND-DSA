import java.util.Scanner;

public class HoloPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int r = sc.nextInt();
        System.out.println("ENTER COLUMNS");
        int c= sc.nextInt();
        for (int i = 1; i <= r; i++) {
            // Print spaces before stars
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for(int i=1;i<=r;i++){
                for(int j=1;j<=r-1;j++){
                    System.out.print(" ");
                }
                }
            }
    }
}
