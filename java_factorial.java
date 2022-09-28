import java.util.*;

public class java_factorial{


    public static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }



    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = sc.nextInt();

        System.out.println("Factorial is: "+ factorial(n));

        

    }
}