import java.util.Scanner;
public class Powers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Scanner object to receive input from user
        System.out.println("Enter numbers one in each line.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = power(number1, number2); //method call with parameters
        System.out.println(number1 +" Power "+number2+" is: "+result);
    }
    static int power(int num1, int num2){ //method to calculate powers
        int result = 1;
        for(int i = 0; i <= num1; i++) result *= num1;
        return result;
    }
}
