import java.util.*;
public class StaticInitializerBlock  {
    public static boolean flag = false;
    public static int B;
    public static int H;
    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        if(B > 0 && H > 0)
            flag = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    StaticInitializerBlock  obj = new StaticInitializerBlock ();
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class


