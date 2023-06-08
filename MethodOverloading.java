public class MethodOverloading {
    public static void main(String[] args){
        //method overloading: methods having same name but differ in their parameters
        int x = 10;
        int y = 20;
        int intResult = findSum(x, y); //invokes function 1 as the parameters are of type integer

        System.out.println(intResult); //30

        double u = 10.0d;
        double v = 20.0d;
        double doubleResult = findSum(u, v); //invokes function 2 as the parameters are of type double

        System.out.println(doubleResult); //30.0
    }
    static int findSum(int a, int b){ //function 1 (for reference purpose)
        return a+b; //returns their integer sum
    }

    static double findSum(double a, double b){ //function 2 (for reference purpose)
        return a+b; //returns their decimal sum
    }
}
