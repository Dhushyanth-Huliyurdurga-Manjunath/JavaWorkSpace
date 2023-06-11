public class OopClassTwo {
    public static void main(String[] args){
        int currentYear = OopClassOne.whatYearIsIt(); /*method call without the need of an object
        as the method has been declared with the keyword static*/

        System.out.println("The current year is: "+currentYear);
    }
}
