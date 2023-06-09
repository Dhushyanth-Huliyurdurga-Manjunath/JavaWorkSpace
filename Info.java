abstract class Info{
    public String myDreamCompany = "Google";
    public int yearOfJoining = 2024;
    public abstract void practiceRequired();
}

class SupplyInfo extends Info {
    public void practiceRequired(){
        System.out.println("I got into my Dream company " + obj.myDreamCompany + " in the year " + obj.yearOfJoining);
    }
}