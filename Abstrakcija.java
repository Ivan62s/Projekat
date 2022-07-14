abstract class Animalz {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pigz extends Animalz {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

public class Abstrakcija {
    public static void main(String[]args) {

        Pigz myPigz= new Pigz();
        myPigz.animalSound();
        myPigz.sleep();
    }
    
}
