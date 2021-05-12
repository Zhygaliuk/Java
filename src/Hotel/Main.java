package Hotel;

public class Main {

    public static void main(String[] args){
        Hotel first_h = new Hotel();
        Hotel second_h = new Hotel(300,"Lviv", true,10);
        Hotel third_h = new Hotel(100,"ALE",150,100,"Lviv",true,12,2002,22);

        System.out.println(first_h);
        System.out.println(second_h);
        System.out.println(third_h);

        first_h.printNumberOfFloors();

        first_h.resetValues(20,"OLa",10,1000,"NOvovo",false,10,2000,29) ;

        System.out.println(first_h);
    }
}
