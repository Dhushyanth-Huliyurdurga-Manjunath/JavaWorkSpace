
public class Encapsulation extends Info{
    @Override
    public void practiceRequired() {
        System.out.println("Happy!");
    }
    public static void main(String[] args){
        Encapsulation obj1 = new Encapsulation();
        SupplyInfo obj2 = new SupplyInfo();
        obj2.practiceRequired();
        obj1.practiceRequired();
    }
}
