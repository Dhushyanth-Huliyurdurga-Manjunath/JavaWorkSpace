class City{
    City(String name, String Code){
        this(name);
        System.out.println("City Code:"+Code);
    }
    City(String name){
        this();
        System.out.println("City Name: "+name);
    }
    City(){
        System.out.println("Chain Constructors example.");
    }
}

public class ChainConstructors{
    public static void main(String[] args){
        new City("Arlington", "817");
    }
}