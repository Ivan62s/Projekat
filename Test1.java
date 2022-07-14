import java.util.Scanner;

public class Test1 {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int x = in.nextInt();

        System.out.println("Unesite drugi broj: ");
        int y = in.nextInt();

        if (x<100){
            if (y>100){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        
        }
            else{
            System.out.println("FALSE");
        }    



    }
    
}
