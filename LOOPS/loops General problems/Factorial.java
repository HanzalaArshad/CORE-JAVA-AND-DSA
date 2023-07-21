import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER FOR FACTORIAL");
        int fact=sc.nextInt();
        int ans=1;
        for(int i=2;i<=fact;i++){
            ans*=i;

        }
        System.out.println(ans);
    }
}
