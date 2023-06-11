public class SumNTerms {
    public static void main(String[] args){
        int n = 5;
        int result = recursiveSum(n); //function call to the recursive function

        System.out.println("Sum up to "+n+" terms of natural numbers: "+result); //n(n+1)/2
    }
    public static int recursiveSum(int value) { //recursive function
        if (value == 0)
            return 0; //termination condition
        return value + recursiveSum(value - 1);
    }
}
