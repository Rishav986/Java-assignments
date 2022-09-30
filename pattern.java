public class pattern{
    public static void main(String[] args){

        // 1st Pattern

        for(int i=0; i<7; i++){
            for(int j = 7-i;j<7;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println(" ");
    
        // 2nd Pattern
        for(int i=0;i<7;i++){
            for(int j=0;j<=(7-i);j++){
                System.out.print(" ");
            }
            for(int j=7-i;j<=(7);j++){
                System.out.print("*");
            }            
            System.out.println("");

        }
        System.out.println("");

    }
}