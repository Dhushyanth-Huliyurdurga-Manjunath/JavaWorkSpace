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
public class ChainConstructors extends City{ //Inheritance from class "City"
    static ChainConstructors instance = null;
    public int a = 0;
    ChainConstructors(){}
    ChainConstructors(String name, String areaCode){ //Constructor
        super(name, areaCode); //Calls the base class's constructor "City(String name, String code)"
        System.out.println("End-of-Code");
    }
    static public ChainConstructors getInstance(){ //singleton constructor: at any time there can only be one object for this class
        if(instance == null){
            instance = new ChainConstructors();
        }
        return instance;
    }
    public static void main(String[] args){
        new ChainConstructors("Arlington", "817");
        ChainConstructors object1 = ChainConstructors.getInstance();
        ChainConstructors object2 = ChainConstructors.getInstance();
        object1.a += 10; //object 1's attribute modification 
        System.out.println("Accessing attribute from \"Object1\": "+object1.a);
        System.out.println("Accessing attribute from \"Object2\": "+object2.a); //even object 2 accesses the same value as object 1 
    }
}