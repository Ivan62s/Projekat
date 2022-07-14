import java.util.Scanner;


public class Test {
    public static void main (String[] args){
    Scanner ivan = new Scanner(System.in);
        
    System.out.println("Unesite prvi broj: ");
    int x = ivan.nextInt();
       
    System.out.println("Unesite drugi broj: ");
    int y = ivan.nextInt();

    if(x>y){
        System.out.println("Veci je broj: " + x);
    }
    else{
        System.out.println("Veci je broj: " + y);
    }


    }
    
}
