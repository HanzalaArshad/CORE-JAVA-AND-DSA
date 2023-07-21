import java.sql.SQLOutput;
import java.util.Scanner;
public class UserAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(true){ //check if input exists or not
            System.out.println("ENTER NUMBER");
            int num = scn.nextInt();
            if(num >= 0){ //if input is positive or zero add it to the current sum
                sum += num;
            }
            else{
                sum = -1;//input is negative so change sum to -1 and break out of the loop
                break;
            }
        }
        System.out.print(sum);
    }
}