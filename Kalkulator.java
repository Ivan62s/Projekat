public class Kalkulator {
    int num1;
    int num2;

    public Kalkulator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int saberi() {
        return num1 + num2;
    }

    public static void main(String[] args){
        Kalkulator k = new Kalkulator(3, 4);
        int rezultat = k.saberi();

        System.out.println(rezultat);
    }
    
}
