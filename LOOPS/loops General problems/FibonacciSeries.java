import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIBONACCI SERIES NO");
        int fib= sc.nextInt();
        for(int i=1; i<=fib;i++){
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
        }


    }
}
