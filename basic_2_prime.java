import java.util.*;

public class basic_2_prime{



    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is prime or not: ");

        int n = sc.nextInt();

        if (n==0 || n==1){
            System.out.println("Not Prime");
            return ;           
        }

        for(int i=2;i<n;i++){
            if (n%i==0){
                System.out.println("Not Prime");
                return ;
            }

        }

        System.out.println("Prime");




    }
}