import java.nio.ByteBuffer;
import java.lang.Object;

class MasterClass extends Object{ //Outer class
    String className = "Master";
    ByteBuffer buffer = ByteBuffer.allocate(10);
    public void bufferLimit(){
        System.out.println("Buffer limit: "+buffer.limit());
        System.out.println("Buffer capacity: "+buffer.capacity());
    }
    class SubClass{ //Inner class
        String currentClassName = "SubClass";
        public void sayHi(){
            System.out.println("Hi from the inner class!");
        }
    }
}
public class InnerClass {
    public static void main(String[] args){
        MasterClass object = new MasterClass();
        MasterClass.SubClass innerObject = object.new SubClass();
        innerObject.sayHi();
        System.out.println("Current Class Name:"+innerObject.currentClassName);

        System.out.println("Current Class Name: "+object.className);
        object.bufferLimit();
    }
}
