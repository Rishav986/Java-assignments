
import java.util.*;

public class armstrong_number{

    public static void armstrong(int n){
        
        int number = n;
        int cubic_sum = 0;

        while(n>0){
            int t = n%10;
            cubic_sum += Math.pow(t,3);
            n = n/10;
        }

        if(cubic_sum == number){
            System.out.println("Yes, this is an armstrong number!!");
        }

        else{
            System.out.println("No, this is not an armstrong number!!");

        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = sc.nextInt();

        armstrong(n);
    }
}