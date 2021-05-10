package Hotel;

public class Hotel {
    private int number_of_visitors;
    private String name;
    private int number_of_rooms;

    private int price_of_rooms;
    private String location;
    private boolean availability_of_a_restaurant;
    private int number_of_deluxe_rooms;

    private static int number_of_floors;

    protected int year_of_construction;
    protected int number_of_employees;

    public Hotel(){};



    public Hotel (int price_of_rooms,String location,boolean availability_of_a_restaurant,int number_of_deluxe_rooms){
        this.price_of_rooms=price_of_rooms;
        this.location=location;
        this.availability_of_a_restaurant=availability_of_a_restaurant;
        this.number_of_deluxe_rooms=number_of_deluxe_rooms;
    }
    public Hotel(int number_of_visitors,String name,int number_of_rooms,int price_of_rooms,String location,boolean availability_of_a_restaurant,
                 int number_of_deluxe_rooms,int year_of_construction,int number_of_employees){
        this(price_of_rooms,location,availability_of_a_restaurant,number_of_deluxe_rooms);
        this.number_of_visitors=number_of_visitors;
        this.name=name;
        this.number_of_rooms=number_of_rooms;
        this.year_of_construction=year_of_construction;
        this.number_of_employees=number_of_employees;
    }
    @Override
    public String toString(){
        return"Hotel changed\nЭ"
                +"number_of_visitors:"+number_of_visitors
                +"\n name:"+name
                +"\n number_of_rooms:"+number_of_rooms
                +"\n price_of_rooms:"+price_of_rooms
                +"\n location:"+location
                +"\n availability_of_a_restaurant:"+availability_of_a_restaurant
                +"\n number_of_deluxe_rooms "+number_of_deluxe_rooms
                +"\n year_of_construction"+year_of_construction
                +"\n number_of_employees"+number_of_employees;
    }
    public static void printStaticHotelNumberOfFloors(){
        System.out.println("\nStaticHotelNumberOfFloors"+number_of_floors);
    }
    public void printNumberOfFloors(){
        System.out.println("\nNumberOfFloors"+number_of_floors);
    }
    public void resetValues (int number_of_visitors,String name,int number_of_rooms,int price_of_rooms,String location,boolean availability_of_a_restaurant,
                 int number_of_deluxe_rooms,int year_of_construction,int number_of_employees) {
        this.number_of_visitors = number_of_visitors;
        this.name = name;
        this.number_of_rooms = number_of_rooms;
        this.year_of_construction = year_of_construction;
        this.number_of_employees = number_of_employees;
        this.price_of_rooms = price_of_rooms;
        this.location = location;
        this.availability_of_a_restaurant = availability_of_a_restaurant;
        this.number_of_deluxe_rooms = number_of_deluxe_rooms;
    }
    public int getPrice_of_rooms(){
        return price_of_rooms;
    }
    public void setPrice_of_rooms(int price_of_rooms){
        this.price_of_rooms=price_of_rooms;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public  boolean isAvailability_of_a_restaurant(){
        return availability_of_a_restaurant;
    }
    public void setAvailability_of_a_restaurant(boolean availability_of_a_restaurant){
        this.availability_of_a_restaurant=availability_of_a_restaurant;
    }
    public int getNumber_of_deluxe_rooms(){
        return number_of_deluxe_rooms;
    }
    public void setNumber_of_deluxe_rooms(int number_of_deluxe_rooms){
        this.number_of_deluxe_rooms=number_of_deluxe_rooms;
    }

}
