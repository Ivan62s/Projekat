import java.util.Scanner;

public class Test5 {
    public static void main (String[] args){
        System.out.println("Unesite broj od 1 do 5: ");
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        
        int zbir = 0;

        for(int x=0; x<=y; x++){
            zbir = zbir + x;
        }

        System.out.println(zbir);
    }
    
}
