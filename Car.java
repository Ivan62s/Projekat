public class Car {
    int carAge;

    public Car(String name) {
        System.out.println("Name chosen is :" + name);
    }

    public void setAge(int age) {
        carAge = age;
    }

    public int getAge( ) {
        System.out.println("Car's age is :" + carAge);
        return carAge;
    }

    public static void main(String [] args) {
        Car bmw = new Car ( "BMW" );

        bmw.setAge( 2003 );

       bmw.getAge( );

        System.out.println("Variable Value :" + bmw.carAge );
    

    
        Car audi = new Car ("Audi");

        audi.setAge (2001);
        audi.getAge ( );
        System.out.println("Variable Value :" + audi.carAge);
    }
    
}
