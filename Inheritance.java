import java.time.Year;

class SuperClass{ //Superclass
    protected Year currentYear = Year.now(); //attribute of superClass
    public void sayHello(){ //method of superClass
        System.out.print("Hello, ");
    }
}
public class Inheritance extends SuperClass{ //subclass inheriting 'SuperClass'
    public static void main(String[] args){
        Inheritance obj = new Inheritance(); //object of subclass

        obj.sayHello(); //subclass object accessing a method declared in the superclass
        System.out.println("Welcome to "+obj.currentYear); //subclass object accessing attribute of superclass
    }
}
