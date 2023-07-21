
import java.util.Scanner;

public class NumbersPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // Print spaces before stars
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k =1 ; k <= i; k++) {
                System.out.print(k);
            }
            for (int l=i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }


    }
    }
