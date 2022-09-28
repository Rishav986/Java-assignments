import java.util.*;

public class palindrome{

    public static void main(String[] args){

        // Take input from user.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String str = sc.nextLine();
        int n = str.length();

        for(int i=0;i<n;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                continue;
            }
            else{
                System.out.println("Not a Palindrome!!");
                return ;
            }

        }

        System.out.println("It's a Palindrome!!");

        
        
    }
}