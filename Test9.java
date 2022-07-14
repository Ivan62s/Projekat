

public class Test9 {
    public static void main (String args[]){
        String [] imena = {"Nemanja", "Mila", "Nikola", "Ivana", "Aleksandar"};
        String najduzeIme = "";

        for (String ime : imena){
            if(ime.length() > najduzeIme.length()){
                najduzeIme = ime;
            }
        }
        System.out.println(najduzeIme);
    }
    
}
