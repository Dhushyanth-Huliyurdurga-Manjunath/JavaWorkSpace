public class StaticAndPublicMethods {
    static void staticMethod(){ //statically defined method
        System.out.println("Executing block of a static method.");
    }

    public void publicMethod(){ //publicly defined method
        System.out.println("Executing block of a public method.");
    }

    public static void main(String[] args){
        staticMethod(); //static methods can be called without the need of an object

        StaticAndPublicMethods obj = new StaticAndPublicMethods(); //object creation
        obj.publicMethod(); //public methods need an object inorder to be invoked/accessed
    }
}
