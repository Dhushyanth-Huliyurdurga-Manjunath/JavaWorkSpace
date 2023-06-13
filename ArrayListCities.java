import java.util.ArrayList;

public class ArrayListCities{
    public static void main(String[] args){
        ArrayList<String> city = new ArrayList<String>();

        city.add("Boston");
        city.add("New York");
        city.add("New Jersey");

        for(int i = 0; i < city.size(); i++){
            System.out.println(city.get(i)); //using the get method to print out the elements at index 'i'
        }

        city.set(0, "California"); //replaces the element at index '0' with California
        city.remove("New Jersey"); //Removes the element from the arraryList

        System.out.println("\nArray List after modification");
        for(String i: city){ //for each loop to iterate through the loop
            System.out.println(i); 
        }

        System.out.println("\nArray List after using \".clear\"");
        city.clear();
        System.out.println(city);
    }
}