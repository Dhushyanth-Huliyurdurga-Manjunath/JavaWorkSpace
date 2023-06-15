class City{
    City(String name, String code){
        this(name); //calls the Constructor "City(String name)"
        System.out.println("City Code:"+code);
    }
    City(String name){
        this(); //calls the Constructor "City()"
        System.out.println("City Name: "+name);
    }
    City(){
        System.out.println("Chain Constructors example.");
    }
}

public class ChainConstructors extends City{
    ChainConstructors(String name, String areaCode){ //Constructor
        super(name, areaCode); //Calls the base class's constructor "City(String name, String code)"
        System.out.println("End-of-Code");
    }
    static public ChainConstructors getInstance(){
        
    }
    public static void main(String[] args){
        new ChainConstructors("Arlington", "817");
    }
}