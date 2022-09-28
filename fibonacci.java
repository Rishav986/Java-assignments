import java.util.*;

public class fibonacci{

// Function to calculate fibonacci series.
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
            // recursion call
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total numbers of fibonacci series:");
        int n = sc.nextInt();

        // To store fibonacci series elements.
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = fib(i);
            // This will add fibonacci value for each i into arr.
        }

// To print every element of fibonacci series present in arr.
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}