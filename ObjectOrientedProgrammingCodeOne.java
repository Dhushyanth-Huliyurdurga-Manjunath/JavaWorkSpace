public class ObjectOrientedProgrammingCodeOne {
    String fruitName = "Watermelon"; //variable to store name of a fruit
    int fruitWeight = 20; //weight of the fruit in lbs
    double fruitAge = 1.2; //Age of the fruit in weeks

    public static void main(String[] args){
        ObjectOrientedProgrammingCodeOne obj = new ObjectOrientedProgrammingCodeOne(); /*creates an object for the
        specified class */

        //using the object 'obj' to access the properties of the class
        System.out.println("Displaying class properties using its object,");
        System.out.println("Name of the fruit: "+obj.fruitName);
        System.out.println("Weight of the fruit: "+obj.fruitWeight);
        System.out.println("Age of the fruit: "+obj.fruitAge);
    }
}
