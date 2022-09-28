import java.util.*;

public class prime{

    public static void main(String[] args){

        // Take input from user.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = sc.nextInt(); 

        if (num<2){
            System.out.println("Not a prime number!!");
            // This statement will print that a number is not prime if it is less than 2.
        }
        else{

            for(int i=2;i<num;i++){
                if(num%i == 0){
                    System.out.println("Not a prime number!!");
                    return ;
                    // For any number i between 2 to num-1 (inclusive), if it divides the num then num
                    // is not a prime number.
                }

            }
            System.out.println("Prime Number!!");
        }
    }
}