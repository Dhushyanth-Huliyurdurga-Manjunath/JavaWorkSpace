public class NarrowingCasting {
    public static void main(String[] args){
        double doubleValue = 43.0;
        int intValue = (int) doubleValue; //narrowing casting, converting larger type to a smaller type (double -> int)

        System.out.println(intValue); //43
        System.out.println(doubleValue); //43.0
    }
}
