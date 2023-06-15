import javax.swing.*; //swing package to provide GUI components to the application
public class HelloWord {
    //class name has to be same as the file name
    public static void main(String[] args){
        //Prints Hello World on the screen
        System.out.println("Hello World!");
        JFrame frame = new JFrame( "Hello, Java!" ); //Represents a window in the application
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER ); //Text label contained in the container
        frame.add(label);
        frame.setSize( 1440, 900 );
        frame.setVisible( true ); //window visibility
    }
}
