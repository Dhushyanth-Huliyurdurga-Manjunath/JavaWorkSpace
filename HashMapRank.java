import java.util.HashMap;
public class HashMapRank {
    public static void main(String[] args){
        HashMap<String, Integer> positionalRank = new HashMap<String, Integer>();
        positionalRank.put("International", 1); //Inserting data into HashMap
        positionalRank.put("National", 2);
        positionalRank.put("State", 3);

        System.out.println("Initial HashMap: "+positionalRank); //Listing the strings along with their ranks

//        fetches the record with key value "National"
        System.out.println("Value associated with the key \"National\": "+positionalRank.get("National"));

        positionalRank.remove("State"); //removes the entry with key value "State"

        System.out.println("HashMap after modification: "+positionalRank);
        System.out.println(positionalRank.size()); //returns the number of <key,value> pairs in the HashMap

        for(String i: positionalRank.keySet()){ //for each loop to iterate through the HashMap
            System.out.println("Key: "+i+" value: "+positionalRank.get(i));
        }
        System.out.println("Hash code of the HashMap: "+positionalRank.hashCode());
    }
}
