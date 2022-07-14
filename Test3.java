import java.util.Scanner;

public class Test3 {
    public static void main (String [] args){
      Scanner in = new Scanner (System.in);

      System.out.println("Unesite ocenu: ");
      int x = in.nextInt();

       switch(x){

        case 5:
        System.out.println("Odlican");
        break;

        case 4:
        System.out.println("Vrlo dobar");
        break;

        case 3:
        System.out.println("Dobar");
        break;

        case 2:
        System.out.println("dovoljan");
        break;

        case 1:
        System.out.println("Nedovoljan");
        break;

        default:
        System.out.println("Invalid grade");

       
     }


    }
    
}
