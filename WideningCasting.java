public class WideningCasting {
    public static void main(String[] args){
        int intValue = 43;
        double doubleValue = intValue; //Widening Casting; Converting a smaller type to a larger type (int -> double)

        System.out.println(intValue); // 43
        System.out.println(doubleValue); //43.0
    }
}
