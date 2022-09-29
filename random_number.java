import java.util.Random;

public class random_number{
    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt();

        // Generate random number within a range
        int a = random.nextInt(50); // It will generate random no. from 0 to 49 inclusive

        double c = random.nextDouble();

        double d = random.nextDouble(100);

        System.out.println(x);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);


    }
}