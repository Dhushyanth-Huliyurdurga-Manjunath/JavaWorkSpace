public class CourseWork {
    public CourseWork(String courseOne, String courseTwo){ //Constructor 1 (for reference)
        System.out.println("Courses for fall 2023 are "+courseOne+" and "+courseTwo);
    }

    int totalCredits; //Attribute of the class CourseWork
    public CourseWork(int creditOne, int creditTwo){ //Constructor 2 (for reference)
        totalCredits = creditOne+creditTwo;
        System.out.println("Total Number of credits for fall 2023 is: "+totalCredits);
    }

    public static void main(String[] args){
        CourseWork objOne = new CourseWork("DSA", "OOP"); //Call to constructor 1 with parameters of type String
        CourseWork ObjTwo = new CourseWork(3, 3); //Call to constructor 2 with integer parameters
    }
}
