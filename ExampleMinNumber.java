public class ExampleMinNumber {

    public static void main(String[] args){
        int a = 11;
        int b = 6;
        int c = 8;
        int d = 3;
        int e = minFunction(a,b);
        int f = minFunction(c,d);
        int g = minFunction(e,f);
        System.out.println("Minimum Value = " +e);
    }
        public static int minFunction(int n1, int n2) {
            int min;
            if (n1 > n2){

            min = n2;
            }
            else{

            min=n1;
            }
            return min;
        }
    
    
}
