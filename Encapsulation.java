
public class Encapsulation extends Info{
    @Override
    public void practiceRequired() {
        System.out.println("Happy!");
    }
    public static void main(String[] args){
        Encapsulation obj2 = new Encapsulation();
        obj2.practiceRequired();
    }
}
