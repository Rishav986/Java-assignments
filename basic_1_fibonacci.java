import java.util.*;

public class basic_1_fibonacci{

    public static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }


    public static void main(String[] args){
        // System.out.println("Hi");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to get fibonacci series upto that number: ");

        int n = sc.nextInt();

        int s = 0;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=fib(i);

        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");

        }

    }
}