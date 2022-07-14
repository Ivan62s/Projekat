public class SwitchStatement {
    
    public static void main (String[] args){
        char grade = 'D';

        switch(grade){
            case 'A' :
            System.out.println("Odlican 5, svaka cast");
            break;

            case 'B' :
            System.out.println("Vrlodobar 4, Moze bolje");
            break;

            case 'C' :
            System.out.println("Dobar 3, Bravo");
            break;

            case 'D' :
            System.out.println("Dovoljan 2, Vise se potrudi");
            break;

            default:
            System.out.println("Invalid grade");

        }

        System.out.println("Vasa ocena je " + grade);

    }

}
