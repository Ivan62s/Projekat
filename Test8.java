import java.util.Scanner;

public class Test8 {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Unesite prvu broj: ");
        double a = in.nextInt();

        System.out.println("Unesite drugi broj: ");
        double b = in.nextInt();

        System.out.println("Unesite treci broj: ");
        double c = in.nextInt();

        System.out.println("Unesite cetvrti broj: ");
        double d = in.nextInt();

        Double artSredina = (a+b+c+d) / 4;
        
        System.out.println(artSredina);
        

    }
    
}
